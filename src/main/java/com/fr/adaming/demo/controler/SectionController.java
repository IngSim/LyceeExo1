package com.fr.adaming.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.demo.entities.Section;
import com.fr.adaming.demo.service.ISectionService;

@RestController
public class SectionController {

	@Autowired
	private ISectionService IServSection;
	
	@GetMapping("/section/get/{code}")
	public Section findOneById(@PathVariable Long code) {
		return IServSection.findOneByCode(code);
	}

	@PostMapping("/section/save")
	public Section save(@RequestBody Section s) {
		return IServSection.save(s);
	}

	@DeleteMapping("/section/delete")
	public void delete(@RequestBody Section s) {
		IServSection.delete(s);
	}

	@GetMapping("/section/getall")
	public List<Section> getAll() {
		return IServSection.getAll();
	}
	
}
