package com.fr.adaming.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Section {

	@Id
	@GeneratedValue
	private Long code;
	private String libelle;
	
	@OneToMany (mappedBy="section", cascade=CascadeType.ALL)
	private List<Eleve> eleves;
	
	@OneToMany (mappedBy="section", cascade=CascadeType.ALL)
	private List<Matiere> matieres;

	public Section(Long code, String libelle, List<Eleve> eleves, List<Matiere> matieres) {
		
		this.code = code;
		this.libelle = libelle;
		this.eleves = eleves;
		this.matieres = matieres;
	}

	public Section() {
		
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

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

	@Override
	public String toString() {
		return "Section [code=" + code + ", libelle=" + libelle + ", eleves=" + eleves + ", matieres=" + matieres + "]";
	}
	
	
}