package fr.eql.ai108.projet3.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.ibusiness.CompteUtilisateurIBusiness;


@ManagedBean (name="mbCompte")
@SessionScoped
public class CompteManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Utilisateur utilisateur = new Utilisateur();
	private String message;

	@EJB
	private CompteUtilisateurIBusiness proxyCompteUtilisateurBu;

	public String connection() {
		utilisateur = proxyCompteUtilisateurBu.connection(utilisateur.getEmail(), utilisateur.getPassword());
		String retour ="";
		if(utilisateur!= null) {
			retour = "/connectedView.xhtml?faces-redirect=true";
		}else {
			utilisateur = new Utilisateur();
			message = "Login/Password incorrectes";
			retour = "/connection.xhtml?faces-redirect=true";
		}
		return retour;
	}

	private String inscription() {
		utilisateur = proxyCompteUtilisateurBu.creerCompte(utilisateur);
		if(utilisateur == null) {
			message = "Ce login n'est pas disponible. Choisissez en un autre";
		}else {
			message = "Bienvenue ! " + utilisateur.getPrenom() + ". Votre compte a bien été créé.";
		}
		utilisateur = new Utilisateur();
		return message;	//Page à retourner
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



}
