package org.descartes.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ServiceBienImmobilier {

	EntityManager entityManager;

	public ServiceBienImmobilier() {
		super();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		entityManager = emf.createEntityManager();
	}

	public List<?> findAll(){
		List<?> liste = entityManager.createQuery( "SELECT * FROM BienImmobilier" )
				.getResultList();
		return liste;
	}

	public List<?> findBienImmobilierFromACity(String ville) {
		return null;
	}
	
	public void addBienImmobilier() {

	}
	
}
