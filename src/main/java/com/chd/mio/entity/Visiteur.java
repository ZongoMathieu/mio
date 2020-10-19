package com.chd.mio.entity;


import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Visiteur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cnib;
	private String nom_visiteur;
	private String prenom_visiteur;
	private String date_exp_cnib;
	private String signature;
	@ManyToOne
	private Vigile vigile;
	@ManyToOne
	private Visitee visitee;
	@OneToMany(mappedBy = "visiteur")
	private Collection<Visite> visites;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCnib() {
		return cnib;
	}
	public void setCnib(String cnib) {
		this.cnib = cnib;
	}
	public String getNom_visiteur() {
		return nom_visiteur;
	}
	public void setNom_visiteur(String nom_visiteur) {
		this.nom_visiteur = nom_visiteur;
	}
	public String getPrenom_visiteur() {
		return prenom_visiteur;
	}
	public void setPrenom_visiteur(String prenom_visiteur) {
		this.prenom_visiteur = prenom_visiteur;
	}
	public String getDate_exp_cnib() {
		return date_exp_cnib;
	}
	public void setDate_exp_cnib(String date_exp_cnib) {
		this.date_exp_cnib = date_exp_cnib;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public Vigile getVigile() {
		return vigile;
	}
	public void setVigile(Vigile vigile) {
		this.vigile = vigile;
	}
	public Visitee getVisitee() {
		return visitee;
	}
	public void setVisitee(Visitee visitee) {
		this.visitee = visitee;
	}
	
	public Collection<Visite> getVisite() {
		return visites;
	}
	public void setVisite(Collection<Visite> visites) {
		this.visites = visites;
	}
	public Visiteur() {
		super();
	}
	public Visiteur(String cnib, String nom_visiteur, String prenom_visiteur, String date_exp_cnib, String signature,
			Vigile vigile, Visitee visitee, Collection<Visite> visites) {
		super();
		this.cnib = cnib;
		this.nom_visiteur = nom_visiteur;
		this.prenom_visiteur = prenom_visiteur;
		this.date_exp_cnib = date_exp_cnib;
		this.signature = signature;
		this.vigile = vigile;
		this.visitee = visitee;
		this.visites = visites;
	}
	public Visiteur(String cnib, String nom_visiteur, String prenom_visiteur, String date_exp_cnib, String signature) {
		super();
		this.cnib = cnib;
		this.nom_visiteur = nom_visiteur;
		this.prenom_visiteur = prenom_visiteur;
		this.date_exp_cnib = date_exp_cnib;
		this.signature = signature;
	}
	public Visiteur(String string, String string2, String string3, Date date, String string4) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Visiteur [id=" + id + ", cnib=" + cnib + ", nom_visiteur=" + nom_visiteur + ", prenom_visiteur="
				+ prenom_visiteur + ", date_exp_cnib=" + date_exp_cnib + ", signature=" + signature + ", vigile="
				+ vigile + ", visitee=" + visitee + ", visite=" + visites + "]";
	}
	
	
	
	
	
	
	

}
