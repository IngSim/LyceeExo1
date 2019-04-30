package com.fr.adaming.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fr.adaming.demo.dao.ILaboratoireDAO;
import com.fr.adaming.demo.entities.Laboratoire;

@Service
public class LaboratoireService implements ILaboratoireService{

	@Autowired
	private ILaboratoireDAO dao;
	
	@Override
	public Laboratoire findOneById(Long id) {
		
		return dao.getOne(id);
	}

	@Override
	public Laboratoire save(Laboratoire l) {
		
		return dao.save(l);
	}

	@Override
	public void delete(Laboratoire l) {
		dao.delete(l);
		
	}

	@Override
	public List<Laboratoire> getAll() {
		
		return dao.findAll();
	}

}
