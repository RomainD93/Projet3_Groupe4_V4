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


	@Override
	public Long displayNbreInscriptionsAvril2020() {
		return proxyChartsDao.getInscriptionsAvril();
	}

	@Override
	public Long displayNbreInscriptionsMai2020() {
		return proxyChartsDao.getInscriptionsMai();
	}

	@Override
	public Long displayNbreInscriptionsJuin2020() {
		return proxyChartsDao.getInscriptionsJuin();
	}

	@Override
	public Long displayNbreInscriptionsJuillet2020() {
		return proxyChartsDao.getInscriptionsJuillet();
	}
	@Override
	public Long displayNbreInscriptionsAout2020() {
		return proxyChartsDao.getInscriptionsAout();
	}

	@Override
	public Long displayNbreInscriptionsSeptembre2020() {
		return proxyChartsDao.getInscriptionsSeptembre();
	}

	@Override
	public Long displayNbreInscriptionsOctobre2020() {
		return proxyChartsDao.getInscriptionsOctobre();
	}

	@Override
	public Long displayNbreInscriptionsNovembre2020() {
		return proxyChartsDao.getInscriptionsNovembre();
	}

	@Override
	public Long displayNbreInscriptionsDecembre2020() {
		return proxyChartsDao.getInscriptionsDecembre();
	}

	@Override
	public Long displayNbreInscriptionsJanvier2021() {	
		return proxyChartsDao.getInscriptionsJanvier();
	}

	@Override
	public Long displayNbreInscriptionsFevrier2021() {
		return proxyChartsDao.getInscriptionsFevrier();
	}

	@Override
	public Long displayNbreInscriptionsMars2021() {
		return proxyChartsDao.getInscriptionsMars();
	}

	@Override
	public Long displayNbreInscriptionsAvril2021() {
		return proxyChartsDao.getInscriptionsAvril2021();
	}

	@Override
	public Long displayNbServicesCloturesJanv() {
		return proxyChartsDao.getNbServicesCloturesJanv();
	}

	@Override
	public Long displayNbServicesCloturesFev() {
		// TODO Auto-generated method stub
		return proxyChartsDao.getNbServicesCloturesFev();
	}

	@Override
	public Long displayNbServicesCloturesMars() {
		// TODO Auto-generated method stub
		return proxyChartsDao.getNbServicesCloturesMars();
	}

	@Override
	public Long displayNbServicesCloturesAvril() {
		// TODO Auto-generated method stub
		return proxyChartsDao.getNbServicesCloturesAvril();
	}

	@Override
	public Long displayNbServicesNonCloturesJanv() {
		// TODO Auto-generated method stub
		return proxyChartsDao.getNbServicesNonCloturesJanv();
	}

	@Override
	public Long displayNbServicesNonCloturesFev() {
		// TODO Auto-generated method stub
		return proxyChartsDao.getNbServicesNonCloturesFev();
	}

	@Override
	public Long displayNbServicesNonCloturesMars() {
		// TODO Auto-generated method stub
		return proxyChartsDao.getNbServicesNonCloturesMars();
	}

	@Override
	public Long displayNbServicesNonCloturesAvril() {
		// TODO Auto-generated method stub
		return proxyChartsDao.getNbServicesNonCloturesAvril();
	}


}
