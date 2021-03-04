package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "jour_semaine")
public class JourSemaine implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	private String nomJour;
	@OneToMany (mappedBy = "jourSemaine", cascade = CascadeType.ALL)
	private Set<Disponibilite> disponibilites;
	
	public JourSemaine() {
		super();
		// TODO Auto-generated constructor stub
	}


	public JourSemaine(Integer id, String nomJour, Set<Disponibilite> disponibilites) {
		super();
		this.id = id;
		this.nomJour = nomJour;
		this.disponibilites = disponibilites;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomJour == null) ? 0 : nomJour.hashCode());
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
		JourSemaine other = (JourSemaine) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomJour == null) {
			if (other.nomJour != null)
				return false;
		} else if (!nomJour.equals(other.nomJour))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "JourSemaine [id=" + id + ", nomJour=" + nomJour + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomJour() {
		return nomJour;
	}

	public void setNomJour(String nomJour) {
		this.nomJour = nomJour;
	}


	public Set<Disponibilite> getDisponibilites() {
		return disponibilites;
	}


	public void setDisponibilites(Set<Disponibilite> disponibilites) {
		this.disponibilites = disponibilites;
	}
	

}
