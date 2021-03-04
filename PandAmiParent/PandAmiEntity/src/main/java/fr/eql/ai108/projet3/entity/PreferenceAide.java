package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "preference_aide")
public class PreferenceAide implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private TypeAide typeAide;
	private Utilisateur utilisateur;
	
	public PreferenceAide() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public PreferenceAide(Integer id, TypeAide typeAide, Utilisateur utilisateur) {
		super();
		this.id = id;
		this.typeAide = typeAide;
		this.utilisateur = utilisateur;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		PreferenceAide other = (PreferenceAide) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PreferenceAide [id=" + id + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}



	public TypeAide getTypeAide() {
		return typeAide;
	}



	public void setTypeAide(TypeAide typeAide) {
		this.typeAide = typeAide;
	}



	public Utilisateur getUtilisateur() {
		return utilisateur;
	}



	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	
	
}
