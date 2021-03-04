package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "suspension_compte")
public class Suspension implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Date dateDbtSuspension;
	private Date dateFinSuspension;
	
	private Utilisateur utilisateur;
	
	public Suspension() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Suspension(Integer id, Date dateDbtSuspension, Date dateFinSuspension, Utilisateur utilisateur) {
		super();
		this.id = id;
		this.dateDbtSuspension = dateDbtSuspension;
		this.dateFinSuspension = dateFinSuspension;
		this.utilisateur = utilisateur;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDbtSuspension == null) ? 0 : dateDbtSuspension.hashCode());
		result = prime * result + ((dateFinSuspension == null) ? 0 : dateFinSuspension.hashCode());
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
		Suspension other = (Suspension) obj;
		if (dateDbtSuspension == null) {
			if (other.dateDbtSuspension != null)
				return false;
		} else if (!dateDbtSuspension.equals(other.dateDbtSuspension))
			return false;
		if (dateFinSuspension == null) {
			if (other.dateFinSuspension != null)
				return false;
		} else if (!dateFinSuspension.equals(other.dateFinSuspension))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Suspension [id=" + id + ", dateDbtSuspension=" + dateDbtSuspension + ", dateFinSuspension="
				+ dateFinSuspension + "]";
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDateDbtSuspension() {
		return dateDbtSuspension;
	}
	public void setDateDbtSuspension(Date dateDbtSuspension) {
		this.dateDbtSuspension = dateDbtSuspension;
	}
	public Date getDateFinSuspension() {
		return dateFinSuspension;
	}
	public void setDateFinSuspension(Date dateFinSuspension) {
		this.dateFinSuspension = dateFinSuspension;
	}


	public Utilisateur getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
}
