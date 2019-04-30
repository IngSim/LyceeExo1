package com.fr.adaming.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.demo.entities.Matiere;
import com.fr.adaming.demo.service.IMatiereService;

@RestController
public class MatiereController {

	
	@Autowired
	private IMatiereService IServMatiere;
	
	@GetMapping("/matiere/get/{code}")
	public Matiere findOneById(@PathVariable Long code) {
		return IServMatiere.findOneByCode(code);
	}

	@PostMapping("/matiere/save")
	public Matiere save(@RequestBody Matiere m) {
		return IServMatiere.save(m);
	}

	@DeleteMapping("/matiere/delete")
	public void delete(@RequestBody Matiere m) {
		IServMatiere.delete(m);
	}

	@GetMapping("/matiere/getall")
	public List<Matiere> getAll() {
		return IServMatiere.getAll();
	}
}
