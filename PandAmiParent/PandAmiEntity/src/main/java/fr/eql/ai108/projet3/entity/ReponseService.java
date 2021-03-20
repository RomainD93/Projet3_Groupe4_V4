package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reponse_service")
public class ReponseService implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	private LocalDate dateAcceptation;
	private LocalDate dateDesistement;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Service service;
	
	
	
	public ReponseService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ReponseService(Integer id, LocalDate dateAcceptation, LocalDate dateDesistement, Utilisateur utilisateur,
			Service service) {
		super();
		this.id = id;
		this.dateAcceptation = dateAcceptation;
		this.dateDesistement = dateDesistement;
		this.utilisateur = utilisateur;
		this.service = service;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateAcceptation == null) ? 0 : dateAcceptation.hashCode());
		result = prime * result + ((dateDesistement == null) ? 0 : dateDesistement.hashCode());
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
		ReponseService other = (ReponseService) obj;
		if (dateAcceptation == null) {
			if (other.dateAcceptation != null)
				return false;
		} else if (!dateAcceptation.equals(other.dateAcceptation))
			return false;
		if (dateDesistement == null) {
			if (other.dateDesistement != null)
				return false;
		} else if (!dateDesistement.equals(other.dateDesistement))
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
		return "ReponseService [id=" + id + ", dateAcceptation=" + dateAcceptation + ", dateDesistement="
				+ dateDesistement + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public LocalDate getDateAcceptation() {
		return dateAcceptation;
	}

	public void setDateAcceptation(LocalDate dateAcceptation) {
		this.dateAcceptation = dateAcceptation;
	}

	public LocalDate getDateDesistement() {
		return dateDesistement;
	}

	public void setDateDesistement(LocalDate dateDesistement) {
		this.dateDesistement = dateDesistement;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	
}
