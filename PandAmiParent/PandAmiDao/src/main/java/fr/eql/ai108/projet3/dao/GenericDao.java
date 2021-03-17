package fr.eql.ai108.projet3.dao;



import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.eql.ai108.projet3.idao.GenericIDao;


public abstract class GenericDao<T> implements GenericIDao<T> {

	@PersistenceContext(unitName = "PUPandAmi")
	private EntityManager em;
	
	@Override
	public T add(T t) {
		try {
			//t = em.merge(t);
			em.persist(t);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return t;
	}

	@Override
	public Boolean delete(T t) {
		Boolean removed;
		try {
			t = em.merge(t);
			em.remove(t);
			removed = true;
		} catch (Exception e) {
			e.printStackTrace();
			removed = false;
		}		
		return removed;
	}

	@Override
	public T update(T t) {
		try {
			t = em.merge(t);;
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return t;
	}

	@Override
	public T findById(Integer id) {
		T t = null;
		try {
			String className = ((ParameterizedType)getClass()
					.getGenericSuperclass()).getActualTypeArguments()[0]
							.getTypeName();
			Class<?> clazz;
			clazz = Class.forName(className);
			t = (T) em.find(clazz, id);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return t;
	}

	
}
