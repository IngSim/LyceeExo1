package com.fr.adaming.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fr.adaming.demo.dao.IMatiereDAO;
import com.fr.adaming.demo.entities.Matiere;

@Service
public class MatiereService implements IMatiereService{

	@Autowired
	private IMatiereDAO dao;
	
	@Override
	public Matiere findOneByCode(Long code) {

		return dao.getOne(code);
	}

	@Override
	public Matiere save(Matiere e) {
		
		return dao.save(e);
	}

	@Override
	public void delete(Matiere e) {
		dao.delete(e);
		
	}

	@Override
	public List<Matiere> getAll() {
		
		return dao.findAll();
	}

}
