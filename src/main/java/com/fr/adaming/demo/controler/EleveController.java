package com.fr.adaming.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.demo.service.IEleveService;
import com.fr.adaming.demo.entities.Eleve;

@RestController
public class EleveController {

	@Autowired
	private IEleveService IServEleve;
	
	@GetMapping("/eleve/get/{id}")
	public Eleve findOneById(@PathVariable Long id) {
		return IServEleve.findOneById(id);
	}

	@PostMapping("/eleve/save")
	public Eleve save(@RequestBody Eleve e) {
		return IServEleve.save(e);
	}

	@DeleteMapping("/eleve/Ep/delete")
	public void delete(@RequestBody Eleve e) {
		IServEleve.delete(e);
	}

	@GetMapping("/eleve/getall")
	public List<Eleve> getAll() {
		return IServEleve.getAll();
	}
}
