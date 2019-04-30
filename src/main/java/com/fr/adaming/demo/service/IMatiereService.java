package com.fr.adaming.demo.service;

import java.util.List;



import com.fr.adaming.demo.entities.Matiere;


public interface IMatiereService {

	Matiere findOneByCode(Long code);
	Matiere save(Matiere e);
	void delete(Matiere e);
	List<Matiere> getAll();
}
