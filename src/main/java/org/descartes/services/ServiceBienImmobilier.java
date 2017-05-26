package org.descartes.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.descartes.domain.BienImmobilier;
import org.descartes.domain.TypeLogement;

public class ServiceBienImmobilier implements IServiceBienImmobilier {

	EntityManager entityManager;

	public ServiceBienImmobilier() {
		super();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		entityManager = emf.createEntityManager();
	}

	public void addBienImmobilier(BienImmobilier bienImmobilier) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(bienImmobilier);
		tx.commit();
	}

	public List<?> trouverLogement(TypeLogement typeLogement) {
		List<?> liste = entityManager.createQuery( "SELECT p FROM BienImmobilier p WHERE p.typeLogement LIKE :typeLogement" )
				.setParameter( "typeLogement", typeLogement)
				.getResultList();
		return liste;
	}
	
}
