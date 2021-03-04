package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String genre;
	
	private Set<Utilisateur> utilisateurs;

	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Genre(Integer id, String genre, Set<Utilisateur> utilisateurs) {
		super();
		this.id = id;
		this.genre = genre;
		this.utilisateurs = utilisateurs;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}


	public Set<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}


	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	
}
