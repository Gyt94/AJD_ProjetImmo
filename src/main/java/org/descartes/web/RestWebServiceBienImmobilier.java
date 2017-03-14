package org.descartes.web;

import java.util.List;

import org.descartes.domain.BienImmobilier;
import org.descartes.services.ServiceBienImmobilier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@EnableAutoConfiguration
public class RestWebServiceBienImmobilier {

	ServiceBienImmobilier serviceBienImmobilier = new ServiceBienImmobilier();
	
	@RequestMapping(value = "/allBienImmobilier", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<?> getAllBienImmobilier(){
		return serviceBienImmobilier.findAll();
	}

	@RequestMapping(value = "/allBienImmobilierFromACity/{ville}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<?> getAllBienImmobilierFromACity(@PathVariable("ville") String ville){
		return serviceBienImmobilier.findBienImmobilierFromACity(ville);
	}
	
	@RequestMapping(value = "/bienImmobilier", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void postPersonne(@RequestBody BienImmobilier bienImmobilier){
		serviceBienImmobilier.addBienImmobilier(bienImmobilier);
	}

}
