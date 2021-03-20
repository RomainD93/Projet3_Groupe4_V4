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



	@Override
	public Long getInscriptionsAvril() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2020-04-01' AND u.dateInscription <= '2020-04-30'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getInscriptionsMai() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2020-05-01' AND u.dateInscription <= '2020-05-31'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getInscriptionsJuin() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2020-06-01' AND u.dateInscription <= '2020-06-30'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getInscriptionsJuillet() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2020-07-01' AND u.dateInscription <= '2020-07-31'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getInscriptionsAout() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2020-08-01' AND u.dateInscription <= '2020-08-31'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getInscriptionsSeptembre() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2020-09-01' AND u.dateInscription <= '2020-09-30'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getInscriptionsOctobre() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2020-10-01' AND u.dateInscription <= '2020-10-31'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getInscriptionsNovembre() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2020-11-01' AND u.dateInscription <= '2020-11-30'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getInscriptionsDecembre() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2020-12-01' AND u.dateInscription <= '2020-12-31'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}
	
	@Override
	public Long getInscriptionsJanvier() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2021-01-01' AND u.dateInscription <= '2021-01-31'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getInscriptionsFevrier() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2021-02-01' AND u.dateInscription <= '2021-02-28'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getInscriptionsMars() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2021-03-01' AND u.dateInscription <= '2021-03-31'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getInscriptionsAvril2021() {
		Query query = em.createQuery("SELECT COUNT(u) FROM Utilisateur u WHERE u.dateInscription >=  '2021-04-01' AND u.dateInscription <= '2021-04-30'");	
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getNbServicesCloturesJanv() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.dateService >= '2021-01-01' AND s.dateService <= '2021-01-31' AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getNbServicesCloturesFev() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.dateService >= '2021-02-01' AND s.dateService <= '2021-02-28' AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getNbServicesCloturesMars() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.dateService >= '2021-03-01' AND s.dateService <= '2021-03-31' AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getNbServicesCloturesAvril() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.dateService >= '2021-04-01' AND s.dateService <= '2021-04-30' AND s.dateCloture IS NOT NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getNbServicesNonCloturesJanv() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.dateService >= '2021-01-01' AND s.dateService <= '2021-01-31' AND s.dateCloture IS NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getNbServicesNonCloturesFev() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.dateService >= '2021-02-01' AND s.dateService <= '2021-02-28' AND s.dateCloture IS NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getNbServicesNonCloturesMars() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.dateService >= '2021-03-01' AND s.dateService <= '2021-03-31' AND s.dateCloture IS NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

	@Override
	public Long getNbServicesNonCloturesAvril() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s WHERE s.dateService >= '2021-04-01' AND s.dateService <= '2021-04-30' AND s.dateCloture IS NULL");
		Long result = (Long) query.getSingleResult();
		return result;
	}

}
