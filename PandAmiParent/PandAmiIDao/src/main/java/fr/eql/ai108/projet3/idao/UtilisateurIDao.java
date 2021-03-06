package fr.eql.ai108.projet3.idao;

import java.util.List;

import fr.eql.ai108.projet3.entity.Disponibilite;
import fr.eql.ai108.projet3.entity.JourSemaine;
import fr.eql.ai108.projet3.entity.PreferenceVille;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.entity.Ville;

public interface UtilisateurIDao extends GenericIDao<Utilisateur> {
	Boolean exist(Utilisateur utilisateur);
	Utilisateur authenticate(String email, String password);
	Long getNbUtilisateurs();
	List<Utilisateur> getAll();
	List<JourSemaine> getJoursSemaine();
	List<Disponibilite> getDisponibilites();
	List<Ville> getVilles();
	List<PreferenceVille> getPrefsVille();
	Integer getServicesClosedCat1();
	
	Long getNbServicesEnAttenteDeVolontaireEnTantQueBeneficiaire(Utilisateur utilisateur);
	Long getNbServicesAvantRealEnTantQueBeneficiaire(Utilisateur utilisateur);
	Long getNbServicesTerminesEnTantQueBeneficiaire(Utilisateur utilisateur);
	Long getNbServicesAvantRealEnTantQueVolontaire(Utilisateur utilisateur);
	Long getNbServicesTerminesEnTantQueVolontaire(Utilisateur utilisateur);
	Long getNbLitigesOuverts(Utilisateur utilisateur);
	Long getNbLitigesFermes(Utilisateur utilisateur);

}
