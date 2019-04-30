package com.fr.adaming.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fr.adaming.demo.dao.IEleveDAO;
import com.fr.adaming.demo.entities.Eleve;

@Service
public class EleveService implements IEleveService{

	@Autowired
	private IEleveDAO dao;
	
	@Override
	public Eleve findOneById(Long id) {
		
		return dao.getOne(id);
	}

	@Override
	public Eleve save(Eleve e) {
		
		return dao.save(e);
	}

	@Override
	public void delete(Eleve e) {
		dao.delete(e);
		
	}

	@Override
	public List<Eleve> getAll() {
		
		return dao.findAll();
	}

}
