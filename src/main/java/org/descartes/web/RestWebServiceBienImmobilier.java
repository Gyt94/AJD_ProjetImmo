package org.descartes.web;

import java.util.List;

import org.descartes.services.ServiceBienImmobilier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class RestWebServiceBienImmobilier {

	ServiceBienImmobilier serviceBienImmobilier = new ServiceBienImmobilier();
	
	/**
	 * Tous les biens immobiliers
	 * @return
	 */
	@RequestMapping(value = "/allBienImmobilier", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<?> getAllBienImmobilier(){
		return serviceBienImmobilier.findAll();
	}

	/**
	 * Tous les biens immobiliers à partir d'une ville
	 * @param ville
	 * @return
	 */
	@RequestMapping(value = "/allBienImmobilierFromACity/{ville}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<?> getAllBienImmobilierFromACity(@PathVariable("ville") String ville){
		return serviceBienImmobilier.findBienImmobilierFromACity(ville);
	}

}
