package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "litige")
public class Litige implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	private Date dateCreation;
	private Date dateCloture;
	private String commentaires;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private TypeLitige typeLitige;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Service service;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Utilisateur utilisateur;
	
	
	public Litige() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Litige(Integer id, Date dateCreation, Date dateCloture, String commentaires, TypeLitige typeLitige,
			Service service, Utilisateur utilisateur) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.dateCloture = dateCloture;
		this.commentaires = commentaires;
		this.typeLitige = typeLitige;
		this.service = service;
		this.utilisateur = utilisateur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commentaires == null) ? 0 : commentaires.hashCode());
		result = prime * result + ((dateCloture == null) ? 0 : dateCloture.hashCode());
		result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
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
		Litige other = (Litige) obj;
		if (commentaires == null) {
			if (other.commentaires != null)
				return false;
		} else if (!commentaires.equals(other.commentaires))
			return false;
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Litige [id=" + id + ", dateCreation=" + dateCreation + ", dateCloture=" + dateCloture
				+ ", commentaires=" + commentaires + "]";
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
	public String getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	public TypeLitige getTypeLitige() {
		return typeLitige;
	}
	public void setTypeLitige(TypeLitige typeLitige) {
		this.typeLitige = typeLitige;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	
}
