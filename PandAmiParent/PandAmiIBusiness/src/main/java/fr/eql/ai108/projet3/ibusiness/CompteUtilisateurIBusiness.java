package fr.eql.ai108.projet3.ibusiness;
import java.util.List;

import fr.eql.ai108.projet3.entity.Genre;
import fr.eql.ai108.projet3.entity.Utilisateur;

public interface CompteUtilisateurIBusiness {
	Utilisateur creerCompte(Utilisateur utilisateur);
	Utilisateur connection (String email, String password);
	List<Genre> displayGenre();
}
