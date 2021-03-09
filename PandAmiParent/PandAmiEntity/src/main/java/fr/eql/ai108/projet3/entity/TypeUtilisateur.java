package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "type_utilisateur")
public class TypeUtilisateur implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	private String autorisation;
	
	@OneToMany(mappedBy = "typeUtilisateur",fetch = FetchType.EAGER)
	private Set<Utilisateur> utilisateurs;
	
	
	
	public TypeUtilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public TypeUtilisateur(Integer id, String autorisation, Set<Utilisateur> utilisateurs) {
		super();
		this.id = id;
		this.autorisation = autorisation;
		this.utilisateurs = utilisateurs;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autorisation == null) ? 0 : autorisation.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}




	@Override
	public String toString() {
		return "TypeUtilisateur [id=" + id + ", autorisation=" + autorisation + "]";
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeUtilisateur other = (TypeUtilisateur) obj;
		if (autorisation == null) {
			if (other.autorisation != null)
				return false;
		} else if (!autorisation.equals(other.autorisation))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}




	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAutorisation() {
		return autorisation;
	}
	public void setAutorisation(String autorisation) {
		this.autorisation = autorisation;
	}

	public Set<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	
}
