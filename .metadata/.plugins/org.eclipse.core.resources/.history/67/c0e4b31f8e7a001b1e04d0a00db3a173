package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "service")
public class Service implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private Date dateCreation;
	private Date dateDebut;
	private Date dateFin;
	private Date dateCloture;
	private Float sommeAPrevoir;
	private Date dateAnnulation;
}
