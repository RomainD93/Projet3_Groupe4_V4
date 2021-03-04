package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Set;

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
	
	private Set<TypeAide> typesAide;

	public CategorieAide() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CategorieAide(Integer id, String nomCategorieAide, Set<TypeAide> typesAide) {
		super();
		this.id = id;
		this.nomCategorieAide = nomCategorieAide;
		this.typesAide = typesAide;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomCategorieAide == null) ? 0 : nomCategorieAide.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategorieAide other = (CategorieAide) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomCategorieAide == null) {
			if (other.nomCategorieAide != null)
				return false;
		} else if (!nomCategorieAide.equals(other.nomCategorieAide))
			return false;
		return true;
	}

	

	@Override
	public String toString() {
		return "CategorieAide [id=" + id + ", nomCategorieAide=" + nomCategorieAide + "]";
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


	public Set<TypeAide> getTypesAide() {
		return typesAide;
	}


	public void setTypesAide(Set<TypeAide> typesAide) {
		this.typesAide = typesAide;
	}
	
	

}
