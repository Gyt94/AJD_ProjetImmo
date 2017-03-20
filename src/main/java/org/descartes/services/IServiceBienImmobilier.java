package org.descartes.services;

import java.util.List;

import org.descartes.domain.BienImmobilier;

public interface IServiceBienImmobilier {

	public List<?> findAll();
	public List<?> findBienImmobilierFromACity(String ville);
	public void addBienImmobilier(BienImmobilier bienImmobilier);
}
