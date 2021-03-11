package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ville")
public class Ville implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	private String codePostal;
	private String villeNom;
	
	@OneToMany(mappedBy = "ville", fetch = FetchType.EAGER)
	private Set<PreferenceVille> preferencesVille;
	
	
	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Ville(Integer id, String codePostal, String villeNom, Set<PreferenceVille> preferencesVille) {
		super();
		this.id = id;
		this.codePostal = codePostal;
		this.villeNom = villeNom;
		this.preferencesVille = preferencesVille;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codePostal == null) ? 0 : codePostal.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((villeNom == null) ? 0 : villeNom.hashCode());
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
		Ville other = (Ville) obj;
		if (codePostal == null) {
			if (other.codePostal != null)
				return false;
		} else if (!codePostal.equals(other.codePostal))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (villeNom == null) {
			if (other.villeNom != null)
				return false;
		} else if (!villeNom.equals(other.villeNom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ville [id=" + id + ", codePostal=" + codePostal + ", villeNom=" + villeNom + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVilleNom() {
		return villeNom;
	}

	public void setVilleNom(String villeNom) {
		this.villeNom = villeNom;
	}

	public Set<PreferenceVille> getPreferencesVille() {
		return preferencesVille;
	}

	public void setPreferencesVille(Set<PreferenceVille> preferencesVille) {
		this.preferencesVille = preferencesVille;
	}


}
