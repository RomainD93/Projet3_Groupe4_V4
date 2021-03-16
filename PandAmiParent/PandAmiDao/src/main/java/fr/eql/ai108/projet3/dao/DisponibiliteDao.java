package fr.eql.ai108.projet3.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.projet3.entity.Disponibilite;
import fr.eql.ai108.projet3.entity.Utilisateur;
import fr.eql.ai108.projet3.idao.DisponibiliteIDao;

@Remote(DisponibiliteIDao.class)
@Stateless
public class DisponibiliteDao extends GenericDao<Disponibilite> implements DisponibiliteIDao{

	@PersistenceContext (unitName="PUPandAmi")
	private EntityManager em;

	@Override
	public List<Disponibilite> addList(List<Disponibilite> disponibilites) {
		try {
			for (Disponibilite disponibilite : disponibilites) {
				em.persist(disponibilite);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return disponibilites;
		
	}

	@Override
	public void deleteDisposByUser(Utilisateur utilisateurConnected) {
		Query query = em.createQuery("SELECT d FROM Disponibilite d WHERE d.utilisateur.id = :paramUserId");
		query.setParameter("paramUserId", utilisateurConnected.getId());
		List<Disponibilite> disposUserId = query.getResultList();
		for (Disponibilite disponibilite : disposUserId) {
			disponibilite = em.merge(disponibilite);
			em.remove(disponibilite);
		}		
	}

}
