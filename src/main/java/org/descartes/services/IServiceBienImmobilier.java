package org.descartes.services;

import java.util.List;

import org.descartes.domain.BienImmobilier;
import org.descartes.domain.TypeLogement;

public interface IServiceBienImmobilier {

	public List<?> trouverLogement(TypeLogement typeLogement);
	
	
	public List<?> findBienImmobilierFromACity(String ville);
	public void addBienImmobilier(BienImmobilier bienImmobilier);
}
