package fr.eql.ai108.projet3.ibusiness;
import java.util.List;

import fr.eql.ai108.projet3.entity.Disponibilite;
import fr.eql.ai108.projet3.entity.Genre;
import fr.eql.ai108.projet3.entity.JourSemaine;
import fr.eql.ai108.projet3.entity.PreferenceAide;
import fr.eql.ai108.projet3.entity.PreferenceVille;
import fr.eql.ai108.projet3.entity.TypeAide;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.entity.Ville;

public interface CompteUtilisateurIBusiness {
	Utilisateur creerCompte(Utilisateur utilisateur);
	Utilisateur connection (String email, String password);
	List<Genre> displayGenre();
	List<JourSemaine> displayJourSemaine();
	List<Ville> displayVille();
	Disponibilite creerDisponibilite(Disponibilite disponibilite);
	List<Disponibilite> creerListeDisponibilites(List<Disponibilite> disponibilites);
	void supprimerDisposUser (Utilisateur utilisateur);
	List<Disponibilite> displayDisposUser (Utilisateur utilisateur);
	void supprimerPrefsVilleUser (Utilisateur utilisateur);
	List<PreferenceVille> displayPrefsVilleUser(Utilisateur utilisateur);
	PreferenceVille creerPrefVille(PreferenceVille preferenceVille);
	List<PreferenceAide> displayPrefsTypeAideUser (Utilisateur utilisateur);
	PreferenceAide creerPrefTypeAide (PreferenceAide preferenceAide);
	void supprimerPrefsTypeAideByUser (Utilisateur utilisateur);
}
