package fr.eql.ai108.projet3.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;
import fr.eql.ai108.projet3.ibusiness.ServiceIBusiness;
import fr.eql.ai108.projet3.idao.ServiceIDao;

@Remote(ServiceIBusiness.class)
@Stateless
public class ServiceBusiness implements ServiceIBusiness {

	@EJB
	ServiceIDao proxyServiceDao;
	
	@Override
	public List<Service> displayService() {
		
		return proxyServiceDao.getAll();
	}

	@Override
	public Long numServices() {
		// TODO Auto-generated method stub
		return proxyServiceDao.getNbServices();
	}

	@Override
	public Service creerService(Service service) {		 
		return proxyServiceDao.add(service);
	}

	@Override
	public List<TypeAide> displayTypeAide() {	
		return proxyServiceDao.typesAide();
	}



}