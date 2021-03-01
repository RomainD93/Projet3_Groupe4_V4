package fr.eql.ai108.projet3.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "suspension_compte")
public class Suspension implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Date dateDbtSuspension;
	private Date dateFinSuspension;
	
	
	public Suspension() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Suspension(Integer id, Date dateDbtSuspension, Date dateFinSuspension) {
		super();
		this.id = id;
		this.dateDbtSuspension = dateDbtSuspension;
		this.dateFinSuspension = dateFinSuspension;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDateDbtSuspension() {
		return dateDbtSuspension;
	}
	public void setDateDbtSuspension(Date dateDbtSuspension) {
		this.dateDbtSuspension = dateDbtSuspension;
	}
	public Date getDateFinSuspension() {
		return dateFinSuspension;
	}
	public void setDateFinSuspension(Date dateFinSuspension) {
		this.dateFinSuspension = dateFinSuspension;
	}
	
	
}
