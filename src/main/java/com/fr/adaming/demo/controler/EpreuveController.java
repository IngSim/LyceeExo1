package com.fr.adaming.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.demo.entities.Epreuve;
import com.fr.adaming.demo.service.IEpreuveService;

@RestController
public class EpreuveController {

	
	@Autowired
	private IEpreuveService IServEpreuve;
	
	@GetMapping("/epreuve/get/{id}")
	public Epreuve findOneById(@PathVariable Long id) {
		return IServEpreuve.findOneById(id);
	}

	@PostMapping("/epreuve/save")
	public Epreuve save(@RequestBody Epreuve ep) {
		return IServEpreuve.save(ep);
	}

	@DeleteMapping("/epreuve/delete")
	public void delete(@RequestBody Epreuve ep) {
		IServEpreuve.delete(ep);
	}

	@GetMapping("/epreuve/getall")
	public List<Epreuve> getAll() {
		return IServEpreuve.getAll();
	}
}
