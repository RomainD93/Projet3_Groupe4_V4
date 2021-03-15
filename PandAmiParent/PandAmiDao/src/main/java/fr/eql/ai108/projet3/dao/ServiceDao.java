package fr.eql.ai108.projet3.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.JourSemaine;
import fr.eql.ai108.projet3.entity.Materiel;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;
import fr.eql.ai108.projet3.idao.ServiceIDao;

@Remote(ServiceIDao.class)
@Stateless
public class ServiceDao extends GenericDao<Service> implements ServiceIDao{

	@PersistenceContext (unitName="PUPandAmi")
	private EntityManager em;
	
	@Override
	public List<Service> getAll() {
		Query query = em.createQuery("SELECT s FROM Service s");
		List<Service> services = query.getResultList();
		return services;
	}

	@Override
	public Long getNbServices() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s");
		Long nbServices = (Long) query.getSingleResult();
		return nbServices;
	}

	@Override
	public List<TypeAide> typesAide() {
		Query query = em.createQuery("SELECT t FROM TypeAide t");
		List<TypeAide> typesAide = query.getResultList();
		return typesAide;
	}

	@Override
	public List<Materiel> materiels() {
		Query query = em.createQuery("SELECT m FROM Materiel m");
		List<Materiel> materiels = query.getResultList();
		return materiels;
	}

	@Override
	public List<Service> getAllNoVolontaire() {
		System.out.println("**** REQUETE");
		Query query = em.createQuery("SELECT s FROM Service s WHERE id=1");
		List<Service> servicesSsVolontaires = query.getResultList();
		return servicesSsVolontaires;
	}

	@Override
	public List<CategorieAide> getCategoriesAide() {
		Query query = em.createQuery("SELECT c FROM CategorieAide c");
		List<CategorieAide> categoriesAide = query.getResultList();
		return categoriesAide;
	}

	@Override
	public List<TypeAide> getTypesAideCat1() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 1");
		List<TypeAide> typesAideCat1 = query.getResultList();
		return typesAideCat1;
	}

	@Override
	public List<TypeAide> getTypesAideCat2() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 2");
		List<TypeAide> typesAideCat2 = query.getResultList();
		return typesAideCat2;
	}

	@Override
	public List<TypeAide> getTypesAideCat3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeAide> getTypesAideCat4() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeAide> getTypesAideCat5() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeAide> getTypesAideCat6() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeAide> getTypesAideCat7() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeAide> getTypesAideCat8() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeAide> getTypesAideCat9() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeAide> getTypesAideCat10() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeAide> getTypesAideCat11() {
		// TODO Auto-generated method stub
		return null;
	}	
}
