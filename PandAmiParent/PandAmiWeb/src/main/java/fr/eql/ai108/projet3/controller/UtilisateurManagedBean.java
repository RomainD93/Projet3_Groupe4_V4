package fr.eql.ai108.projet3.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.axes.cartesian.CartesianScales;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearAxes;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearTicks;
import org.primefaces.model.charts.bar.BarChartDataSet;
import org.primefaces.model.charts.bar.BarChartModel;
import org.primefaces.model.charts.bar.BarChartOptions;
import org.primefaces.model.charts.optionconfig.title.Title;

import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.Disponibilite;
import fr.eql.ai108.projet3.entity.JourSemaine;
import fr.eql.ai108.projet3.entity.PreferenceAide;
import fr.eql.ai108.projet3.entity.PreferenceVille;
import fr.eql.ai108.projet3.entity.TypeAide;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.entity.Ville;
import fr.eql.ai108.projet3.ibusiness.CompteUtilisateurIBusiness;
import fr.eql.ai108.projet3.ibusiness.ServiceIBusiness;

@ManagedBean(name = "mbUtilisateur")
@ViewScoped
public class UtilisateurManagedBean {
	
	
	//Dispos
	private List<JourSemaine> joursSemaine;
	private JourSemaine jourSemaineSelected;
	private List<JourSemaine> joursSemaineSelected;
	private Disponibilite disponibilite = new Disponibilite();
	private Disponibilite disponibiliteSelected;
	private List<Disponibilite> disponibilites = new ArrayList<Disponibilite>();
	private List<Disponibilite> disponibilitesSelected;
	private List<Disponibilite> disposUserConnected;
	
	
	//Prefs ville
	private List<Ville> villes;
	private Ville villeSelected;
	private List<Ville> villesSelected;
	private PreferenceVille preferenceVille = new PreferenceVille();
	private PreferenceVille preferenceVilleSelected;
	private List<PreferenceVille> preferencesVille = new ArrayList<PreferenceVille>();
	private List<PreferenceVille> preferencesVilleSelected;
	private List<PreferenceVille> preferencesVilleUserConnected;
	
	
	//Prefereances Aide
	private PreferenceAide prefTypeAide = new PreferenceAide();
	private List<PreferenceAide> preferencesAideUserConnected;
		
	//Categorie __ Type Aide
	private List<TypeAide> typesAideSelected = new ArrayList<TypeAide>();
	private CategorieAide categorieSelected;
	private TypeAide typeAideSelected;
	

	private List<TypeAide> typesAideSelected1;
	private List<TypeAide> typesAideSelected2;
	private List<TypeAide> typesAideSelected3;
	private List<TypeAide> typesAideSelected4;
	private List<TypeAide> typesAideSelected5;
	private List<TypeAide> typesAideSelected6;
	private List<TypeAide> typesAideSelected7;
	private List<TypeAide> typesAideSelected8;
	private List<TypeAide> typesAideSelected9;
	private List<TypeAide> typesAideSelected10;
	private List<TypeAide> typesAideSelected11;

	private Map<Integer, List<TypeAide>> mapTypesAide = new HashMap<Integer, List<TypeAide>>();
	
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
	
    private BarChartModel barModel2;
    private BarChartModel barModelLitiges;
    private BarChartModel barModelVolontaire;
	
	private Long nbServicesEnAttenteDeVolontaireEnTantQueBeneficiaire;
	private Long nbServicesAvantRealEnTantQueBeneficiaire;
	private Long nbServicesTerminesEnTantQueBeneficiaire;
	private Long nbServicesAvantRealEnTantQueVolontaire;
	private Long nbServicesTerminesEnTantQueVolontaire;
	private Long nbLitigesOuverts;
	private Long nbLitigesFermes;
	
	
	@ManagedProperty (value = "#{mbCompte.utilisateur}")
	private Utilisateur userConnected;
	
	@EJB
	private CompteUtilisateurIBusiness proxyUtilisateurBu;
	@EJB
	private ServiceIBusiness proxyServiceBu;
	
	
	
	@PostConstruct
	public void init () {
		
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
		
		joursSemaine = proxyUtilisateurBu.displayJourSemaine();
		
		villes = proxyUtilisateurBu.displayVille();
		
		disposUserConnected = proxyUtilisateurBu.displayDisposUser(userConnected);		
		preferencesVilleUserConnected = proxyUtilisateurBu.displayPrefsVilleUser(userConnected);
		preferencesAideUserConnected = proxyUtilisateurBu.displayPrefsTypeAideUser(userConnected);	
		
		nbServicesEnAttenteDeVolontaireEnTantQueBeneficiaire = proxyUtilisateurBu.displayNbServicesEnAttenteDeVolontaireEnTantQueBeneficiaire(userConnected);
		nbServicesAvantRealEnTantQueBeneficiaire = proxyUtilisateurBu.displayNbServicesAvantRealEnTantQueBeneficiaire(userConnected);
		nbServicesTerminesEnTantQueBeneficiaire = proxyUtilisateurBu.displayNbServicesTerminesEnTantQueBeneficiaire(userConnected);
		nbServicesAvantRealEnTantQueVolontaire = proxyUtilisateurBu.displayNbServicesAvantRealEnTantQueVolontaire(userConnected);
		nbServicesTerminesEnTantQueVolontaire = proxyUtilisateurBu.displayNbServicesTerminesEnTantQueVolontaire(userConnected);
		nbLitigesOuverts = proxyUtilisateurBu.displayNbLitigesOuverts(userConnected);
		nbLitigesFermes = proxyUtilisateurBu.displayNbLitigesFermes(userConnected);
		
		createBarModelUser();
		createBarModelLitiges();
		createBarModelVolontaire();
	}

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
	
	public String modifierPrefsType() {
		String retour ="";
		System.out.println("PAGE MODIFICATION PREFS TYPE");
		retour = "/modificationUtilisateurPrefsType.xhtml?faces-redirect=true";
		return retour;
	}
	
	public String modifierPrefsVille() {
		String retour ="";
		retour = "/modificationUtilisateurPrefsVille.xhtml?faces-redirect=true";
		return retour;
	}
	
	
	public String validerDispos() {
		String retour ="";		
		if(joursSemaineSelected == null) {
			retour = "/home.xhtml?faces-redirect=true";	
		}else{			
			proxyUtilisateurBu.supprimerDisposUser(userConnected);
			for (JourSemaine jourSemaine : joursSemaineSelected) {
				disponibilite.setJourSemaine(jourSemaine);
				disponibilite.setUtilisateur(userConnected);
				disponibilite = proxyUtilisateurBu.creerDisponibilite(disponibilite);
				disponibilite = new Disponibilite();
			}
			
			retour = "/detailsUtilisateur.xhtml?faces-redirect=true";	
		}
		return retour;
	}
	
	public String validerPrefsVille() {
		String retour ="";
		if(villesSelected == null) {
			retour = "/home.xhtml?faces-redirect=true";	
		}else {
			proxyUtilisateurBu.supprimerPrefsVilleUser(userConnected);
			for (Ville ville : villesSelected) {
				preferenceVille.setVille(ville);
				preferenceVille.setUtilisateur(userConnected);
				preferenceVille = proxyUtilisateurBu.creerPrefVille(preferenceVille);
				preferenceVille = new PreferenceVille();
			}
			retour = "/detailsUtilisateur.xhtml?faces-redirect=true";	
		}	
		return retour;
	}
	
	public String validerPrefsType() {
		System.out.println("Entrée Méthode");
		String retour ="";
		
		
		typesAideSelected.addAll(typesAideSelected1);
		typesAideSelected.addAll(typesAideSelected2);
		typesAideSelected.addAll(typesAideSelected3);
		typesAideSelected.addAll(typesAideSelected4);
		typesAideSelected.addAll(typesAideSelected5);
		typesAideSelected.addAll(typesAideSelected6);
		typesAideSelected.addAll(typesAideSelected7);
		typesAideSelected.addAll(typesAideSelected8);
		typesAideSelected.addAll(typesAideSelected9);
		typesAideSelected.addAll(typesAideSelected10);
		typesAideSelected.addAll(typesAideSelected11);
		
		if(typesAideSelected == null) {
			System.out.println("Liste Nulle");
			retour = "/home.xhtml?faces-redirect=true";
		}else{
			System.out.println("ENTREE ELSE ON EST Là");
			proxyUtilisateurBu.supprimerPrefsTypeAideByUser(userConnected);
			System.out.println("Suppression OK");
			for (TypeAide typeAide : typesAideSelected) {
				prefTypeAide.setTypeAide(typeAide);
				prefTypeAide.setUtilisateur(userConnected);
				prefTypeAide = proxyUtilisateurBu.creerPrefTypeAide(prefTypeAide);
				prefTypeAide = new PreferenceAide();
			}
			retour = "/detailsUtilisateur.xhtml?faces-redirect=true";
		}
		
		return retour;
	}
	//GRAPH BENEFICIAIRE
    public void createBarModelUser() {
        barModel2 = new BarChartModel();
        ChartData data = new ChartData();

        BarChartDataSet barDataSet = new BarChartDataSet();
        barDataSet.setLabel("COUPS D'PATTE en attente d'un volontaire");
        barDataSet.setBackgroundColor("rgba(255, 99, 132, 0.2)");
        barDataSet.setBorderColor("rgb(255, 99, 132)");
        barDataSet.setBorderWidth(1);
        List<Number> values = new ArrayList<>();
        values.add(nbServicesEnAttenteDeVolontaireEnTantQueBeneficiaire);     
        barDataSet.setData(values);

        BarChartDataSet barDataSet2 = new BarChartDataSet();
        barDataSet2.setLabel("COUPS D'PATTE prévus avec un volontaire");
        barDataSet2.setBackgroundColor("rgba(255, 159, 64, 0.2)");
        barDataSet2.setBorderColor("rgb(255, 159, 64)");
        barDataSet2.setBorderWidth(1);
        List<Number> values2 = new ArrayList<>();
        values2.add(nbServicesAvantRealEnTantQueBeneficiaire);
        barDataSet2.setData(values2);

        data.addChartDataSet(barDataSet);
        data.addChartDataSet(barDataSet2);

        List<String> labels = new ArrayList<>();
        labels.add("");
        data.setLabels(labels);
        barModel2.setData(data);

        //Options
        BarChartOptions options = new BarChartOptions();
        CartesianScales cScales = new CartesianScales();
        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
        linearAxes.setOffset(true);
        CartesianLinearTicks ticks = new CartesianLinearTicks();
        ticks.setBeginAtZero(true);
        linearAxes.setTicks(ticks);
        cScales.addYAxesData(linearAxes);
        options.setScales(cScales);

        Title title = new Title();
        title.setDisplay(true);
        title.setText("COUPS D'PATTE - bénéficiaire");
        options.setTitle(title);

        barModel2.setOptions(options);
    }
    
  //GRAPH VOLONTAIRE
    public void createBarModelVolontaire() {
        barModelVolontaire = new BarChartModel();
        ChartData data = new ChartData();

        BarChartDataSet barDataSet = new BarChartDataSet();
        barDataSet.setLabel("COUPS D'PATTE prévus - volontaire");
        barDataSet.setBackgroundColor("rgba(187, 210, 225, 0.2)");
        barDataSet.setBorderColor("rgb(187, 210, 225)");
        barDataSet.setBorderWidth(1);
        List<Number> values = new ArrayList<>();
        values.add(nbServicesAvantRealEnTantQueVolontaire);     
        barDataSet.setData(values);

        BarChartDataSet barDataSet2 = new BarChartDataSet();
        barDataSet2.setLabel("COUPS D'PATTE terminés - volontaire");
        barDataSet2.setBackgroundColor("rgba(253, 191, 183, 0.2)");
        barDataSet2.setBorderColor("rgb(253, 191, 183)");
        barDataSet2.setBorderWidth(1);
        List<Number> values2 = new ArrayList<>();
        values2.add(nbServicesTerminesEnTantQueVolontaire);
        barDataSet2.setData(values2);

        data.addChartDataSet(barDataSet);
        data.addChartDataSet(barDataSet2);

        List<String> labels = new ArrayList<>();
        labels.add("");
        data.setLabels(labels);
        barModelVolontaire.setData(data);

        //Options
        BarChartOptions options = new BarChartOptions();
        CartesianScales cScales = new CartesianScales();
        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
        linearAxes.setOffset(true);
        CartesianLinearTicks ticks = new CartesianLinearTicks();
        ticks.setBeginAtZero(true);
        linearAxes.setTicks(ticks);
        cScales.addYAxesData(linearAxes);
        options.setScales(cScales);

        Title title = new Title();
        title.setDisplay(true);
        title.setText("COUPS D'PATTE - volontaire");
        options.setTitle(title);

        barModelVolontaire.setOptions(options);
    }
    
    
    //GRAPH LITIGES
    public void createBarModelLitiges() {
        barModelLitiges = new BarChartModel();
        ChartData data = new ChartData();

        BarChartDataSet barDataSet = new BarChartDataSet();
        barDataSet.setLabel("Litiges ouverts");
        barDataSet.setBackgroundColor("rgba(1, 121, 111, 0.2)");
        barDataSet.setBorderColor("rgb(1, 121, 111)");
        barDataSet.setBorderWidth(1);
        List<Number> values = new ArrayList<>();
        values.add(nbLitigesOuverts);     
        barDataSet.setData(values);

        BarChartDataSet barDataSet2 = new BarChartDataSet();
        barDataSet2.setLabel("Litiges fermés");
        barDataSet2.setBackgroundColor("rgba(2212, 115, 212, 0.2)");
        barDataSet2.setBorderColor("rgb(212, 115, 212)");
        barDataSet2.setBorderWidth(1);
        List<Number> values2 = new ArrayList<>();
        values2.add(nbLitigesFermes);
        barDataSet2.setData(values2);

        data.addChartDataSet(barDataSet);
        data.addChartDataSet(barDataSet2);

        List<String> labels = new ArrayList<>();
        labels.add("");
        data.setLabels(labels);
        barModelLitiges.setData(data);

        //Options
        BarChartOptions options = new BarChartOptions();
        CartesianScales cScales = new CartesianScales();
        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
        linearAxes.setOffset(true);
        CartesianLinearTicks ticks = new CartesianLinearTicks();
        ticks.setBeginAtZero(true);
        linearAxes.setTicks(ticks);
        cScales.addYAxesData(linearAxes);
        options.setScales(cScales);

        Title title = new Title();
        title.setDisplay(true);
        title.setText("LITIGES");
        options.setTitle(title);

        barModelLitiges.setOptions(options);
    }
	
	
	//GETTERS SETTERS
	public Utilisateur getUserConnected() {
		return userConnected;
	}

	public void setUserConnected(Utilisateur userConnected) {
		this.userConnected = userConnected;
	}

	public List<JourSemaine> getJoursSemaine() {
		return joursSemaine;
	}

	public void setJoursSemaine(List<JourSemaine> joursSemaine) {
		this.joursSemaine = joursSemaine;
	}

	public List<TypeAide> getPrefsTypesAide() {
		return typesAideSelected;
	}

	public void setPrefsTypesAide(List<TypeAide> prefsTypesAide) {
		this.typesAideSelected = prefsTypesAide;
	}

	public CategorieAide getCategorieSelected() {
		return categorieSelected;
	}

	public void setCategorieSelected(CategorieAide categorieSelected) {
		this.categorieSelected = categorieSelected;
	}

	public TypeAide getTypeAideSelected() {
		return typeAideSelected;
	}

	public void setTypeAideSelected(TypeAide typeAideSelected) {
		this.typeAideSelected = typeAideSelected;
	}

	public JourSemaine getJourSemaineSelected() {
		return jourSemaineSelected;
	}

	public void setJourSemaineSelected(JourSemaine jourSemaineSelected) {
		this.jourSemaineSelected = jourSemaineSelected;
	}

	public Map<Integer, List<TypeAide>> getMapTypesAide() {
		return mapTypesAide;
	}

	public void setMapTypesAide(Map<Integer, List<TypeAide>> mapTypesAide) {
		this.mapTypesAide = mapTypesAide;
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

	public CompteUtilisateurIBusiness getProxyUtilisateurBu() {
		return proxyUtilisateurBu;
	}


	public void setProxyUtilisateurBu(CompteUtilisateurIBusiness proxyUtilisateurBu) {
		this.proxyUtilisateurBu = proxyUtilisateurBu;
	}
	
	public ServiceIBusiness getProxyServiceBu() {
		return proxyServiceBu;
	}

	public void setProxyServiceBu(ServiceIBusiness proxyServiceBu) {
		this.proxyServiceBu = proxyServiceBu;
	}

	public List<JourSemaine> getJoursSemaineSelected() {
		return joursSemaineSelected;
	}

	public void setJoursSemaineSelected(List<JourSemaine> joursSemaineSelected) {
		this.joursSemaineSelected = joursSemaineSelected;
	}

	public Disponibilite getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(Disponibilite disponibilite) {
		this.disponibilite = disponibilite;
	}

	public Disponibilite getDisponibiliteSelected() {
		return disponibiliteSelected;
	}

	public void setDisponibiliteSelected(Disponibilite disponibiliteSelected) {
		this.disponibiliteSelected = disponibiliteSelected;
	}

	public List<Disponibilite> getDisponibilites() {
		return disponibilites;
	}

	public void setDisponibilites(List<Disponibilite> disponibilites) {
		this.disponibilites = disponibilites;
	}

	public List<Disponibilite> getDisponibilitesSelected() {
		return disponibilitesSelected;
	}

	public void setDisponibilitesSelected(List<Disponibilite> disponibilitesSelected) {
		this.disponibilitesSelected = disponibilitesSelected;
	}

	public List<Disponibilite> getDisposUserConnected() {
		return disposUserConnected;
	}

	public void setDisposUserConnected(List<Disponibilite> disposUserConnected) {
		this.disposUserConnected = disposUserConnected;
	}




	public List<Ville> getVilles() {
		return villes;
	}




	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}




	public Ville getVilleSelected() {
		return villeSelected;
	}




	public void setVilleSelected(Ville villeSelected) {
		this.villeSelected = villeSelected;
	}




	public List<Ville> getVillesSelected() {
		return villesSelected;
	}




	public void setVillesSelected(List<Ville> villesSelected) {
		this.villesSelected = villesSelected;
	}




	public PreferenceVille getPreferenceVille() {
		return preferenceVille;
	}




	public void setPreferenceVille(PreferenceVille preferenceVille) {
		this.preferenceVille = preferenceVille;
	}




	public PreferenceVille getPreferenceVilleSelected() {
		return preferenceVilleSelected;
	}




	public void setPreferenceVilleSelected(PreferenceVille preferenceVilleSelected) {
		this.preferenceVilleSelected = preferenceVilleSelected;
	}




	public List<PreferenceVille> getPreferencesVille() {
		return preferencesVille;
	}




	public void setPreferencesVille(List<PreferenceVille> preferencesVille) {
		this.preferencesVille = preferencesVille;
	}




	public List<PreferenceVille> getPreferencesVilleSelected() {
		return preferencesVilleSelected;
	}




	public void setPreferencesVilleSelected(List<PreferenceVille> preferencesVilleSelected) {
		this.preferencesVilleSelected = preferencesVilleSelected;
	}




	public List<PreferenceVille> getPreferencesVilleUserConnected() {
		return preferencesVilleUserConnected;
	}


	public void setPreferencesVilleUserConnected(List<PreferenceVille> preferencesVilleUserConnected) {
		this.preferencesVilleUserConnected = preferencesVilleUserConnected;
	}








	public PreferenceAide getPrefTypeAide() {
		return prefTypeAide;
	}




	public void setPrefTypeAide(PreferenceAide prefTypeAide) {
		this.prefTypeAide = prefTypeAide;
	}




	public List<TypeAide> getTypesAideSelected3() {
		return typesAideSelected3;
	}




	public void setTypesAideSelected3(List<TypeAide> typesAideSelected3) {
		this.typesAideSelected3 = typesAideSelected3;
	}




	public List<TypeAide> getTypesAideSelected4() {
		return typesAideSelected4;
	}




	public void setTypesAideSelected4(List<TypeAide> typesAideSelected4) {
		this.typesAideSelected4 = typesAideSelected4;
	}




	public List<TypeAide> getTypesAideSelected5() {
		return typesAideSelected5;
	}




	public void setTypesAideSelected5(List<TypeAide> typesAideSelected5) {
		this.typesAideSelected5 = typesAideSelected5;
	}




	public List<TypeAide> getTypesAideSelected6() {
		return typesAideSelected6;
	}




	public void setTypesAideSelected6(List<TypeAide> typesAideSelected6) {
		this.typesAideSelected6 = typesAideSelected6;
	}




	public List<TypeAide> getTypesAideSelected7() {
		return typesAideSelected7;
	}




	public void setTypesAideSelected7(List<TypeAide> typesAideSelected7) {
		this.typesAideSelected7 = typesAideSelected7;
	}




	public List<TypeAide> getTypesAideSelected8() {
		return typesAideSelected8;
	}




	public void setTypesAideSelected8(List<TypeAide> typesAideSelected8) {
		this.typesAideSelected8 = typesAideSelected8;
	}




	public List<TypeAide> getTypesAideSelected9() {
		return typesAideSelected9;
	}




	public void setTypesAideSelected9(List<TypeAide> typesAideSelected9) {
		this.typesAideSelected9 = typesAideSelected9;
	}




	public List<TypeAide> getTypesAideSelected10() {
		return typesAideSelected10;
	}




	public void setTypesAideSelected10(List<TypeAide> typesAideSelected10) {
		this.typesAideSelected10 = typesAideSelected10;
	}




	public List<TypeAide> getTypesAideSelected11() {
		return typesAideSelected11;
	}




	public void setTypesAideSelected11(List<TypeAide> typesAideSelected11) {
		this.typesAideSelected11 = typesAideSelected11;
	}




	public List<TypeAide> getTypesAideSelected1() {
		return typesAideSelected1;
	}




	public void setTypesAideSelected1(List<TypeAide> typesAideSelected1) {
		this.typesAideSelected1 = typesAideSelected1;
	}




	public List<TypeAide> getTypesAideSelected2() {
		return typesAideSelected2;
	}




	public void setTypesAideSelected2(List<TypeAide> typesAideSelected2) {
		this.typesAideSelected2 = typesAideSelected2;
	}




	public List<PreferenceAide> getPreferencesAideUserConnected() {
		return preferencesAideUserConnected;
	}




	public void setPreferencesAideUserConnected(List<PreferenceAide> preferencesAideUserConnected) {
		this.preferencesAideUserConnected = preferencesAideUserConnected;
	}

	public List<TypeAide> getTypesAideSelected() {
		return typesAideSelected;
	}

	public void setTypesAideSelected(List<TypeAide> typesAideSelected) {
		this.typesAideSelected = typesAideSelected;
	}

	public BarChartModel getBarModel2() {
		return barModel2;
	}

	public void setBarModel2(BarChartModel barModel2) {
		this.barModel2 = barModel2;
	}

	public Long getNbServicesEnAttenteDeVolontaireEnTantQueBeneficiaire() {
		return nbServicesEnAttenteDeVolontaireEnTantQueBeneficiaire;
	}

	public void setNbServicesEnAttenteDeVolontaireEnTantQueBeneficiaire(
			Long nbServicesEnAttenteDeVolontaireEnTantQueBeneficiaire) {
		this.nbServicesEnAttenteDeVolontaireEnTantQueBeneficiaire = nbServicesEnAttenteDeVolontaireEnTantQueBeneficiaire;
	}

	public Long getNbServicesAvantRealEnTantQueBeneficiaire() {
		return nbServicesAvantRealEnTantQueBeneficiaire;
	}

	public void setNbServicesAvantRealEnTantQueBeneficiaire(Long nbServicesAvantRealEnTantQueBeneficiaire) {
		this.nbServicesAvantRealEnTantQueBeneficiaire = nbServicesAvantRealEnTantQueBeneficiaire;
	}

	public Long getNbServicesTerminesEnTantQueBeneficiaire() {
		return nbServicesTerminesEnTantQueBeneficiaire;
	}

	public void setNbServicesTerminesEnTantQueBeneficiaire(Long nbServicesTerminesEnTantQueBeneficiaire) {
		this.nbServicesTerminesEnTantQueBeneficiaire = nbServicesTerminesEnTantQueBeneficiaire;
	}

	public Long getNbServicesAvantRealEnTantQueVolontaire() {
		return nbServicesAvantRealEnTantQueVolontaire;
	}

	public void setNbServicesAvantRealEnTantQueVolontaire(Long nbServicesAvantRealEnTantQueVolontaire) {
		this.nbServicesAvantRealEnTantQueVolontaire = nbServicesAvantRealEnTantQueVolontaire;
	}

	public Long getNbServicesTerminesEnTantQueVolontaire() {
		return nbServicesTerminesEnTantQueVolontaire;
	}

	public void setNbServicesTerminesEnTantQueVolontaire(Long nbServicesTerminesEnTantQueVolontaire) {
		this.nbServicesTerminesEnTantQueVolontaire = nbServicesTerminesEnTantQueVolontaire;
	}

	public Long getNbLitigesOuverts() {
		return nbLitigesOuverts;
	}

	public void setNbLitigesOuverts(Long nbLitigesOuverts) {
		this.nbLitigesOuverts = nbLitigesOuverts;
	}

	public Long getNbLitigesFermes() {
		return nbLitigesFermes;
	}

	public void setNbLitigesFermes(Long nbLitigesFermes) {
		this.nbLitigesFermes = nbLitigesFermes;
	}

	public BarChartModel getBarModelLitiges() {
		return barModelLitiges;
	}

	public void setBarModelLitiges(BarChartModel barModelLitiges) {
		this.barModelLitiges = barModelLitiges;
	}

	public BarChartModel getBarModelVolontaire() {
		return barModelVolontaire;
	}

	public void setBarModelVolontaire(BarChartModel barModelVolontaire) {
		this.barModelVolontaire = barModelVolontaire;
	}



	
}
