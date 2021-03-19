package fr.eql.ai108.projet3.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import fr.eql.ai108.projet3.entity.Service;

import fr.eql.ai108.projet3.idao.ChartsIDao;

@Remote(ChartsIDao.class)
@Stateless
public class ChartsDao implements ChartsIDao{
	
	@PersistenceContext(unitName ="PUPandAmi")
	private EntityManager em;

	@Override
	public Long getServicesClosedCat1() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.typeAide.categorieAide.id = 1 AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getServicesClosedCat2() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.typeAide.categorieAide.id = 2 AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getServicesClosedCat3() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.typeAide.categorieAide.id = 3 AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getServicesClosedCat4() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.typeAide.categorieAide.id = 4 AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getServicesClosedCat5() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.typeAide.categorieAide.id = 5 AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getServicesClosedCat6() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.typeAide.categorieAide.id = 6 AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getServicesClosedCat7() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.typeAide.categorieAide.id = 7 AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getServicesClosedCat8() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.typeAide.categorieAide.id = 8 AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getServicesClosedCat9() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.typeAide.categorieAide.id = 9 AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getServicesClosedCat10() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.typeAide.categorieAide.id = 10 AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getServicesClosedCat11() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.typeAide.categorieAide.id = 11 AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

}
