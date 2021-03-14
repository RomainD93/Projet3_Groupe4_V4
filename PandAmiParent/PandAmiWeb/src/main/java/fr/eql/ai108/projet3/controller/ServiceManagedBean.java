package fr.eql.ai108.projet3.controller;


import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import fr.eql.ai108.projet3.entity.Materiel;
import fr.eql.ai108.projet3.entity.ReponseService;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.ibusiness.ServiceIBusiness;

@ManagedBean(name = "mbService")
@ViewScoped
public class ServiceManagedBean {
	
	private List<Service> services;
	private List<TypeAide> typesAide;
	private List<Materiel> materiels;
	
	private Long numServices;
	private Service service = new Service();
	private TypeAide typeAideSelected;
	private String message;
	private Materiel materielSelected;
	
	private ReponseService reponseService = new ReponseService();
	private Service serviceSelected;
	

	@ManagedProperty (value = "#{mbCompte.utilisateur}")
	private Utilisateur userConnected;
	
	@EJB
	private ServiceIBusiness proxyServiceBu;
	
	
	// INITIALISATION DES LISTES AND CO
	
	@PostConstruct
	public void init (){
		services = proxyServiceBu.displayService();
		typesAide = proxyServiceBu.displayTypeAide();	
		materiels = proxyServiceBu.displayMateriel();
	}
	
	
	// METHODES
	
	public void afficherAllServices() {
		services = proxyServiceBu.displayService();
	}
	
	//CREATION D'UN SERVICE
	public String demanderService() {
		String retour ="";
		Date date = new Date();
		
		if(service == null) {
			message = "Désolé, votre demande n'a pas été enregistrée, veuillez réessayer";
			retour = "/creationService.xhtml?faces-redirect=true";
		}else{
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
	



}
