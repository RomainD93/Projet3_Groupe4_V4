package fr.eql.ai108.projet3.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.projet3.entity.ReponseService;
import fr.eql.ai108.projet3.idao.ReponseServiceIDao;

@Remote(ReponseServiceIDao.class)
@Stateless
public class ReponseServiceDao extends GenericDao<ReponseService> implements ReponseServiceIDao{

}
