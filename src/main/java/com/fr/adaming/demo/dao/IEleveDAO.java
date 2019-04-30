package com.fr.adaming.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.demo.entities.Eleve;

@Repository
public interface IEleveDAO extends JpaRepository<Eleve, Long>{

	List<Eleve> findByNom(String nom);
	List<Eleve> findByPrenom(String prenom);
}
