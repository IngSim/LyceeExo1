package com.fr.adaming.demo.service;

import java.util.List;



import com.fr.adaming.demo.entities.Laboratoire;


public interface ILaboratoireService {

	Laboratoire findOneById(Long id);
	Laboratoire save(Laboratoire l);
	void delete(Laboratoire l);
	List<Laboratoire> getAll();
}
