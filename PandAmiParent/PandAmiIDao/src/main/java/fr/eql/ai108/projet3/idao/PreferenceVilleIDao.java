package fr.eql.ai108.projet3.idao;

import java.util.List;

import fr.eql.ai108.projet3.entity.PreferenceVille;
import fr.eql.ai108.projet3.entity.Utilisateur;

public interface PreferenceVilleIDao extends GenericIDao<PreferenceVille>{
	void deletePreferencesVilleByUser(Utilisateur utilisateur);
	List<PreferenceVille> getPrefsVilleByUser(Utilisateur utilisateur);
}
