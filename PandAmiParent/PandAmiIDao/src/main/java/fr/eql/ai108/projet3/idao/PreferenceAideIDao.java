package fr.eql.ai108.projet3.idao;

import java.util.List;

import fr.eql.ai108.projet3.entity.PreferenceAide;
import fr.eql.ai108.projet3.entity.Utilisateur;

public interface PreferenceAideIDao extends GenericIDao<PreferenceAide> {
	void deletePrefsTypeAideByUser(Utilisateur utilisateur);
	List<PreferenceAide> getPrefsTypeAideByUser(Utilisateur utilisateur);
}
