	package fr.eql.ai108.projet3.idao;

import java.util.List;

import fr.eql.ai108.projet3.entity.Utilisateur;

public interface UtilisateurIDao extends GenericIDao<Utilisateur> {
	Boolean exist(Utilisateur utilisateur);
	Utilisateur authenticate(String email, String password);
	Long getNbUtilisateurs();
	List<Utilisateur> getAll();
	
}
