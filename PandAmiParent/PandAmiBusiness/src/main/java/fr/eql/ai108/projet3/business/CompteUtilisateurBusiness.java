package fr.eql.ai108.projet3.business;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.projet3.entity.Genre;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.ibusiness.CompteUtilisateurIBusiness;
import fr.eql.ai108.projet3.idao.UtilisateurIDao;

@Remote (CompteUtilisateurIBusiness.class)
@Stateless
public class CompteUtilisateurBusiness implements CompteUtilisateurIBusiness {

	@EJB
	private UtilisateurIDao proxyUtilisateur;
	private GenreIDao proxyGenre;
	
	
	@Override
	public Utilisateur creerCompte(Utilisateur utilisateur) {
		Utilisateur utilisateur2 = null;
		if(!(proxyUtilisateur.exist(utilisateur))) {
			utilisateur2 = proxyUtilisateur.add(utilisateur);
		}
		return utilisateur2;
	}

	@Override
	public Utilisateur connection(String email, String password) {
		return proxyUtilisateur.authenticate(email, password);
	}

	@Override
	public List<Genre> displayGenre() {
		return proxyUtilisateur.getAll();
	}

}
