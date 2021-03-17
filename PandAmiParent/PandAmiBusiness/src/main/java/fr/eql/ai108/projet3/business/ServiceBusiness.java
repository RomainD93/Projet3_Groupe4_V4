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
import fr.eql.ai108.projet3.entity.Utilisateur;
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
		System.out.println(reponseService.getUtilisateur().getNom() + reponseService.getService().getId());
		return proxyReponseServiceDao.add(reponseService);
	}

	@Override
	public ReponseService updateReponseService(ReponseService reponseService) {
		return proxyReponseServiceDao.update(reponseService);
	}

	@Override
	public List<CategorieAide> displayCategorieAide() {
		return proxyServiceDao.getCategoriesAide();
	}

	@Override
	public List<TypeAide> displayTypesAideCat1() {
		return proxyServiceDao.getTypesAideCat1();
	}

	@Override
	public List<TypeAide> displayTypesAideCat2() {
		return proxyServiceDao.getTypesAideCat2();
	}

	@Override
	public List<TypeAide> displayTypesAideCat3() {
		// TODO Auto-generated method stub
		return proxyServiceDao.getTypesAideCat3();
	}

	@Override
	public List<TypeAide> displayTypesAideCat4() {
		// TODO Auto-generated method stub
		return proxyServiceDao.getTypesAideCat4();
	}

	@Override
	public List<TypeAide> displayTypesAideCat5() {
		// TODO Auto-generated method stub
		return proxyServiceDao.getTypesAideCat5();
	}

	@Override
	public List<TypeAide> displayTypesAideCat6() {
		// TODO Auto-generated method stub
		return proxyServiceDao.getTypesAideCat6();
	}

	@Override
	public List<TypeAide> displayTypesAideCat7() {
		// TODO Auto-generated method stub
		return proxyServiceDao.getTypesAideCat7();
	}

	@Override
	public List<TypeAide> displayTypesAideCat8() {
		// TODO Auto-generated method stub
		return proxyServiceDao.getTypesAideCat8();
	}

	@Override
	public List<TypeAide> displayTypesAideCat9() {
		// TODO Auto-generated method stub
		return proxyServiceDao.getTypesAideCat9();
	}

	@Override
	public List<TypeAide> displayTypesAideCat10() {
		// TODO Auto-generated method stub
		return proxyServiceDao.getTypesAideCat10();
	}

	@Override
	public List<TypeAide> displayTypesAideCat11() {
		// TODO Auto-generated method stub
		return proxyServiceDao.getTypesAideCat11();
	}

	@Override
	public ReponseService updateDesistementService(Service service, Utilisateur userConnected) {
		// TODO Auto-generated method stub
		return proxyServiceDao.getReponseService(service, userConnected);
	}

	@Override
	public List<Service> displayServiceBeneficiaire(Utilisateur userConnected) {
		return proxyServiceDao.getServiceByBeneficiaire(userConnected);
	}

	@Override
	public List<Service> displayServiceVolontaire(Utilisateur userConnected) {		
		return proxyServiceDao.getServiceByVolontaire(userConnected);
	}



	


}
