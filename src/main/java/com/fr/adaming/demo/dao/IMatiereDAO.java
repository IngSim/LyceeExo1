package com.fr.adaming.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.demo.entities.Matiere;



@Repository
public interface IMatiereDAO extends JpaRepository<Matiere, Long>{

}
