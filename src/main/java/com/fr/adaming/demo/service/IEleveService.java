package com.fr.adaming.demo.service;

import java.util.List;



import com.fr.adaming.demo.entities.Eleve;




public interface IEleveService {

	Eleve findOneById(Long id);
	Eleve save(Eleve e);
	void delete(Eleve e);
	List<Eleve> getAll();
	
}
