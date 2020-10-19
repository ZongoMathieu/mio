package com.chd.mio.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Visitee {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom_visitee;
	private String prenom_visitee;
	@ManyToOne
	private Service service;
	@OneToMany(mappedBy = "visitee")
	private Collection<Visiteur> visiteurs;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom_visitee() {
		return nom_visitee;
	}
	public void setNom_visitee(String nom_visitee) {
		this.nom_visitee = nom_visitee;
	}
	public String getPrenom_visitee() {
		return prenom_visitee;
	}
	public void setPrenom_visitee(String prenom_visitee) {
		this.prenom_visitee = prenom_visitee;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	public Collection<Visiteur> getVisiteur() {
		return visiteurs;
	}
	public void setVisiteur(Collection<Visiteur> visiteurs) {
		this.visiteurs = visiteurs;
	}
	public Visitee() {
		super();
	}
	
	
	public Visitee(String nom_visitee, String prenom_visitee, Service service, Collection<Visiteur> visiteurs) {
		super();
		this.nom_visitee = nom_visitee;
		this.prenom_visitee = prenom_visitee;
		this.service = service;
		this.visiteurs = visiteurs;
	}
	@Override
	public String toString() {
		return "Visitee [id=" + id + ", nom_visitee=" + nom_visitee + ", prenom_visitee=" + prenom_visitee
				+ ", service=" + "]";
	}
	
	
}
