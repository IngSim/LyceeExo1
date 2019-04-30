package com.fr.adaming.demo.service;

import java.util.List;



import com.fr.adaming.demo.entities.Section;


public interface ISectionService {

	Section findOneByCode(Long code);
	Section save(Section s);
	void delete(Section s);
	List<Section> getAll();
}
