package fr.eql.ai108.projet3.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import fr.eql.ai108.projet3.entity.Service;

@ManagedBean (name="mbServiceSession")
public class ServiceSessionManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Service service = new Service();

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	
	
	
}
