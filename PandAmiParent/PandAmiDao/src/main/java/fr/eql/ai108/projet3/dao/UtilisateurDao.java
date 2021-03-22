package fr.eql.ai108.projet3.dao;

import java.time.LocalDate;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.projet3.entity.Disponibilite;
import fr.eql.ai108.projet3.entity.JourSemaine;
import fr.eql.ai108.projet3.entity.PreferenceVille;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.entity.Ville;
import fr.eql.ai108.projet3.idao.UtilisateurIDao;
import fr.eql.ai108.projet3.entity.Service;

@Remote(UtilisateurIDao.class)
@Stateless
public class UtilisateurDao extends GenericDao<Utilisateur> implements UtilisateurIDao{

	@PersistenceContext(unitName ="PUPandAmi")
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

	@Override
	public List<JourSemaine> getJoursSemaine() {
		Query query = em.createQuery("SELECT j FROM JourSemaine j");
		List<JourSemaine> joursSemaine = query.getResultList();
		return joursSemaine;
	}

	@Override
	public List<Disponibilite> getDisponibilites() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ville> getVilles() {
		Query query = em.createQuery("SELECT v FROM Ville v");
		List<Ville> villes = query.getResultList();
		return villes;
	}

	@Override
	public List<PreferenceVille> getPrefsVille() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getServicesClosedCat1() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.typeAide.categorieAide.id = 1");
		Integer result = (Integer) query.getSingleResult();
		return result;
	}

	@Override
	public Long getNbServicesEnAttenteDeVolontaireEnTantQueBeneficiaire(Utilisateur utilisateur) {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.dateAcceptation IS NULL AND s.utilisateur = :paramUser AND s.dateService > :paramDate");
		query.setParameter("paramUser", utilisateur);
		query.setParameter("paramDate", LocalDate.now());
		Long result =  (Long) query.getSingleResult();
		return result;
		
	}

	@Override
	public Long getNbServicesAvantRealEnTantQueBeneficiaire(Utilisateur utilisateur) {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.dateAcceptation IS NOT NULL AND s.utilisateur = :paramUser AND s.dateService > :paramDate");
		query.setParameter("paramUser", utilisateur);
		query.setParameter("paramDate", LocalDate.now());
		Long result =  (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getNbServicesTerminesEnTantQueBeneficiaire(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getNbServicesAvantRealEnTantQueVolontaire(Utilisateur utilisateur) {
		System.out.println("ENTREE AVANT REQUEST");
		Query query = em.createQuery("SELECT COUNT(r) FROM ReponseService r WHERE r.utilisateur = :paramUser AND r.service.dateService > :paramDate AND r.dateDesistement IS NULL");
		query.setParameter("paramUser", utilisateur);
		query.setParameter("paramDate", LocalDate.now());
		Long result =  (Long) query.getSingleResult();
		System.out.println("resultat" + result);
		return result;
	}

	@Override
	public Long getNbServicesTerminesEnTantQueVolontaire(Utilisateur utilisateur) {
		
		Query query = em.createQuery("SELECT COUNT(r) FROM ReponseService r WHERE r.utilisateur = :paramUser AND r.service.dateService < :paramDate AND r.dateDesistement IS NULL");
		query.setParameter("paramUser", utilisateur);
		query.setParameter("paramDate", LocalDate.now());
		Long result =  (Long) query.getSingleResult();
		
		return result;
	}

	@Override
	public Long getNbLitigesOuverts(Utilisateur utilisateur) {
		Query query = em.createQuery("SELECT COUNT(l) FROM Litige l WHERE l.utilisateur = :paramUser AND l.dateCloture IS NULL");
		query.setParameter("paramUser", utilisateur);
		Long result =  (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getNbLitigesFermes(Utilisateur utilisateur) {
		Query query = em.createQuery("SELECT COUNT(l) FROM Litige l WHERE l.utilisateur = :paramUser AND l.dateCloture IS NOT NULL");
		query.setParameter("paramUser", utilisateur);
		Long result =  (Long) query.getSingleResult();
		return result;
	}


	
}
