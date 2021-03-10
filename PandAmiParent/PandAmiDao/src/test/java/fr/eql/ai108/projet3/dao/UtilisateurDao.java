package fr.eql.ai108.projet3.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.idao.UtilisateurIDao;

@Remote(UtilisateurIDao.class)
@Stateless
public class UtilisateurDao extends GenericDao<Utilisateur> implements UtilisateurIDao{

	@PersistenceContext(unitName ="PUPandami")
	private EntityManager em;
	
	@Override
	public Boolean exist(Utilisateur utilisateur) {
		Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.email = :paramEmail");
		query.setParameter("paramEmail", utilisateur.getEmail());
		List<Utilisateur> utilisateurs = query.getResultList();
		return utilisateurs.size() > 0 ? true : false;
	}

	@Override
	public Utilisateur authenticate(String email, String password) {
		Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.email = :paramEmail AND u.password = :paramPassword");
		Utilisateur utilisateurConnecte =null;
		query.setParameter("paramEmail", email);
		query.setParameter("paramPassword", password);
		List<Utilisateur> utilisateurs = query.getResultList();
		if (utilisateurs.size()>0) {
			utilisateurConnecte = utilisateurs.get(0);
		}
		return utilisateurConnecte;
	}

	@Override
	public Long getNbUtilisateurs() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u");
		Long nbUtilisateurs = (Long) query.getSingleResult();
		return nbUtilisateurs;
	}

	@Override
	public List<Utilisateur> getAll() {
		Query query = em.createQuery("SELECT u FROM Utilisateur u");
		List<Utilisateur> utilisateurs = query.getResultList();
		return utilisateurs;
	}

	
}
