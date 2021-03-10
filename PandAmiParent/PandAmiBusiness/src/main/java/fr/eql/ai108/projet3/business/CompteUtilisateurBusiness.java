package fr.eql.ai108.projet3.business;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.ibusiness.CompteUtilisateurIBusiness;
import fr.eql.ai108.projet3.idao.UtilisateurIDao;

@Remote (CompteUtilisateurIBusiness.class)
@Stateless
public class CompteUtilisateurBusiness implements CompteUtilisateurIBusiness {

	@EJB
	private UtilisateurIDao proxyUtilisateur;
	
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

}
