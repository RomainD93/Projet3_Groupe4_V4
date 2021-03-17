package fr.eql.ai108.projet3.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import fr.eql.ai108.projet3.entity.Litige;

@ManagedBean (name = "mbModerateur")
@ViewScoped
public class ModerateurManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private List<Litige> litiges = new ArrayList<Litige>();

	
	
	
	public List<Litige> getLitiges() {
		return litiges;
	}

	public void setLitiges(List<Litige> litiges) {
		this.litiges = litiges;
	}
	
	
	
}
