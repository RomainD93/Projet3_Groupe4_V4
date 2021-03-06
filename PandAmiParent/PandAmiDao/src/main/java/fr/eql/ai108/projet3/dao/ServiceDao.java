package fr.eql.ai108.projet3.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.JourSemaine;
import fr.eql.ai108.projet3.entity.Materiel;
import fr.eql.ai108.projet3.entity.ReponseService;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.idao.ServiceIDao;

@Remote(ServiceIDao.class)
@Stateless
public class ServiceDao extends GenericDao<Service> implements ServiceIDao{

	@PersistenceContext (unitName="PUPandAmi")
	private EntityManager em;
	
	@Override
	public List<Service> getAll(Utilisateur userConnected) {
		Query query = em.createQuery("SELECT s FROM Service s WHERE s.dateAnnulation IS null AND s.dateAcceptation IS null AND s.utilisateur != :paramUser AND s.dateCloture IS null AND s.dateService >= :paramDate");
		query.setParameter("paramUser", userConnected);
		query.setParameter("paramDate", LocalDate.now());
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
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 3");
		List<TypeAide> typesAideCat3 = query.getResultList();
		return typesAideCat3;
	}

	@Override
	public List<TypeAide> getTypesAideCat4() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 4");
		List<TypeAide> typesAideCat4 = query.getResultList();
		return typesAideCat4;
	}

	@Override
	public List<TypeAide> getTypesAideCat5() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 5");
		List<TypeAide> typesAideCat5 = query.getResultList();
		return typesAideCat5;
	}

	@Override
	public List<TypeAide> getTypesAideCat6() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 6");
		List<TypeAide> typesAideCat6 = query.getResultList();
		return typesAideCat6;
	}

	@Override
	public List<TypeAide> getTypesAideCat7() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 7");
		List<TypeAide> typesAideCat7 = query.getResultList();
		return typesAideCat7;
	}

	@Override
	public List<TypeAide> getTypesAideCat8() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 8");
		List<TypeAide> typesAideCat8 = query.getResultList();
		return typesAideCat8;
	}

	@Override
	public List<TypeAide> getTypesAideCat9() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 9");
		List<TypeAide> typesAideCat9 = query.getResultList();
		return typesAideCat9;
	}

	@Override
	public List<TypeAide> getTypesAideCat10() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 10");
		List<TypeAide> typesAideCat10 = query.getResultList();
		return typesAideCat10;
	}

	@Override
	public List<TypeAide> getTypesAideCat11() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 11");
		List<TypeAide> typesAideCat11 = query.getResultList();
		return typesAideCat11;
	}

	@Override
	public ReponseService getReponseService(Service service, Utilisateur userConnected) {
		Query query = em.createQuery("SELECT r FROM ReponseService r WHERE r.utilisateur = :paramUser AND r.service = :paramService ");
		query.setParameter("paramUser", userConnected);
		query.setParameter("paramService", service);
		ReponseService rs = (ReponseService) query.getSingleResult();
		return rs;
	}

	@Override
	public List<Service> getServiceByBeneficiaire(Utilisateur userConnected) {
		Query query = em.createQuery("SELECT s FROM Service s WHERE s.utilisateur = :paramUser AND s.dateAnnulation IS null AND s.dateService >= :paramDate");
		query.setParameter("paramUser", userConnected);
		query.setParameter("paramDate", LocalDate.now());
		List<Service> serviceBeneficiaire = query.getResultList();
		return serviceBeneficiaire;
	}

	@Override
	public List<Service> getServiceByVolontaire(Utilisateur userConnected) {
		Query query = em.createQuery("SELECT s FROM Service s, ReponseService r WHERE s.id = r.service.id AND s.dateService >= :paramDate AND r.dateDesistement IS null AND r.utilisateur = :paramUser AND s.dateAnnulation IS null");
		query.setParameter("paramUser", userConnected);
		query.setParameter("paramDate", LocalDate.now());
		List<Service> serviceVolontaire = query.getResultList();
		return serviceVolontaire;
	}

	@Override
	public List<Service> getServiceByPref(Utilisateur userConnected) {
		Query query = em.createQuery("SELECT s FROM Service s, PreferenceAide p, PreferenceVille pv WHERE s.typeAide = p.typeAide AND s.dateAcceptation IS null AND s.adresse LIKE ('%' || pv.ville.codePostal || '%')	AND pv.utilisateur = :paramUser  AND p.utilisateur = :paramUser AND s.dateAnnulation IS null AND s.dateService >= :paramDate");
		query.setParameter("paramUser", userConnected);
		query.setParameter("paramDate", LocalDate.now());
		List<Service> servicePref = query.getResultList();
		return servicePref;
	}

	@Override
	public List<Service> getServiceTermine(Utilisateur userConnected) {
		Query query = em.createQuery("SELECT s FROM Service s, ReponseService r WHERE r.utilisateur = :paramUser AND r.service.id = s.id AND r.dateAcceptation IS NOT null AND r.dateDesistement IS null AND s.dateService < :paramDate");
		Query query2 = em.createQuery("SELECT s FROM Service s WHERE s.utilisateur = :paramUser AND s.dateService < :paramDate AND s.dateAnnulation IS null");
		query.setParameter("paramUser", userConnected);
		query.setParameter("paramDate", LocalDate.now());
		query2.setParameter("paramUser", userConnected);
		query2.setParameter("paramDate", LocalDate.now());
		List<Service> serviceTermine1 = query.getResultList();
		List<Service> serviceTermine2 = query2.getResultList();
		List<Service> serviceTermine = new ArrayList<Service>();
		serviceTermine.addAll(serviceTermine1);
		serviceTermine.addAll(serviceTermine2);

		return serviceTermine;
	}

	@Override
	public ReponseService getReponseServiceByService(Service service) {
		//System.out.println("Entree methode Dao get beneficiaire");
		ReponseService rs = new ReponseService();
		if(service.getDateAcceptation() != null) {
		Query query = em.createQuery("SELECT r FROM ReponseService r WHERE r.service = :paramService AND r.dateDesistement IS NULL");
		query.setParameter("paramService", service);		
			rs = (ReponseService) query.getSingleResult();		
		}
		return rs;
	}

	@Override
	public Utilisateur getVolontaireByService(Service service) {
		Query query = em.createQuery("SELECT r.utilisateur FROM ReponseService r WHERE r.service =:paramService");
		query.setParameter("paramService", service);
		if(query.getSingleResult() != null) {
			Utilisateur volontaire = (Utilisateur) query.getSingleResult();
		}
		Utilisateur volontaire = new Utilisateur();
		
		
		return volontaire;
	}	
	
}
