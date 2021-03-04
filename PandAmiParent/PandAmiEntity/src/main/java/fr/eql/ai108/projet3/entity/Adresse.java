package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "adresse")
public class Adresse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	private String numeroVoie;
	private String nomVoie;
	private String codePostale;
	private String ville;
	
	@OneToMany(mappedBy = "adresse")
	private Set<Utilisateur> utilisateurs;
	@OneToMany(mappedBy = "adresse")
	private Set<Service> services;
	
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Adresse(Integer id, String numeroVoie, String nomVoie, String codePostale, String ville,
			Set<Utilisateur> utilisateurs, Set<Service> services) {
		super();
		this.id = id;
		this.numeroVoie = numeroVoie;
		this.nomVoie = nomVoie;
		this.codePostale = codePostale;
		this.ville = ville;
		this.utilisateurs = utilisateurs;
		this.services = services;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codePostale == null) ? 0 : codePostale.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomVoie == null) ? 0 : nomVoie.hashCode());
		result = prime * result + ((numeroVoie == null) ? 0 : numeroVoie.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
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
		Adresse other = (Adresse) obj;
		if (codePostale == null) {
			if (other.codePostale != null)
				return false;
		} else if (!codePostale.equals(other.codePostale))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomVoie == null) {
			if (other.nomVoie != null)
				return false;
		} else if (!nomVoie.equals(other.nomVoie))
			return false;
		if (numeroVoie == null) {
			if (other.numeroVoie != null)
				return false;
		} else if (!numeroVoie.equals(other.numeroVoie))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Adresse [id=" + id + ", numeroVoie=" + numeroVoie + ", nomVoie=" + nomVoie + ", codePostale="
				+ codePostale + ", ville=" + ville + "]";
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroVoie() {
		return numeroVoie;
	}
	public void setNumeroVoie(String numeroVoie) {
		this.numeroVoie = numeroVoie;
	}
	public String getNomVoie() {
		return nomVoie;
	}
	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}
	public String getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}



	public Set<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}



	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}



	public Set<Service> getServices() {
		return services;
	}



	public void setServices(Set<Service> services) {
		this.services = services;
	}
	
	

}
