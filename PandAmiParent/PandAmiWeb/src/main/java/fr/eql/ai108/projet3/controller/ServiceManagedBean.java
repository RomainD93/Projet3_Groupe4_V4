package fr.eql.ai108.projet3.controller;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.ibusiness.ServiceIBusiness;

@ManagedBean(name = "mbService")
@RequestScoped
public class ServiceManagedBean {
	
	private List<Service> services;
	private List<TypeAide> typesAide;
	
	private Long numServices;
	private Service service = new Service();
	private TypeAide typeAideSelected;
	private String message;
	

	@ManagedProperty (value = "#{mbCompte.utilisateur}")
	private Utilisateur userConnected;
	
	@EJB
	private ServiceIBusiness proxyServiceBu;
	
	@PostConstruct
	public void init (){
		services = proxyServiceBu.displayService();
		typesAide = proxyServiceBu.displayTypeAide();	
	}
	
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
			service = proxyServiceBu.creerService(service);
			message = "Votre demande a été enregistrée";
			retour = "/home.xhtml?faces-redirect=true";		// Avec filtrage pour afficher services demandeur
		}
		return retour;
	}

	public Long getNbServices() {
		numServices = proxyServiceBu.numServices();
		return numServices;
	}
	
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

//	public Date getDateServiceSelected() {
//		return dateServiceSelected;
//	}
//
//	public void setDateServiceSelected(Date dateServiceSelected) {
//		this.dateServiceSelected = dateServiceSelected;
//	}




	
	


}
