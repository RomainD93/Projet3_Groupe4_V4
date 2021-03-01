package fr.eql.ai108.projet3.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type_aide")
public class TypeAide implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String typeAide;

	public TypeAide() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeAide(Integer id, String typeAide) {
		super();
		this.id = id;
		this.typeAide = typeAide;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeAide() {
		return typeAide;
	}

	public void setTypeAide(String typeAide) {
		this.typeAide = typeAide;
	}
	
	
	
}
