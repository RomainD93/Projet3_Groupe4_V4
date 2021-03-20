package fr.eql.ai108.projet3.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import fr.eql.ai108.projet3.entity.Litige;
import fr.eql.ai108.projet3.entity.ReponseService;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.ibusiness.LitigeIBusiness;

@ManagedBean (name = "mbModerateur")
@SessionScoped
public class ModerateurManagedBean {

	private List<Litige> allLitiges = new ArrayList<Litige>();
	private List<Litige> litigesOuverts = new ArrayList<Litige>();
	private List<Litige> litigesClotures = new ArrayList<Litige>();
	private List<Litige> litiges1Retard = new ArrayList<Litige>();
	private List<Litige> litiges2Financier = new ArrayList<Litige>();
	private List<Litige> litiges3Casse = new ArrayList<Litige>();
	private List<Litige> litiges4Violence = new ArrayList<Litige>();
	private List<Litige> litiges5Comportement = new ArrayList<Litige>();
	private ReponseService reponseServiceSelected = new ReponseService();
	
	
	private Litige litige = new Litige();
	private Litige detailLitige;
	private Litige litigeSelected;
		
	@ManagedProperty (value = "#{mbCompte.utilisateur}")
	private Utilisateur userConnected;
	
	@EJB
	private LitigeIBusiness proxyLitigeBu;

	@PostConstruct
	private void init() {
		allLitiges = proxyLitigeBu.displayAllLitiges();
		litigesOuverts = proxyLitigeBu.displayLitigesOuverts();
		litigesClotures = proxyLitigeBu.displayLitigesClotures();
	}
	
	//METHODES
	//LOAD LITIGE POUR LES DETAILS 
	public String loadLitige(Litige litige) {
		String retour = "";
		System.out.println("sdfsdfsdfsdfsdfsdfsdsdf");
		detailLitige = new Litige();
		detailLitige = litige;
		System.out.println("sdfsdfsdfsdfsdfsdfsdsdf");
		reponseServiceSelected = proxyLitigeBu.displayReponseServiceDuLitige(litige);
		System.out.println("sdfsdfsdfsdfsdfsdfsdsdf");
		retour = "/detailsLitige.xhtml?faces-redirect=true";	
		return retour;
	}
	
	//CLOTURER LITIGE
	public String  cloturerLitige() {
		String retour = "";
		this.detailLitige.setDateCloture(LocalDate.now());
		proxyLitigeBu.updateLitige(detailLitige);
		allLitiges = proxyLitigeBu.displayAllLitiges();
		retour = "/moderateurHomePage.xhtml?faces-redirect=true";
		
		return retour;
	}
	//ANNULER CLOTURE LITIGE
	public String  annulerClotureLitige() {
		return "/moderateurHomePage.xhtml?faces-redirect=true";
	}
	
	//GETTERS SETTERS
	public List<Litige> getAllLitiges() {
		return allLitiges;
	}

	public void setAllLitiges(List<Litige> allLitiges) {
		this.allLitiges = allLitiges;
	}

	public List<Litige> getLitigesOuverts() {
		return litigesOuverts;
	}

	public void setLitigesOuverts(List<Litige> litigesOuverts) {
		this.litigesOuverts = litigesOuverts;
	}

	public List<Litige> getLitigesClotures() {
		return litigesClotures;
	}

	public void setLitigesClotures(List<Litige> litigesClotures) {
		this.litigesClotures = litigesClotures;
	}

	public List<Litige> getLitiges1Retard() {
		return litiges1Retard;
	}

	public void setLitiges1Retard(List<Litige> litiges1Retard) {
		this.litiges1Retard = litiges1Retard;
	}

	public List<Litige> getLitiges2Financier() {
		return litiges2Financier;
	}

	public void setLitiges2Financier(List<Litige> litiges2Financier) {
		this.litiges2Financier = litiges2Financier;
	}

	public List<Litige> getLitiges3Casse() {
		return litiges3Casse;
	}

	public void setLitiges3Casse(List<Litige> litiges3Casse) {
		this.litiges3Casse = litiges3Casse;
	}

	public List<Litige> getLitiges4Violence() {
		return litiges4Violence;
	}

	public void setLitiges4Violence(List<Litige> litiges4Violence) {
		this.litiges4Violence = litiges4Violence;
	}

	public List<Litige> getLitiges5Comportement() {
		return litiges5Comportement;
	}

	public void setLitiges5Comportement(List<Litige> litiges5Comportement) {
		this.litiges5Comportement = litiges5Comportement;
	}

	public Litige getDetailLitige() {
		return detailLitige;
	}

	public void setDetailLitige(Litige detailLitige) {
		this.detailLitige = detailLitige;
	}

	public Utilisateur getUserConnected() {
		return userConnected;
	}

	public void setUserConnected(Utilisateur userConnected) {
		this.userConnected = userConnected;
	}

	public LitigeIBusiness getProxyLitigeBu() {
		return proxyLitigeBu;
	}

	public void setProxyLitigeBu(LitigeIBusiness proxyLitigeBu) {
		this.proxyLitigeBu = proxyLitigeBu;
	}

	public Litige getLitige() {
		return litige;
	}

	public void setLitige(Litige litige) {
		this.litige = litige;
	}

	public Litige getLitigeSelected() {
		return litigeSelected;
	}

	public void setLitigeSelected(Litige litigeSelected) {
		this.litigeSelected = litigeSelected;
	}

	public ReponseService getReponseServiceSelected() {
		return reponseServiceSelected;
	}

	public void setReponseServiceSelected(ReponseService reponseServiceSelected) {
		this.reponseServiceSelected = reponseServiceSelected;
	}
	

	
	
	
}
