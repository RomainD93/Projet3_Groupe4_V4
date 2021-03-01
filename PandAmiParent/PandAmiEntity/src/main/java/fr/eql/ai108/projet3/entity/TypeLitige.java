package fr.eql.ai108.projet3.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type_litige")
public class TypeLitige implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomNomTypeLitige;

	public TypeLitige() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeLitige(Integer id, String nomNomTypeLitige) {
		super();
		this.id = id;
		this.nomNomTypeLitige = nomNomTypeLitige;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomNomTypeLitige() {
		return nomNomTypeLitige;
	}

	public void setNomNomTypeLitige(String nomNomTypeLitige) {
		this.nomNomTypeLitige = nomNomTypeLitige;
	}

	
}
