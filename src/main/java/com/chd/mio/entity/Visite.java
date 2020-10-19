package com.chd.mio.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Visite {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date_in;
	private Date date_out;
	@ManyToOne
	private Visiteur visiteur;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate_in() {
		return date_in;
	}
	public void setDate_in(Date date_in) {
		this.date_in = date_in;
	}
	public Date getDate_out() {
		return date_out;
	}
	public void setDate_out(Date date_out) {
		this.date_out = date_out;
	}
	public Visiteur getVisiteur() {
		return visiteur;
	}
	public void setVisiteur(Visiteur visiteur) {
		this.visiteur = visiteur;
	}
	public Visite() {
		super();
	}

	public Visite(Date date_in, Date date_out, Visiteur visiteur) {
		super();
		this.date_in = date_in;
		this.date_out = date_out;
		this.visiteur = visiteur;
	}
	@Override
	public String toString() {
		return "Visite [id=" + id + ", date_in=" + date_in + ", date_out=" + date_out +  "]";
	}
	

}
