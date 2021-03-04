package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	private String email;
	private String password;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String numTelephone;
	private Date dateInscription;
	private Date dateDesinscription;
	private Integer rayonAction;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Adresse adresse;
	@OneToMany(mappedBy = "utilisateur")
	private Set<Suspension> suspensions;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private TypeUtilisateur typeUtilisateur;
	@OneToMany(mappedBy = "utilisateur")
	private Set<Disponibilite> disposUtilisateur;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Genre genre;
	@OneToMany(mappedBy = "createurNego")
	private Set<Negociation> negosCreateur;
	@OneToMany(mappedBy = "repondeurNego")
	private Set<Negociation> negosRepondeur;
	@OneToMany(mappedBy = "utilisateur")
	private Set<Litige> litigesUtilisateur;
	@OneToMany(mappedBy = "utilisateur")
	private Set<Service> servicesUtilisateur;
	@OneToMany(mappedBy = "utilisateur")
	private Set<ReponseService> reponsesServicesUtilsateur;
	@OneToMany(mappedBy = "utilisateur")
	private Set<PreferenceAide> preferencesAideUtlisateur;
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Utilisateur(Integer id, String email, String password, String nom, String prenom, Date dateNaissance,
			String numTelephone, Date dateInscription, Date dateDesinscription, Integer rayonAction, Adresse adresse,
			Set<Suspension> suspensions, TypeUtilisateur typeUtilisateur, Set<Disponibilite> disposUtilisateur,
			Genre genre, Set<Negociation> negosCreateur, Set<Negociation> negosRepondeur,
			Set<Litige> litigesUtilisateur, Set<Service> servicesUtilisateur,
			Set<ReponseService> reponsesServicesUtilsateur, Set<PreferenceAide> preferencesAideUtlisateur) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numTelephone = numTelephone;
		this.dateInscription = dateInscription;
		this.dateDesinscription = dateDesinscription;
		this.rayonAction = rayonAction;
		this.adresse = adresse;
		this.suspensions = suspensions;
		this.typeUtilisateur = typeUtilisateur;
		this.disposUtilisateur = disposUtilisateur;
		this.genre = genre;
		this.negosCreateur = negosCreateur;
		this.negosRepondeur = negosRepondeur;
		this.litigesUtilisateur = litigesUtilisateur;
		this.servicesUtilisateur = servicesUtilisateur;
		this.reponsesServicesUtilsateur = reponsesServicesUtilsateur;
		this.preferencesAideUtlisateur = preferencesAideUtlisateur;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDesinscription == null) ? 0 : dateDesinscription.hashCode());
		result = prime * result + ((dateInscription == null) ? 0 : dateInscription.hashCode());
		result = prime * result + ((dateNaissance == null) ? 0 : dateNaissance.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((numTelephone == null) ? 0 : numTelephone.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((rayonAction == null) ? 0 : rayonAction.hashCode());
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
		Utilisateur other = (Utilisateur) obj;
		if (dateDesinscription == null) {
			if (other.dateDesinscription != null)
				return false;
		} else if (!dateDesinscription.equals(other.dateDesinscription))
			return false;
		if (dateInscription == null) {
			if (other.dateInscription != null)
				return false;
		} else if (!dateInscription.equals(other.dateInscription))
			return false;
		if (dateNaissance == null) {
			if (other.dateNaissance != null)
				return false;
		} else if (!dateNaissance.equals(other.dateNaissance))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
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
		if (numTelephone == null) {
			if (other.numTelephone != null)
				return false;
		} else if (!numTelephone.equals(other.numTelephone))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (rayonAction == null) {
			if (other.rayonAction != null)
				return false;
		} else if (!rayonAction.equals(other.rayonAction))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", email=" + email + ", password=" + password + ", nom=" + nom + ", prenom="
				+ prenom + ", dateNaissance=" + dateNaissance + ", numTelephone=" + numTelephone + ", dateInscription="
				+ dateInscription + ", dateDesinscription=" + dateDesinscription + ", rayonAction=" + rayonAction + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNumTelephone() {
		return numTelephone;
	}

	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public Date getDateDesinscription() {
		return dateDesinscription;
	}

	public void setDateDesinscription(Date dateDesinscription) {
		this.dateDesinscription = dateDesinscription;
	}

	public Integer getRayonAction() {
		return rayonAction;
	}

	public void setRayonAction(Integer rayonAction) {
		this.rayonAction = rayonAction;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Set<Suspension> getSuspensions() {
		return suspensions;
	}

	public void setSuspensions(Set<Suspension> suspensions) {
		this.suspensions = suspensions;
	}

	public TypeUtilisateur getTypeUtilisateur() {
		return typeUtilisateur;
	}

	public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}

	public Set<Disponibilite> getDisposUtilisateur() {
		return disposUtilisateur;
	}

	public void setDisposUtilisateur(Set<Disponibilite> disposUtilisateur) {
		this.disposUtilisateur = disposUtilisateur;
	}



	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}



	public Set<Negociation> getNegosCreateur() {
		return negosCreateur;
	}



	public void setNegosCreateur(Set<Negociation> negosCreateur) {
		this.negosCreateur = negosCreateur;
	}



	public Set<Negociation> getNegosRepondeur() {
		return negosRepondeur;
	}



	public void setNegosRepondeur(Set<Negociation> negosRepondeur) {
		this.negosRepondeur = negosRepondeur;
	}



	public Set<Litige> getLitigesUtilisateur() {
		return litigesUtilisateur;
	}

	public void setLitigesUtilisateur(Set<Litige> litigesUtilisateur) {
		this.litigesUtilisateur = litigesUtilisateur;
	}

	public Set<Service> getServicesUtilisateur() {
		return servicesUtilisateur;
	}

	public void setServicesUtilisateur(Set<Service> servicesUtilisateur) {
		this.servicesUtilisateur = servicesUtilisateur;
	}

	public Set<ReponseService> getReponsesServicesUtilsateur() {
		return reponsesServicesUtilsateur;
	}

	public void setReponsesServicesUtilsateur(Set<ReponseService> reponsesServicesUtilsateur) {
		this.reponsesServicesUtilsateur = reponsesServicesUtilsateur;
	}

	public Set<PreferenceAide> getPreferencesAideUtlisateur() {
		return preferencesAideUtlisateur;
	}

	public void setPreferencesAideUtlisateur(Set<PreferenceAide> preferencesAideUtlisateur) {
		this.preferencesAideUtlisateur = preferencesAideUtlisateur;
	}
	
	

}
