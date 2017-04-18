package org.descartes.services;

import java.util.List;

import org.descartes.domain.User;

public interface IServiceUser {
	public User findUser(String mail);
	public List<?> findAll();
	public void addUser(User user);
	
}
