package fr.eql.ai108.projet3.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.ibusiness.CompteUtilisateurIBusiness;

@ManagedBean(name = "mbUtilisateur")
@ViewScoped
public class UtilisateurManagedBean {

	
	@ManagedProperty (value = "#{mbCompte.utilisateur}")
	private Utilisateur userConnected;
	
	@EJB
	private CompteUtilisateurIBusiness proxyUtilisateurBu;
	
	
	
	
	
	//METHODES
	public String modifierInfos() {
		String retour ="";
		retour = "/modificationUtilisateurInfos.xhtml?faces-redirect=true";
		return retour;
	}
	
	public String modifierDispos() {
		String retour ="";
		retour = "/modificationUtilisateurDispos.xhtml?faces-redirect=true";
		return retour;
	}
	
	public String modifierPrefs() {
		String retour ="";
		retour = "/modificationUtilisateurPrefs.xhtml?faces-redirect=true";
		return retour;
	}
	
	
	
	//GETTERS SETTERS
	public Utilisateur getUserConnected() {
		return userConnected;
	}

	public void setUserConnected(Utilisateur userConnected) {
		this.userConnected = userConnected;
	}

	
}
