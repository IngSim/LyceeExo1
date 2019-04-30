package com.fr.adaming.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Epreuve {

	@Id
	@GeneratedValue
	@Column(name="id_epreuve")
	private Long id;
	private Date date;
	private int heure;
	
	@ManyToMany
	private List<Eleve> eleves;
	
	@ManyToOne
	private Laboratoire labo;

	
	
	public Epreuve(Long id, Date date, int heure, List<Eleve> eleves, Laboratoire labo) {
	
		this.id = id;
		this.date = date;
		this.heure = heure;
		this.eleves = eleves;
		this.labo = labo;
	}

	public Epreuve() {
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	public Laboratoire getLabo() {
		return labo;
	}

	public void setLabo(Laboratoire labo) {
		this.labo = labo;
	}
	
	public Long getId() {
		return id;
	}

	public void setIdEpreuve(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Epreuve [date=" + date + ", heure=" + heure + ", eleves=" + eleves + ", labo=" + labo + "]";
	}
	
	
}
