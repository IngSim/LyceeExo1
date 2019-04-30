package com.fr.adaming.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fr.adaming.demo.dao.ISectionDAO;
import com.fr.adaming.demo.entities.Section;

@Service
public class SectionService implements ISectionService{

	@Autowired
	private ISectionDAO dao;
	
	@Override
	public Section findOneByCode(Long code) {
		
		return dao.getOne(code);
	}

	@Override
	public Section save(Section s) {
		
		return dao.save(s);
	}

	@Override
	public void delete(Section s) {
		dao.delete(s);
		
	}

	@Override
	public List<Section> getAll() {
	
		return dao.findAll();
	}

}
