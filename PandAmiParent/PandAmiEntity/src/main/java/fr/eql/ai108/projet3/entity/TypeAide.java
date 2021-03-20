package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
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

@Entity
@Table(name = "type_aide")
public class TypeAide implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	private String nomTypeAide;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private CategorieAide categorieAide;
	@OneToMany(mappedBy = "typeAide")
	private Set<PreferenceAide> preferencesAide;
	@OneToMany(mappedBy = "typeAide")
	private Set<Service> services;
	

	public TypeAide() {
		super();
		// TODO Auto-generated constructor stub
	}



	public TypeAide(Integer id, String nomTypeAide, CategorieAide categorieAide, Set<PreferenceAide> preferencesAide,
			Set<Service> services) {
		super();
		this.id = id;
		this.nomTypeAide = nomTypeAide;
		this.categorieAide = categorieAide;
		this.preferencesAide = preferencesAide;
		this.services = services;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomTypeAide == null) ? 0 : nomTypeAide.hashCode());
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
		TypeAide other = (TypeAide) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomTypeAide == null) {
			if (other.nomTypeAide != null)
				return false;
		} else if (!nomTypeAide.equals(other.nomTypeAide))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TypeAide [id=" + id + ", nomTypeAide=" + nomTypeAide + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomTypeAide() {
		return nomTypeAide;
	}


	public void setNomTypeAide(String nomTypeAide) {
		this.nomTypeAide = nomTypeAide;
	}


	public CategorieAide getCategorieAide() {
		return categorieAide;
	}


	public void setCategorieAide(CategorieAide categorieAide) {
		this.categorieAide = categorieAide;
	}


	public Set<PreferenceAide> getPreferencesAide() {
		return preferencesAide;
	}


	public void setPreferencesAide(Set<PreferenceAide> preferencesAide) {
		this.preferencesAide = preferencesAide;
	}


	public Set<Service> getServices() {
		return services;
	}


	public void setServices(Set<Service> services) {
		this.services = services;
	}
	
	
}
