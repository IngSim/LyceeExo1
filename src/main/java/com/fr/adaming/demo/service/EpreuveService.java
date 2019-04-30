package com.fr.adaming.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fr.adaming.demo.dao.IEpreuveDAO;
import com.fr.adaming.demo.entities.Epreuve;

@Service
public class EpreuveService implements IEpreuveService{

	@Autowired
	private IEpreuveDAO dao;
	
	@Override
	public Epreuve findOneById(Long id) {
		
		return dao.getOne(id);
	}

	@Override
	public Epreuve save(Epreuve e) {
		
		return dao.save(e);
	}

	@Override
	public void delete(Epreuve e) {
		dao.delete(e);
		
	}

	@Override
	public List<Epreuve> getAll() {
		
		return dao.findAll();
	}

}
