package com.chd.mio.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vigile {
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	@OneToMany(mappedBy = "vigile")
	private Collection<Visiteur> visiteur;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<Visiteur> getVisiteur() {
		return visiteur;
	}
	public void setVisiteur(Collection<Visiteur> visiteur) {
		this.visiteur = visiteur;
	}
	public Vigile() {
		super();
	}
	
	public Vigile(String nom, String prenom, String login, String password, Collection<Visiteur> visiteur) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.visiteur = visiteur;
	}
	@Override
	public String toString() {
		return "Vigile [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password="
				+ password + ", visiteur=" + "]";
	}
	
	
	
	

}
