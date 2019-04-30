package com.fr.adaming.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Eleve implements Serializable{

	@Id
	@GeneratedValue
	@Column(name="id_eleve")
	private Long id;
	private String nom;
	private String prenom;
	private int dateNaissance;
	
	@ManyToOne
	@JoinColumn(name="code")
	private Section section;
	
	@ManyToMany
	@JoinTable(name="Convocation", 
	joinColumns=@JoinColumn(name="id_eleve",referencedColumnName="id_eleve"),
	inverseJoinColumns=@JoinColumn(name="id_epreuve",referencedColumnName="id_epreuve"))
	List<Epreuve> epreuves;

			
	public Eleve(Long id, String nom, String prenom, int dateNaissance, Section section, List<Epreuve> epreuves) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.section = section;
		this.epreuves = epreuves;
	}

	public Eleve() {
	
	}

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

	public int getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(int dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}

	@Override
	public String toString() {
		return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", section=" + section + ", epreuves=" + epreuves + "]";
	}
	
	
}
