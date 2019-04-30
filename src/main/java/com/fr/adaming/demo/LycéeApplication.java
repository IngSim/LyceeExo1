package com.fr.adaming.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



import com.fr.adaming.demo.dao.IEleveDAO;
import com.fr.adaming.demo.entities.Eleve;


@SpringBootApplication
public class LycéeApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = SpringApplication.run(LycéeApplication.class, args);
		IEleveDAO dao = ctx.getBean(com.fr.adaming.demo.dao.IEleveDAO.class);
		Eleve e = new Eleve(null, "Ing", "Sim", 15111991, null, null);
		dao.save(e);
	}

}
