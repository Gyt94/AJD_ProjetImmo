package org.descartes.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.descartes.domain.BienImmobilier;

public class ServiceBienImmobilier implements IServiceBienImmobilier {

	EntityManager entityManager;

	public ServiceBienImmobilier() {
		super();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		entityManager = emf.createEntityManager();
	}

	public List<?> findAll(){
		List<?> liste = entityManager.createQuery( "SELECT p FROM BienImmobilier p" )
				.getResultList();
		return liste;
	}

	public List<?> findBienImmobilierFromACity(String ville) {
		List<?> liste = entityManager.createQuery( "SELECT p FROM BienImmobilier p WHERE p.ville LIKE :ville" )
				.setParameter( "ville", ville)
				.getResultList();
		return liste;
	}
	
	public void addBienImmobilier(BienImmobilier bienImmobilier) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(bienImmobilier);
		tx.commit();
	}
	
}
