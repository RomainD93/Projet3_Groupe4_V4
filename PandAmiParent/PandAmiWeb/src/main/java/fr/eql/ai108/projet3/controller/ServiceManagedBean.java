package fr.eql.ai108.projet3.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.ibusiness.ServiceIBusiness;

@ManagedBean(name = "mbService")
@RequestScoped
public class ServiceManagedBean {
	
	private List<Service> services;
	private Long numServices;
	
	@EJB
	private ServiceIBusiness proxyServiceBu;
	
	@PostConstruct
	public void init (){
		services = proxyServiceBu.displayService();
	}

	public Long getNbServices() {
		numServices = proxyServiceBu.numServices();
		return numServices;
	}
	
	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

}
