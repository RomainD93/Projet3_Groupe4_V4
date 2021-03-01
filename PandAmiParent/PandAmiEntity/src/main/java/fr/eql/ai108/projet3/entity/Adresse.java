package fr.eql.ai108.projet3.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "adresse")
public class Adresse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String numeroVoie;
	private String nomVoie;
	private String codePostale;
	private String ville;
	
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adresse(Integer id, String numeroVoie, String nomVoie, String codePostale, String ville) {
		super();
		this.id = id;
		this.numeroVoie = numeroVoie;
		this.nomVoie = nomVoie;
		this.codePostale = codePostale;
		this.ville = ville;
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
	
	

}
