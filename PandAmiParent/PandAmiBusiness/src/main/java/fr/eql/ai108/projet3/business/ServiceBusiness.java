package fr.eql.ai108.projet3.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.Materiel;
import fr.eql.ai108.projet3.entity.ReponseService;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;
import fr.eql.ai108.projet3.ibusiness.ServiceIBusiness;
import fr.eql.ai108.projet3.idao.ReponseServiceIDao;
import fr.eql.ai108.projet3.idao.ServiceIDao;

@Remote(ServiceIBusiness.class)
@Stateless
public class ServiceBusiness implements ServiceIBusiness {

	@EJB
	ServiceIDao proxyServiceDao;
	
	@EJB
	ReponseServiceIDao proxyReponseServiceDao;
	
	
	@Override
	public List<Service> displayService() {
		
		return proxyServiceDao.getAll();
	}
	
	@Override
	public List<Service> displayServiceSsVolontaire() {
		return proxyServiceDao.getAllNoVolontaire();
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

	@Override
	public List<Materiel> displayMateriel() {
		return proxyServiceDao.materiels();
	}

	@Override
	public Service updateService(Service service) {
		return proxyServiceDao.update(service);
	}

	@Override
	public ReponseService creerReponseService(ReponseService reponseService) {
		return proxyReponseServiceDao.add(reponseService);
	}

	@Override
	public ReponseService updateReponseService(ReponseService reponseService) {
		return proxyReponseServiceDao.update(reponseService);
	}



	


}
