package fr.eql.ai108.projet3.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.projet3.entity.Litige;
import fr.eql.ai108.projet3.entity.ReponseService;
import fr.eql.ai108.projet3.entity.TypeLitige;
import fr.eql.ai108.projet3.idao.LitigeIDao;

@Remote(LitigeIDao.class)
@Stateless
public class LitigeDao extends GenericDao<Litige> implements LitigeIDao {

	
	@PersistenceContext (unitName="PUPandAmi")
	private EntityManager em;
	
	@Override
	public List<Litige> getAll() {
		Query query = em.createQuery("SELECT l FROM Litige l ORDER BY l.dateCloture");
		List<Litige> litiges = query.getResultList();
		return litiges;
	}

	@Override
	public List<Litige> getAllLitigesOuverts() {
		Query query = em.createQuery("SELECT l FROM Litige l WHERE l.dateCloture IS NULL");
		List<Litige> litiges = query.getResultList();
		return litiges;
	}

	@Override
	public List<Litige> getAllLitigesClotures() {
		Query query = em.createQuery("SELECT l FROM Litige l WHERE l.dateCloture IS NOT NULL");
		List<Litige> litiges = query.getResultList();
		return litiges;
	}

	@Override
	public List<Litige> getAllLitiges1Retard() {
		Query query = em.createQuery("SELECT l FROM Litige l WHERE l.typeLitige.id = 1");
		List<Litige> litiges = query.getResultList();
		return litiges;
	}

	@Override
	public List<Litige> getAllLitiges2Financier() {
		Query query = em.createQuery("SELECT l FROM Litige l WHERE l.typeLitige.id = 2");
		List<Litige> litiges = query.getResultList();
		return litiges;
	}

	@Override
	public List<Litige> getAllLitiges3Casse() {
		Query query = em.createQuery("SELECT l FROM Litige l WHERE l.typeLitige.id = 3");
		List<Litige> litiges = query.getResultList();
		return litiges;
	}

	@Override
	public List<Litige> getAllLitiges4Violence() {
		Query query = em.createQuery("SELECT l FROM Litige l WHERE l.typeLitige.id = 4");
		List<Litige> litiges = query.getResultList();
		return litiges;
	}

	@Override
	public List<Litige> getAllLitiges5Comportement() {
		Query query = em.createQuery("SELECT l FROM Litige l WHERE l.typeLitige.id = 5");
		List<Litige> litiges = query.getResultList();
		return litiges;
	}

	@Override
	public ReponseService getLastReponseServiceByLitige(Litige litige) {
		Query query = em.createQuery("SELECT r FROM ReponseService r WHERE r.service = :paramLitige AND r.dateDesistement IS NULL");
		query.setParameter("paramLitige", litige.getService());
		ReponseService reponseServiceDuVolontaire = (ReponseService) query.getSingleResult();	
		return reponseServiceDuVolontaire;
	}

	@Override
	public List<TypeLitige> getTypesLitiges() {
		Query query = em.createQuery("SELECT t FROM TypeLitige t");
		List<TypeLitige> typesLitige = query.getResultList();
		return typesLitige;
	}

}
