package org.descartes.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.List;

import org.descartes.domain.Utilisateur;

public class ServicePersonne {

	EntityManager entityManager;
	
	public ServicePersonne() {
		super();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		entityManager = emf.createEntityManager();
	}
	
	public Utilisateur findPersonne(String nom){
		List liste = entityManager.createQuery( "SELECT p FROM Personne p WHERE p.nom LIKE :namePerson" )
				.setParameter( "namePerson", nom)
				.getResultList();
		return (Utilisateur) liste.get(0);
	}
	
	public List<?> findAll(){
		List liste = entityManager.createQuery( "SELECT p FROM Personne p" )
				.getResultList();
		return liste;
	}
	
	public void addPersonne(Utilisateur personne){
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(personne);
		tx.commit();
	}
	
	

}
