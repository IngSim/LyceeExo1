package com.fr.adaming.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Laboratoire {

	@Id
	@GeneratedValue
	private Long id;
	private int numero;
	private String nom;
	private int nbrOrdi;
	
	@OneToMany
	private List<Epreuve> epreuves;

	

	public Laboratoire(Long id, int numero, String nom, int nbrOrdi, List<Epreuve> epreuves) {
		
		this.id = id;
		this.numero = numero;
		this.nom = nom;
		this.nbrOrdi = nbrOrdi;
		this.epreuves = epreuves;
	}

	public Laboratoire() {
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbrOrdi() {
		return nbrOrdi;
	}

	public void setNbrOrdi(int nbrOrdi) {
		this.nbrOrdi = nbrOrdi;
	}

	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}

	@Override
	public String toString() {
		return "Laboratoire [numero=" + numero + ", nom=" + nom + ", nbrOrdi=" + nbrOrdi + ", epreuves=" + epreuves
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
