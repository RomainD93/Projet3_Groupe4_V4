package fr.eql.ai108.projet3.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorie_aide")
public class CategorieAide implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomCategorieAide;

	public CategorieAide() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategorieAide(Integer id, String nomCategorieAide) {
		super();
		this.id = id;
		this.nomCategorieAide = nomCategorieAide;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomCategorieAide() {
		return nomCategorieAide;
	}

	public void setNomCategorieAide(String nomCategorieAide) {
		this.nomCategorieAide = nomCategorieAide;
	}
	
	

}
