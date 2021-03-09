package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "service")
public class Service implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	@Temporal(TemporalType.DATE)
	private Date dateService;
	@Temporal(TemporalType.TIMESTAMP)
	private Date heureDbt;
	@Temporal(TemporalType.TIMESTAMP)
	private Date heureFin;	
	@Temporal(TemporalType.DATE)
	private Date dateCloture;
	private Float sommeAPrevoir;
	private Date dateAnnulation;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Adresse adresse;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private TypeAide typeAide;
	@OneToMany(mappedBy = "service", fetch = FetchType.EAGER)
	private Set<ReponseService> reponses;
	@OneToMany(mappedBy = "service", fetch = FetchType.EAGER)
	private Set<Litige> litiges;
	@OneToMany(mappedBy = "service", fetch = FetchType.EAGER)
	private Set<Negociation> negociations;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Utilisateur utilisateur;
	
	
	
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Service(Integer id, String nom, Date dateCreation, Date dateService, Date heureDbt, Date heureFin,
			Date dateCloture, Float sommeAPrevoir, Date dateAnnulation, Adresse adresse, TypeAide typeAide,
			Set<ReponseService> reponses, Set<Litige> litiges, Set<Negociation> negociations, Utilisateur utilisateur) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateCreation = dateCreation;
		this.dateService = dateService;
		this.heureDbt = heureDbt;
		this.heureFin = heureFin;
		this.dateCloture = dateCloture;
		this.sommeAPrevoir = sommeAPrevoir;
		this.dateAnnulation = dateAnnulation;
		this.adresse = adresse;
		this.typeAide = typeAide;
		this.reponses = reponses;
		this.litiges = litiges;
		this.negociations = negociations;
		this.utilisateur = utilisateur;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateAnnulation == null) ? 0 : dateAnnulation.hashCode());
		result = prime * result + ((dateCloture == null) ? 0 : dateCloture.hashCode());
		result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
		result = prime * result + ((dateService == null) ? 0 : dateService.hashCode());
		result = prime * result + ((heureDbt == null) ? 0 : heureDbt.hashCode());
		result = prime * result + ((heureFin == null) ? 0 : heureFin.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((sommeAPrevoir == null) ? 0 : sommeAPrevoir.hashCode());
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
		Service other = (Service) obj;
		if (dateAnnulation == null) {
			if (other.dateAnnulation != null)
				return false;
		} else if (!dateAnnulation.equals(other.dateAnnulation))
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
		if (dateService == null) {
			if (other.dateService != null)
				return false;
		} else if (!dateService.equals(other.dateService))
			return false;
		if (heureDbt == null) {
			if (other.heureDbt != null)
				return false;
		} else if (!heureDbt.equals(other.heureDbt))
			return false;
		if (heureFin == null) {
			if (other.heureFin != null)
				return false;
		} else if (!heureFin.equals(other.heureFin))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (sommeAPrevoir == null) {
			if (other.sommeAPrevoir != null)
				return false;
		} else if (!sommeAPrevoir.equals(other.sommeAPrevoir))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", nom=" + nom + ", dateCreation=" + dateCreation + ", dateService=" + dateService
				+ ", heureDbt=" + heureDbt + ", heureFin=" + heureFin + ", dateCloture=" + dateCloture
				+ ", sommeAPrevoir=" + sommeAPrevoir + ", dateAnnulation=" + dateAnnulation + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateService() {
		return dateService;
	}

	public void setDateService(Date dateService) {
		this.dateService = dateService;
	}

	public Date getHeureDbt() {
		return heureDbt;
	}

	public void setHeureDbt(Date heureDbt) {
		this.heureDbt = heureDbt;
	}

	public Date getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

	public Date getDateCloture() {
		return dateCloture;
	}

	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
	}

	public Float getSommeAPrevoir() {
		return sommeAPrevoir;
	}

	public void setSommeAPrevoir(Float sommeAPrevoir) {
		this.sommeAPrevoir = sommeAPrevoir;
	}

	public Date getDateAnnulation() {
		return dateAnnulation;
	}

	public void setDateAnnulation(Date dateAnnulation) {
		this.dateAnnulation = dateAnnulation;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public TypeAide getTypeAide() {
		return typeAide;
	}

	public void setTypeAide(TypeAide typeAide) {
		this.typeAide = typeAide;
	}

	public Set<ReponseService> getReponses() {
		return reponses;
	}

	public void setReponses(Set<ReponseService> reponses) {
		this.reponses = reponses;
	}

	public Set<Litige> getLitiges() {
		return litiges;
	}

	public void setLitiges(Set<Litige> litiges) {
		this.litiges = litiges;
	}

	public Set<Negociation> getNegociations() {
		return negociations;
	}

	public void setNegociations(Set<Negociation> negociations) {
		this.negociations = negociations;
	}


	public Utilisateur getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	
	
}
