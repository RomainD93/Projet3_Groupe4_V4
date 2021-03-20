package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.time.LocalTime;
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
@Table(name = "disponibilite")
public class Disponibilite implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	private LocalTime heureDbtDispo;

	private LocalTime heureFinDispo;

	private Date dbtValiditeDispo;

	private Date finValiditeDispo;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private JourSemaine jourSemaine;

	
	
	public Disponibilite() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Disponibilite(Integer id, LocalTime heureDbtDispo, LocalTime heureFinDispo, Date dbtValiditeDispo,
			Date finValiditeDispo, Utilisateur utilisateur, JourSemaine jourSemaine) {
		super();
		this.id = id;
		this.heureDbtDispo = heureDbtDispo;
		this.heureFinDispo = heureFinDispo;
		this.dbtValiditeDispo = dbtValiditeDispo;
		this.finValiditeDispo = finValiditeDispo;
		this.utilisateur = utilisateur;
		this.jourSemaine = jourSemaine;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dbtValiditeDispo == null) ? 0 : dbtValiditeDispo.hashCode());
		result = prime * result + ((finValiditeDispo == null) ? 0 : finValiditeDispo.hashCode());
		result = prime * result + ((heureDbtDispo == null) ? 0 : heureDbtDispo.hashCode());
		result = prime * result + ((heureFinDispo == null) ? 0 : heureFinDispo.hashCode());
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
		Disponibilite other = (Disponibilite) obj;
		if (dbtValiditeDispo == null) {
			if (other.dbtValiditeDispo != null)
				return false;
		} else if (!dbtValiditeDispo.equals(other.dbtValiditeDispo))
			return false;
		if (finValiditeDispo == null) {
			if (other.finValiditeDispo != null)
				return false;
		} else if (!finValiditeDispo.equals(other.finValiditeDispo))
			return false;
		if (heureDbtDispo == null) {
			if (other.heureDbtDispo != null)
				return false;
		} else if (!heureDbtDispo.equals(other.heureDbtDispo))
			return false;
		if (heureFinDispo == null) {
			if (other.heureFinDispo != null)
				return false;
		} else if (!heureFinDispo.equals(other.heureFinDispo))
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
		return "Disponibilite [id=" + id + ", heureDbtDispo=" + heureDbtDispo + ", heureFinDispo=" + heureFinDispo
				+ ", dbtValiditeDispo=" + dbtValiditeDispo + ", finValiditeDispo=" + finValiditeDispo + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public LocalTime getHeureDbtDispo() {
		return heureDbtDispo;
	}




	public void setHeureDbtDispo(LocalTime heureDbtDispo) {
		this.heureDbtDispo = heureDbtDispo;
	}




	public LocalTime getHeureFinDispo() {
		return heureFinDispo;
	}




	public void setHeureFinDispo(LocalTime heureFinDispo) {
		this.heureFinDispo = heureFinDispo;
	}




	public Date getDbtValiditeDispo() {
		return dbtValiditeDispo;
	}

	public void setDbtValiditeDispo(Date dbtValiditeDispo) {
		this.dbtValiditeDispo = dbtValiditeDispo;
	}

	public Date getFinValiditeDispo() {
		return finValiditeDispo;
	}

	public void setFinValiditeDispo(Date finValiditeDispo) {
		this.finValiditeDispo = finValiditeDispo;
	}


	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	public JourSemaine getJourSemaine() {
		return jourSemaine;
	}


	public void setJourSemaine(JourSemaine jourSemaine) {
		this.jourSemaine = jourSemaine;
	} 
	
	
	
	

}
