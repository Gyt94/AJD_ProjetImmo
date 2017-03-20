package org.descartes.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.List;

import org.descartes.domain.User;

public class ServiceUser {

	EntityManager entityManager;
	
	public ServiceUser() {
		super();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		entityManager = emf.createEntityManager();
	}
	
	public User findUser(String mail){
		List<?> liste = entityManager.createQuery( "SELECT p FROM User p WHERE p.mail LIKE :mailUser" )
				.setParameter( "mailUser", mail)
				.getResultList();
		return (User) liste.get(0);
	}
	
	public List<?> findAll(){

		List<?> liste = entityManager.createQuery( "SELECT p FROM Users p" )
				.getResultList();
		return liste;
	}
	
	public void addUser(User user){
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(user);
		tx.commit();
	}
	
	

}
