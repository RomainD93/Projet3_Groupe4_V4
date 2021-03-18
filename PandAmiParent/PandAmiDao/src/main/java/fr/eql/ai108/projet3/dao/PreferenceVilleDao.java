package fr.eql.ai108.projet3.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.projet3.entity.PreferenceVille;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.idao.PreferenceVilleIDao;

@Remote(PreferenceVilleIDao.class)
@Stateless
public class PreferenceVilleDao extends GenericDao<PreferenceVille> implements PreferenceVilleIDao {

	@PersistenceContext (unitName="PUPandAmi")
	private EntityManager em;

	@Override
	public void deletePreferencesVilleByUser(Utilisateur utilisateur) {
		Query query = em.createQuery("DELETE FROM PreferenceVille p WHERE p.utilisateur.id = :paramUserId");
		query.setParameter("paramUserId", utilisateur.getId());
		query.executeUpdate();
	}

	@Override
	public List<PreferenceVille> getPrefsVilleByUser(Utilisateur utilisateur) {
		Query query = em.createQuery("SELECT p FROM PreferenceVille p WHERE p.utilisateur.id =  :paramUserId");
		query.setParameter("paramUserId", utilisateur.getId());
		List<PreferenceVille> prefsUser = query.getResultList();
		return prefsUser;
	}

}
