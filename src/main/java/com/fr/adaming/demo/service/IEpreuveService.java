package com.fr.adaming.demo.service;

import java.util.List;



import com.fr.adaming.demo.entities.Epreuve;

public interface IEpreuveService {

	Epreuve findOneById(Long idEpreuve);
	Epreuve save(Epreuve e);
	void delete(Epreuve e);
	List<Epreuve> getAll();
}
