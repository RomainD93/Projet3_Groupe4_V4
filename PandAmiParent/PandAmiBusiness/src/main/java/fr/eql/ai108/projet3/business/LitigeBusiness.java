package fr.eql.ai108.projet3.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.projet3.entity.Litige;
import fr.eql.ai108.projet3.entity.ReponseService;
import fr.eql.ai108.projet3.ibusiness.LitigeIBusiness;
import fr.eql.ai108.projet3.idao.LitigeIDao;

@Remote(LitigeIBusiness.class)
@Stateless
public class LitigeBusiness implements LitigeIBusiness {

	@EJB
	LitigeIDao proxyLitigeDao;
	
	
	@Override
	public List<Litige> displayAllLitiges() {		
		return proxyLitigeDao.getAll();
	}

	@Override
	public List<Litige> displayLitigesOuverts() {		
		return proxyLitigeDao.getAllLitigesOuverts();
	}

	@Override
	public List<Litige> displayLitigesClotures() {
		return proxyLitigeDao.getAllLitigesClotures();
	}

	@Override
	public List<Litige> displayLitiges1Retard() {		
		return proxyLitigeDao.getAllLitiges1Retard();
	}

	@Override
	public List<Litige> displayLitiges2Financier() {		
		return proxyLitigeDao.getAllLitiges2Financier();
	}

	@Override
	public List<Litige> displayLitiges3Casse() {		
		return proxyLitigeDao.getAllLitiges3Casse();
	}

	@Override
	public List<Litige> displayLitiges4Violence() {		
		return proxyLitigeDao.getAllLitiges4Violence();
	}

	@Override
	public List<Litige> displayLitiges5Comportment() {		
		return proxyLitigeDao.getAllLitiges5Comportement();
	}

	@Override
	public Litige creerLitige(Litige litige) {		
		return proxyLitigeDao.add(litige);
	}

	@Override
	public Litige updateLitige(Litige litige) {
		return proxyLitigeDao.update(litige);
	}

	@Override
	public ReponseService displayReponseServiceDuLitige(Litige litige) {
		return proxyLitigeDao.getLastReponseServiceByLitige(litige);
	}

}
