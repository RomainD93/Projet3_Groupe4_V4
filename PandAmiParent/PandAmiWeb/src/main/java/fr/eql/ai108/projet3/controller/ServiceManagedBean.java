package fr.eql.ai108.projet3.controller;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.MatchMode;


import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.Litige;
import fr.eql.ai108.projet3.entity.Materiel;
import fr.eql.ai108.projet3.entity.ReponseService;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;
import fr.eql.ai108.projet3.entity.TypeLitige;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.ibusiness.LitigeIBusiness;
import fr.eql.ai108.projet3.ibusiness.ServiceIBusiness;

@ManagedBean(name = "mbService")
@SessionScoped
public class ServiceManagedBean {

	private List<Service> services = new ArrayList<Service>();
	private List<TypeAide> typesAide = new ArrayList<TypeAide>();
	private List<Materiel> materiels;

	private CategorieAide categorieSelected;
	private Long numServices;
	private Service service = new Service();
	private TypeAide typeAideSelected;
	private String message;
	private Materiel materielSelected;
	private Map<Integer, List<TypeAide>> mapTypesAide = new HashMap<Integer, List<TypeAide>>();

	private Litige litige = new Litige();
	private TypeLitige selectedTypeLitige;
	
	private Utilisateur volontaire = new Utilisateur();

	private ReponseService reponseService = new ReponseService();
	private ReponseService reponseServiceSelected = new ReponseService();
	private Service serviceSelected;
	private Service detailService;
	//Liste service
	private List<Service> serviceBeneficiaire;
	private List<Service> serviceVolontaire;
	private List<Service> servicesPref;
	private List<Service> servicesTermine;

	//Filtrage de la liste
	private List<FilterMeta> filterBy;
	private List<Service> filteredServices;

	//Categorie __ Type Aide
	private List<CategorieAide> categoriesAide;
	private List<TypeAide> typesAideCat1;
	private List<TypeAide> typesAideCat2;
	private List<TypeAide> typesAideCat3;
	private List<TypeAide> typesAideCat4;
	private List<TypeAide> typesAideCat5;
	private List<TypeAide> typesAideCat6;
	private List<TypeAide> typesAideCat7;
	private List<TypeAide> typesAideCat8;
	private List<TypeAide> typesAideCat9;
	private List<TypeAide> typesAideCat10;
	private List<TypeAide> typesAideCat11;

	private List<TypeLitige> typesLitige;

	@ManagedProperty (value = "#{mbCompte.utilisateur}")
	private Utilisateur userConnected;

	@EJB
	private ServiceIBusiness proxyServiceBu;

	@EJB
	private LitigeIBusiness proxyLitigeBu;

	// INITIALISATION DES LISTES AND CO

	@PostConstruct
	public void init (){

		services = proxyServiceBu.displayService(userConnected);
		//System.out.println("services" + services);
		//		typesAide = proxyServiceBu.displayTypeAide();	
		materiels = proxyServiceBu.displayMateriel();
		typesLitige = proxyServiceBu.displayTypesLitige();

		categoriesAide = proxyServiceBu.displayCategorieAide();
		typesAideCat1 = proxyServiceBu.displayTypesAideCat1();
		typesAideCat2 = proxyServiceBu.displayTypesAideCat2();
		typesAideCat3 = proxyServiceBu.displayTypesAideCat3();
		typesAideCat4 = proxyServiceBu.displayTypesAideCat4();
		typesAideCat5 = proxyServiceBu.displayTypesAideCat5();
		typesAideCat6 = proxyServiceBu.displayTypesAideCat6();
		typesAideCat7 = proxyServiceBu.displayTypesAideCat7();
		typesAideCat8 = proxyServiceBu.displayTypesAideCat8();
		typesAideCat9 = proxyServiceBu.displayTypesAideCat9();
		typesAideCat10 = proxyServiceBu.displayTypesAideCat10();
		typesAideCat11 = proxyServiceBu.displayTypesAideCat11();

		mapTypesAide.put(1, typesAideCat1);
		mapTypesAide.put(2, typesAideCat2);
		mapTypesAide.put(3, typesAideCat3);
		mapTypesAide.put(4, typesAideCat4);
		mapTypesAide.put(5, typesAideCat5);
		mapTypesAide.put(6, typesAideCat6);
		mapTypesAide.put(7, typesAideCat7);
		mapTypesAide.put(8, typesAideCat8);
		mapTypesAide.put(9, typesAideCat9);
		mapTypesAide.put(10, typesAideCat10);
		mapTypesAide.put(11, typesAideCat11);

		serviceBeneficiaire = proxyServiceBu.displayServiceBeneficiaire(userConnected);
		serviceVolontaire = proxyServiceBu.displayServiceVolontaire(userConnected);
		servicesPref = proxyServiceBu.displayServicePref(userConnected);
		servicesTermine = proxyServiceBu.displayServiceTermine(userConnected);

		filterBy = new ArrayList<>();

		filterBy.add(FilterMeta.builder()
				.field("dateService")
				.filterValue(Arrays.asList(LocalDate.now(), LocalDate.now().plusDays(31)))
				.matchMode(MatchMode.RANGE)
				.build());

	}

	//AFFICHER TYPES AIDE SELON CATEGORIE AIDE
	public void onCategorieChange() {
		if(categorieSelected != null) {
			typesAide = mapTypesAide.get(categorieSelected.getId());
		}else {
			typesAide = new ArrayList<TypeAide>();
		}
	}

	//AFFICHER SERVICES SS VOLONTAIRES
	public void afficherServicesSsVolontaire() {
		System.out.println("****** METHODE SS VOLONTAIRES");
		services = proxyServiceBu.displayServiceSsVolontaire();		
		//return "/testListe.xhtml?faces-redirect=true";
	}

	//CREATION D'UN SERVICE
	public String demanderService() {
		String retour ="";

		if(service == null) {
			message = "Désolé, votre demande n'a pas été enregistrée, veuillez réessayer";
			retour = "/creationService.xhtml?faces-redirect=true";
		}else{
			if(service.getAdresse().length() == 0) {
				service.setAdresse(userConnected.getAdresse());
			}
			service.setDateCreation(LocalDate.now());
			service.setUtilisateur(userConnected);
			service.setTypeAide(typeAideSelected);
			service.setMateriel(materielSelected);
			service = proxyServiceBu.creerService(service);
			services.add(service);
			serviceBeneficiaire.add(service);
			service = new Service();
			message = "Votre demande a été enregistrée";
			retour = "/home.xhtml?faces-redirect=true";		// Avec filtrage pour afficher services demandeur
		}
		return retour;
	}

	//ACCEPTER SERVICE
	public void accepterService() {

		if(service == null) {
			message = "Désolé, votre demande n'a pas été enregistrée, veuillez réessayer";
		}else {
			reponseService.setUtilisateur(userConnected);
			reponseService.setService(serviceSelected);
			reponseService.setDateAcceptation(LocalDate.now());
			reponseService = proxyServiceBu.creerReponseService(reponseService);
			reponseService = new ReponseService();	
			serviceSelected.setDateAcceptation(LocalDate.now());
			proxyServiceBu.updateService(serviceSelected);
			serviceVolontaire.add(serviceSelected);
		}
	}

	// NOMBRE DE SERVICES
	public Long getNbServices() {
		numServices = proxyServiceBu.numServices();
		return numServices;
	}

	// LOAD UN SERVICE DE LA PAGE HOME A DETAILS SERVICE
	public String load(Service service) {	
		String retour = "";
		detailService = new Service();
		this.detailService = service;
		this.detailService.setSommeAPrevoir(0.0f);

		return retour = "/detailsService.xhtml?faces-redirect=true";	
	}
	// LOAD UN SERVICE DE LA PAGE HOME A DETAILS SERVICE
	public String loadBeneficiaire(Service service) {	
		reponseServiceSelected = new ReponseService();
		String retour = "";
		detailService = new Service();
		detailService = service;
		//detailService.setSommeAPrevoir(0.0f);
		if (detailService.getDateAcceptation() != null) {
			reponseServiceSelected = proxyServiceBu.displayReponseServiceByService(detailService);
		}
		
		return retour = "/detailsServiceBeneficiaire.xhtml?faces-redirect=true";	
	}
	
	//	MODIFIER LE SERVICE
	public void modifierService() {			
		this.detailService.setMateriel(materielSelected);
		proxyServiceBu.updateService(detailService);				
	}

	// ANNULER LE SERVICE
	public String annulerService() {
		String retour = "";
		this.detailService.setDateAnnulation(LocalDate.now());
		proxyServiceBu.updateService(detailService);
		return retour = "/mesServices.xhtml?faces-redirect=true";
	}

	// SE DESISTER DU SERVICE
	public String seDesisterDuService(Service service) {
		String retour = "";
		reponseService = proxyServiceBu.updateDesistementService(service, userConnected);
		reponseService.setDateDesistement(LocalDate.now());
		service.setDateAcceptation(null);
		proxyServiceBu.updateService(service);
		proxyServiceBu.updateReponseService(reponseService);
		return retour = "/mesServices.xhtml?faces-redirect=true";
	}

	// OUVRIR UN LITIGE
	public void ouvrirLitige() {
		litige.setUtilisateur(userConnected);
		litige.setService(serviceSelected);
		litige.setDateCreation(LocalDate.now());
		litige.setTypeLitige(selectedTypeLitige);
		litige = proxyLitigeBu.creerLitige(litige);
		litige = new Litige();
	}

	// REQUETE UPDATE DES LISTES
	public void recupListeService() {
		serviceBeneficiaire = proxyServiceBu.displayServiceBeneficiaire(userConnected);
		serviceVolontaire = proxyServiceBu.displayServiceVolontaire(userConnected);
		servicesPref = proxyServiceBu.displayServicePref(userConnected);
		services = proxyServiceBu.displayService(userConnected);
		servicesTermine = proxyServiceBu.displayServiceTermine(userConnected);
	}

	//CLOTURER UN SERVICE
	public String cloturerService(Service serviceToClotured) {
		String retour = "";
		serviceToClotured.setDateCloture(LocalDate.now());
		proxyServiceBu.updateService(serviceToClotured);
		return retour = "/mesServices.xhtml?faces-redirect=true";
	}
	
	//LOAD VOLONTAIRE SERVICE DEPUIS LITIGE
	public void loadBeneficiaireLitige(Service service) {
		System.out.println("ENTREE METHODE");
		this.serviceSelected = service;
		System.out.println("Service Selected "+ serviceSelected);
		reponseServiceSelected = new ReponseService();
		if(serviceSelected.getDateAcceptation() != null) {
		reponseServiceSelected = proxyServiceBu.displayReponseServiceByService(serviceSelected);
		}
		
		System.out.println(reponseServiceSelected);
	}

	// GETTERS SETTERS 

	public List<Service> getServices() {
		return services;
	}


	public void setServices(List<Service> services) {
		this.services = services;
	}


	public Service getService() {
		return service;
	}

	public Utilisateur getUserConnected() {
		return userConnected;
	}

	public void setUserConnected(Utilisateur userConnected) {
		this.userConnected = userConnected;
	}

	public TypeAide getTypeAideSelected() {
		return typeAideSelected;
	}

	public void setTypeAideSelected(TypeAide typeAideSelected) {
		this.typeAideSelected = typeAideSelected;
	}

	public List<TypeAide> getTypesAide() {
		return typesAide;
	}

	public Materiel getMaterielSelected() {
		return materielSelected;
	}

	public void setMaterielSelected(Materiel materielSelected) {
		this.materielSelected = materielSelected;
	}

	public List<Materiel> getMateriels() {
		return materiels;
	}

	public void setMateriels(List<Materiel> materiels) {
		this.materiels = materiels;
	}

	public ReponseService getReponseService() {
		return reponseService;
	}

	public void setReponseService(ReponseService reponseService) {
		this.reponseService = reponseService;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<FilterMeta> getFilterBy() {
		return filterBy;
	}


	public void setFilterBy(List<FilterMeta> filterBy) {
		this.filterBy = filterBy;
	}


	public List<Service> getFilteredServices() {
		return filteredServices;
	}


	public void setFilteredServices(List<Service> filteredServices) {
		this.filteredServices = filteredServices;
	}


	public List<CategorieAide> getCategoriesAide() {
		return categoriesAide;
	}


	public void setCategoriesAide(List<CategorieAide> categoriesAide) {
		this.categoriesAide = categoriesAide;
	}


	public List<TypeAide> getTypesAideCat1() {
		return typesAideCat1;
	}


	public void setTypesAideCat1(List<TypeAide> typesAideCat1) {
		this.typesAideCat1 = typesAideCat1;
	}


	public List<TypeAide> getTypesAideCat2() {
		return typesAideCat2;
	}


	public void setTypesAideCat2(List<TypeAide> typesAideCat2) {
		this.typesAideCat2 = typesAideCat2;
	}


	public CategorieAide getCategorieSelected() {
		return categorieSelected;
	}


	public void setCategorieSelected(CategorieAide categorieSelected) {
		this.categorieSelected = categorieSelected;
	}


	public Map<Integer, List<TypeAide>> getMapTypesAide() {
		return mapTypesAide;
	}


	public void setMapTypesAide(Map<Integer, List<TypeAide>> mapTypesAide) {
		this.mapTypesAide = mapTypesAide;
	}

	public Service getServiceSelected() {
		return serviceSelected;
	}

	public void setServiceSelected(Service serviceSelected) {
		this.serviceSelected = serviceSelected;
	}
	public List<TypeAide> getTypesAideCat3() {
		return typesAideCat3;
	}

	public void setTypesAideCat3(List<TypeAide> typesAideCat3) {
		this.typesAideCat3 = typesAideCat3;
	}

	public List<TypeAide> getTypesAideCat4() {
		return typesAideCat4;
	}

	public void setTypesAideCat4(List<TypeAide> typesAideCat4) {
		this.typesAideCat4 = typesAideCat4;
	}

	public List<TypeAide> getTypesAideCat5() {
		return typesAideCat5;
	}

	public void setTypesAideCat5(List<TypeAide> typesAideCat5) {
		this.typesAideCat5 = typesAideCat5;
	}

	public List<TypeAide> getTypesAideCat6() {
		return typesAideCat6;
	}

	public void setTypesAideCat6(List<TypeAide> typesAideCat6) {
		this.typesAideCat6 = typesAideCat6;
	}

	public List<TypeAide> getTypesAideCat7() {
		return typesAideCat7;
	}

	public void setTypesAideCat7(List<TypeAide> typesAideCat7) {
		this.typesAideCat7 = typesAideCat7;
	}

	public List<TypeAide> getTypesAideCat8() {
		return typesAideCat8;
	}

	public void setTypesAideCat8(List<TypeAide> typesAideCat8) {
		this.typesAideCat8 = typesAideCat8;
	}

	public List<TypeAide> getTypesAideCat9() {
		return typesAideCat9;
	}

	public void setTypesAideCat9(List<TypeAide> typesAideCat9) {
		this.typesAideCat9 = typesAideCat9;
	}

	public List<TypeAide> getTypesAideCat10() {
		return typesAideCat10;
	}

	public void setTypesAideCat10(List<TypeAide> typesAideCat10) {
		this.typesAideCat10 = typesAideCat10;
	}

	public List<TypeAide> getTypesAideCat11() {
		return typesAideCat11;
	}

	public void setTypesAideCat11(List<TypeAide> typesAideCat11) {
		this.typesAideCat11 = typesAideCat11;
	}


	public Service getDetailService() {
		return detailService;
	}


	public void setDetailService(Service detailService) {
		this.detailService = detailService;
	}


	public List<Service> getServiceBeneficiaire() {
		return serviceBeneficiaire;
	}


	public void setServiceBeneficiaire(List<Service> serviceBeneficiaire) {
		this.serviceBeneficiaire = serviceBeneficiaire;
	}


	public List<Service> getServiceVolontaire() {
		return serviceVolontaire;
	}


	public void setServiceVolontaire(List<Service> serviceVolontaire) {
		this.serviceVolontaire = serviceVolontaire;
	}


	public List<Service> getServicesPref() {
		return servicesPref;
	}


	public void setServicesPref(List<Service> servicesPref) {
		this.servicesPref = servicesPref;
	}

	public List<Service> getServicesTermine() {
		return servicesTermine;
	}

	public void setServicesTermine(List<Service> servicesTermine) {
		this.servicesTermine = servicesTermine;
	}

	public Litige getLitige() {
		return litige;
	}

	public void setLitige(Litige litige) {
		this.litige = litige;
	}

	public TypeLitige getSelectedTypeLitige() {
		return selectedTypeLitige;
	}

	public void setSelectedTypeLitige(TypeLitige selectedTypeLitige) {
		this.selectedTypeLitige = selectedTypeLitige;
	}

	public List<TypeLitige> getTypesLitige() {
		return typesLitige;
	}

	public void setTypesLitige(List<TypeLitige> typesLitige) {
		this.typesLitige = typesLitige;
	}

	public void setTypesAide(List<TypeAide> typesAide) {
		this.typesAide = typesAide;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public ReponseService getReponseServiceSelected() {
		return reponseServiceSelected;
	}

	public void setReponseServiceSelected(ReponseService reponseServiceSelected) {
		this.reponseServiceSelected = reponseServiceSelected;
	}

	public Utilisateur getVolontaire() {
		return volontaire;
	}

	public void setVolontaire(Utilisateur volontaire) {
		this.volontaire = volontaire;
	}


}
