package fr.eql.ai108.projet3.controller;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import fr.eql.ai108.projet3.entity.Genre;
import fr.eql.ai108.projet3.entity.TypeUtilisateur;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.ibusiness.CompteUtilisateurIBusiness;


@ManagedBean (name="mbCompte")
@SessionScoped
public class CompteManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Genre> genres;
	private Genre genreSelected;
	
	private Utilisateur utilisateur = new Utilisateur();
	private String message;
	
	private TypeUtilisateur typeUtilisateur = new TypeUtilisateur();
	

	@EJB
	private CompteUtilisateurIBusiness proxyCompteUtilisateurBu;
	
	@PostConstruct
	public void init (){
		setGenres(proxyCompteUtilisateurBu.displayGenre());
	}

	public String connection() {
		utilisateur = proxyCompteUtilisateurBu.connection(utilisateur.getEmail(), utilisateur.getPassword());
		String retour ="";		
		if(utilisateur.getTypeUtilisateur().getId() == 1) {
			retour = "/home.xhtml?faces-redirect=true";
		}else if(utilisateur.getTypeUtilisateur().getId() == 2) {
			retour = "/analysteHomePage.xhtml?faces-redirect=true";
		}else if(utilisateur.getTypeUtilisateur().getId() == 3) {
			retour = "/moderateurHomePage.xhtml?faces-redirect=true";
		}else{
			utilisateur = new Utilisateur();
			message = "Login/Password incorrectes";
			retour = "/connection.xhtml?faces-redirect=true";
		}
		return retour;
	}
	
	public String logout() {
		utilisateur = new Utilisateur();
		System.out.println(utilisateur.getNom());
		return "/connection.xhtml?faces-redirect=true";
	}
	
	public String afficherSubscription() {	
		return "/subscription.xhtml?faces-redirect=true";
	}

	public String inscription() {
		String retour ="";
		utilisateur.setGenre(genreSelected);
		typeUtilisateur.setId(1);
		utilisateur.setTypeUtilisateur(typeUtilisateur);
		utilisateur.setDateInscription(new Date());
		utilisateur = proxyCompteUtilisateurBu.creerCompte(utilisateur);

		if(utilisateur == null) {
			System.out.println(utilisateur);
			message = "Ce login n'est pas disponible. Choisissez en un autre";
			retour = "/subscription.xhtml?faces-redirect=true";

		}else {				

			utilisateur = proxyCompteUtilisateurBu.connection(utilisateur.getEmail(), utilisateur.getPassword());
			//message = "Bienvenue " + utilisateur.getPrenom() + "! Votre compte a bien été créé.";
			message = "";
			retour = "/home.xhtml?faces-redirect=true";
		}
		return retour;
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

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public Genre getGenreSelected() {
		return genreSelected;
	}

	public void setGenreSelected(Genre genreSelected) {
		this.genreSelected = genreSelected;
	}

	public TypeUtilisateur getTypeUtilisateur() {
		return typeUtilisateur;
	}

	public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}

	public CompteUtilisateurIBusiness getProxyCompteUtilisateurBu() {
		return proxyCompteUtilisateurBu;
	}

	public void setProxyCompteUtilisateurBu(CompteUtilisateurIBusiness proxyCompteUtilisateurBu) {
		this.proxyCompteUtilisateurBu = proxyCompteUtilisateurBu;
	}
	



}
