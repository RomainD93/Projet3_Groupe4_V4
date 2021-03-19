package fr.eql.ai108.projet3.business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.projet3.ibusiness.ChartsIBusiness;
import fr.eql.ai108.projet3.idao.ChartsIDao;

@Remote(ChartsIBusiness.class)
@Stateless
public class ChartsBusiness implements ChartsIBusiness{

	@EJB
	private ChartsIDao proxyChartsDao;
	
	@Override
	public Long displayNumberServicesCat1() {		
		return proxyChartsDao.getServicesClosedCat1();
	}

	@Override
	public Long displayNumberServicesCat2() {
		// TODO Auto-generated method stub
		return proxyChartsDao.getServicesClosedCat2();
	}

	@Override
	public Long displayNumberServicesCat3() {
		return proxyChartsDao.getServicesClosedCat3();
	}

	@Override
	public Long displayNumberServicesCat4() {
		return proxyChartsDao.getServicesClosedCat4();
	}

	@Override
	public Long displayNumberServicesCat5() {
		return proxyChartsDao.getServicesClosedCat5();
	}

	@Override
	public Long displayNumberServicesCat6() {
		return proxyChartsDao.getServicesClosedCat6();
	}

	@Override
	public Long displayNumberServicesCat7() {
		return proxyChartsDao.getServicesClosedCat7();
	}

	@Override
	public Long displayNumberServicesCat8() {
		return proxyChartsDao.getServicesClosedCat8();
	}

	@Override
	public Long displayNumberServicesCat9() {
		return proxyChartsDao.getServicesClosedCat9();
	}

	@Override
	public Long displayNumberServicesCat10() {
		return proxyChartsDao.getServicesClosedCat10();
	}

	@Override
	public Long displayNumberServicesCat11() {
		return proxyChartsDao.getServicesClosedCat11();
	}


}
