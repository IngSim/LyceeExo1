package com.fr.adaming.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.demo.entities.Laboratoire;
import com.fr.adaming.demo.service.ILaboratoireService;

@RestController
public class LaboratoireController {

	
	@Autowired
	private ILaboratoireService IServLaboratoire;
	
	@GetMapping("/laboratoire/get/{id}")
	public Laboratoire findOneById(@PathVariable Long id) {
		return IServLaboratoire.findOneById(id);
	}

	@PostMapping("/laboratoire/save")
	public Laboratoire save(@RequestBody Laboratoire l) {
		return IServLaboratoire.save(l);
	}

	@DeleteMapping("/laboratoire/delete")
	public void delete(@RequestBody Laboratoire l) {
		IServLaboratoire.delete(l);
	}

	@GetMapping("/laboratoire/getall")
	public List<Laboratoire> getAll() {
		return IServLaboratoire.getAll();
	}
}
