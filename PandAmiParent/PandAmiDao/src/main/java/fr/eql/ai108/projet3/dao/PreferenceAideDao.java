package fr.eql.ai108.projet3.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.projet3.entity.PreferenceAide;
import fr.eql.ai108.projet3.entity.TypeAide;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.idao.PreferenceAideIDao;

@Remote(PreferenceAideIDao.class)
@Stateless
public class PreferenceAideDao extends GenericDao<PreferenceAide> implements PreferenceAideIDao{

	@PersistenceContext (unitName="PUPandAmi")
	private EntityManager em;
	
	@Override
	public void deletePrefsTypeAideByUser(Utilisateur utilisateur) {
		Query query = em.createQuery("DELETE FROM PreferenceAide p WHERE p.utilisateur.id = :paramUserId");
		query.setParameter("paramUserId", utilisateur.getId());
		query.executeUpdate();
	}

	@Override
	public List<PreferenceAide> getPrefsTypeAideByUser(Utilisateur utilisateur) {
		Query query = em.createQuery("SELECT p FROM PreferenceAide p WHERE p.utilisateur.id =  :paramUserId");
		query.setParameter("paramUserId", utilisateur.getId());
		List<PreferenceAide> prefsUser = query.getResultList();
		return prefsUser;
	}
}
