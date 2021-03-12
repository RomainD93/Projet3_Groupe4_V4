package fr.eql.ai108.projet3.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.projet3.entity.Genre;
import fr.eql.ai108.projet3.idao.GenreIDao;

@Remote(GenreIDao.class)
@Stateless
public class GenreDao extends GenericDao<Genre> implements GenreIDao{

	@PersistenceContext (unitName="PUPandAmi")
	private EntityManager em;
	
	@Override
	public List<Genre> getAll() {
		Query query = em.createQuery("SELECT g FROM Genre g");
		List<Genre> genres = query.getResultList();
		return genres;
	}
	
}
