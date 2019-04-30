package com.fr.adaming.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Matiere {

	@Id
	@GeneratedValue
	private Long code;
	private String libelle;
	private int duree;
	private float coefficient;
	
	@ManyToOne
	private Section section;
	
	@OneToMany
	private List<Epreuve> epreuves;

	public Matiere(Long code, String libelle, int duree, float coefficient, Section section, List<Epreuve> epreuves) {
	
		this.code = code;
		this.libelle = libelle;
		this.duree = duree;
		this.coefficient = coefficient;
		this.section = section;
		this.epreuves = epreuves;
	}

	public Matiere() {
		
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public float getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
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
		return "Matiere [code=" + code + ", libelle=" + libelle + ", duree=" + duree + ", coefficient=" + coefficient
				+ ", section=" + section + ", epreuves=" + epreuves + "]";
	}
	
	
}
