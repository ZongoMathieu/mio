package com.chd.mio.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Service implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	@OneToMany(mappedBy = "service")
	private Collection<Visitee> visitees;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Collection<Visitee> getVisitee() {
		return visitees;
	}
	public void setVisitee(Collection<Visitee> visitees) {
		this.visitees = visitees;
	}
	public Service() {
		super();
	}
	
	public Service(String libelle, Collection<Visitee> visitees) {
		super();
		this.libelle = libelle;
		this.visitees = visitees;
	}
	@Override
	public String toString() {
		return "Service [id=" + id + ", libelle=" + libelle + ", visitee=" + "]";
	}
	

	
}
