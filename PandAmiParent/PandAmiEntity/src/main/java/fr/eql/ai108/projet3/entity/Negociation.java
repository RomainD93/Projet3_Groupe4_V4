package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "negociation")
public class Negociation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	@Temporal(TemporalType.DATE)
	private Date dateCloture;
	@Temporal(TemporalType.DATE)
	private Date dateProposee;
	@Temporal(TemporalType.TIMESTAMP)
	private Date heureDbtProposee;
	@Temporal(TemporalType.TIMESTAMP)
	private Date heureFinProposee;
	private Boolean isAccepted;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Utilisateur createurNego;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Utilisateur repondeurNego;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Service service;
	
	
	
	public Negociation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Negociation(Integer id, Date dateCreation, Date dateCloture, Date dateProposee, Date heureDbtProposee,
			Date heureFinProposee, Boolean isAccepted, Utilisateur createurNego, Utilisateur repondeurNego,
			Service service) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.dateCloture = dateCloture;
		this.dateProposee = dateProposee;
		this.heureDbtProposee = heureDbtProposee;
		this.heureFinProposee = heureFinProposee;
		this.isAccepted = isAccepted;
		this.createurNego = createurNego;
		this.repondeurNego = repondeurNego;
		this.service = service;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateCloture == null) ? 0 : dateCloture.hashCode());
		result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
		result = prime * result + ((dateProposee == null) ? 0 : dateProposee.hashCode());
		result = prime * result + ((heureDbtProposee == null) ? 0 : heureDbtProposee.hashCode());
		result = prime * result + ((heureFinProposee == null) ? 0 : heureFinProposee.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isAccepted == null) ? 0 : isAccepted.hashCode());
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
		Negociation other = (Negociation) obj;
		if (dateCloture == null) {
			if (other.dateCloture != null)
				return false;
		} else if (!dateCloture.equals(other.dateCloture))
			return false;
		if (dateCreation == null) {
			if (other.dateCreation != null)
				return false;
		} else if (!dateCreation.equals(other.dateCreation))
			return false;
		if (dateProposee == null) {
			if (other.dateProposee != null)
				return false;
		} else if (!dateProposee.equals(other.dateProposee))
			return false;
		if (heureDbtProposee == null) {
			if (other.heureDbtProposee != null)
				return false;
		} else if (!heureDbtProposee.equals(other.heureDbtProposee))
			return false;
		if (heureFinProposee == null) {
			if (other.heureFinProposee != null)
				return false;
		} else if (!heureFinProposee.equals(other.heureFinProposee))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isAccepted == null) {
			if (other.isAccepted != null)
				return false;
		} else if (!isAccepted.equals(other.isAccepted))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Negociation [id=" + id + ", dateCreation=" + dateCreation + ", dateCloture=" + dateCloture
				+ ", dateProposee=" + dateProposee + ", heureDbtProposee=" + heureDbtProposee + ", heureFinProposee="
				+ heureFinProposee + ", isAccepted=" + isAccepted + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateCloture() {
		return dateCloture;
	}
	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
	}
	public Date getDateProposee() {
		return dateProposee;
	}
	public void setDateProposee(Date dateProposee) {
		this.dateProposee = dateProposee;
	}
	public Date getHeureDbtProposee() {
		return heureDbtProposee;
	}
	public void setHeureDbtProposee(Date heureDbtProposee) {
		this.heureDbtProposee = heureDbtProposee;
	}
	public Date getHeureFinProposee() {
		return heureFinProposee;
	}
	public void setHeureFinProposee(Date heureFinProposee) {
		this.heureFinProposee = heureFinProposee;
	}
	public Boolean getIsAccepted() {
		return isAccepted;
	}
	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
	public Utilisateur getCreateurNego() {
		return createurNego;
	}
	public void setCreateurNego(Utilisateur createurNego) {
		this.createurNego = createurNego;
	}
	public Utilisateur getRepondeurNego() {
		return repondeurNego;
	}
	public void setRepondeurNego(Utilisateur repondeurNego) {
		this.repondeurNego = repondeurNego;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	

}
