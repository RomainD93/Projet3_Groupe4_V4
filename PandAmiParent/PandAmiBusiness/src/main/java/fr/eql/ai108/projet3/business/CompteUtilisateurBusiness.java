package fr.eql.ai108.projet3.business;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.projet3.entity.Disponibilite;
import fr.eql.ai108.projet3.entity.Genre;
import fr.eql.ai108.projet3.entity.JourSemaine;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.ibusiness.CompteUtilisateurIBusiness;
import fr.eql.ai108.projet3.idao.DisponibiliteIDao;
import fr.eql.ai108.projet3.idao.GenreIDao;
import fr.eql.ai108.projet3.idao.UtilisateurIDao;

@Remote (CompteUtilisateurIBusiness.class)
@Stateless
public class CompteUtilisateurBusiness implements CompteUtilisateurIBusiness {

	@EJB
	private UtilisateurIDao proxyUtilisateur;
	@EJB
	private GenreIDao proxyGenre;
	@EJB
	private DisponibiliteIDao proxyDisponibilite;
	
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
		return proxyGenre.getAll();
	}

	@Override
	public List<JourSemaine> displayJourSemaine() {
		return proxyUtilisateur.getJoursSemaine();
	}

	@Override
	public Disponibilite creerDisponibilite(Disponibilite disponibilite) {		
		return proxyDisponibilite.add(disponibilite);
	}

	@Override
	public List<Disponibilite> creerListeDisponibilites(List<Disponibilite> disponibilites) {
		
		return proxyDisponibilite.addList(disponibilites);
	}

	@Override
	public void supprimerDisposUser(Utilisateur utilisateur) {
		proxyDisponibilite.deleteDisposByUser(utilisateur);
		
	}

	@Override
	public List<Disponibilite> displayDisposUser(Utilisateur utilisateur) {
		
		return proxyDisponibilite.getDisposByUser(utilisateur);
	}
	
	

}
