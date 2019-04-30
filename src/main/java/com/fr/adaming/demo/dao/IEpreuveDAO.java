package com.fr.adaming.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.demo.entities.Epreuve;

@Repository
public interface IEpreuveDAO extends JpaRepository<Epreuve, Long>{

	
}
