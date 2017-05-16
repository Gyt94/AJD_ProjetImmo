package org.descartes.web;

import java.util.List;
import org.descartes.domain.BienImmobilier;
import org.descartes.domain.TypeLogement;
import org.descartes.services.IServiceBienImmobilier;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	IServiceBienImmobilier serviceBienImmobilier;

	@RequestMapping(value = "/allBienImmobilierFromACity/{ville}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<?> getAllBienImmobilierFromACity(@PathVariable("ville") String ville){
		return serviceBienImmobilier.findBienImmobilierFromACity(ville);
	}
	
	@RequestMapping(value = "/trouverLogement/{typeLogement}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<?> trouverLogement(@PathVariable("typeLogement") String typeLogement){
		TypeLogement type = TypeLogement.valueOf(typeLogement);
		System.out.println(type);
		return serviceBienImmobilier.trouverLogement(type);
	}
	
	@RequestMapping(value = "/bienImmobilier", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void postBienImmobilier(@RequestBody BienImmobilier bienImmobilier){
		serviceBienImmobilier.addBienImmobilier(bienImmobilier);
	}


}
