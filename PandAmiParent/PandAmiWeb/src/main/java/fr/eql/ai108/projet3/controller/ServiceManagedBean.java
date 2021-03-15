package fr.eql.ai108.projet3.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.Materiel;
import fr.eql.ai108.projet3.entity.ReponseService;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.ibusiness.ServiceIBusiness;

@ManagedBean(name = "mbService")
@ViewScoped
public class ServiceManagedBean {
	
	private List<Service> services = new ArrayList<Service>();
	private List<TypeAide> typesAide = new ArrayList<TypeAide>();
	private List<Materiel> materiels;
	private List<CategorieAide> categoriesAide;
	private List<TypeAide> typesAideCat1;
	private List<TypeAide> typesAideCat2;
	private CategorieAide categorieSelected;
	private Long numServices;
	private Service service = new Service();
	private TypeAide typeAideSelected;
	private String message;
	private Materiel materielSelected;
	private Map<Integer, List<TypeAide>> mapTypesAide = new HashMap<Integer, List<TypeAide>>();
 	
	private ReponseService reponseService = new ReponseService();
	private Service serviceSelected;
	

	@ManagedProperty (value = "#{mbCompte.utilisateur}")
	private Utilisateur userConnected;
	
	@EJB
	private ServiceIBusiness proxyServiceBu;
	
	
	// INITIALISATION DES LISTES AND CO
	
	@PostConstruct
	public void init (){
		services = proxyServiceBu.displayServiceSsVolontaire();
		//typesAide = proxyServiceBu.displayTypeAide();	
		materiels = proxyServiceBu.displayMateriel();
		categoriesAide = proxyServiceBu.displayCategorieAide();
		typesAideCat1 = proxyServiceBu.displayTypesAideCat1();
		typesAideCat2 = proxyServiceBu.displayTypesAideCat2();
		mapTypesAide.put(1, typesAideCat1);
		mapTypesAide.put(2, typesAideCat2);
	}
	
	
	// METHODES
	
	//AFFICHER TYPES AIDE SELON CATEGORIE AIDE
	public void onCategorieChange() {
		System.out.println("Entrée Mathode Type Aide Catégorie");
		if(categorieSelected != null) {
			System.out.println("MAP METHODE");
			typesAide = mapTypesAide.get(categorieSelected.getId());
			System.out.println("MAP METHODE DONE");
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
		Date date = new Date();
		
		if(service == null) {
			message = "Désolé, votre demande n'a pas été enregistrée, veuillez réessayer";
			retour = "/creationService.xhtml?faces-redirect=true";
		}else{
			if(service.getAdresse().toString() == "") {
				service.setAdresse(userConnected.getAdresse());
			}
			service.setDateCreation(date);
			service.setUtilisateur(userConnected);
			service.setTypeAide(typeAideSelected);
			service.setMateriel(materielSelected);
			service = proxyServiceBu.creerService(service);
			message = "Votre demande a été enregistrée";
			retour = "/home.xhtml?faces-redirect=true";		// Avec filtrage pour afficher services demandeur
		}
		return retour;
	}
	//AFFICHER DETAILS DU SERVICE
	
	
	
	//ACCEPTER SERVICE
	public String accepterService() {
		String retour ="";
		Date date = new Date();
		
		if(service == null) {
			message = "Désolé, votre demande n'a pas été enregistrée, veuillez réessayer";
			retour = "/home.xhtml?faces-redirect=true";
		}else {
			reponseService.setService(serviceSelected);
			reponseService.setDateAcceptation(date);
			reponseService = proxyServiceBu.creerReponseService(reponseService);
			retour = "/home.xhtml?faces-redirect=true";
		}
			
		return retour;
	}

	
	// NOMBRE DE SERVICES
	public Long getNbServices() {
		numServices = proxyServiceBu.numServices();
		return numServices;
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






}
