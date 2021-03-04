package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materiel")
public class Materiel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomMateriel;
	
	private Set<TypeAide> typesAide;

	public Materiel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Materiel(Integer id, String nomMateriel, Set<TypeAide> typesAide) {
		super();
		this.id = id;
		this.nomMateriel = nomMateriel;
		this.typesAide = typesAide;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomMateriel == null) ? 0 : nomMateriel.hashCode());
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
		Materiel other = (Materiel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomMateriel == null) {
			if (other.nomMateriel != null)
				return false;
		} else if (!nomMateriel.equals(other.nomMateriel))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Materiel [id=" + id + ", nomMateriel=" + nomMateriel + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomMateriel() {
		return nomMateriel;
	}

	public void setNomMateriel(String nomMateriel) {
		this.nomMateriel = nomMateriel;
	}


	public Set<TypeAide> getTypesAide() {
		return typesAide;
	}


	public void setTypesAide(Set<TypeAide> typesAide) {
		this.typesAide = typesAide;
	}
	
	

}
