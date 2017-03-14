package org.descartes.web;

import java.util.List;

import org.descartes.domain.Utilisateur;
import org.descartes.services.ServicePersonne;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@EnableAutoConfiguration 
public class RestWebService {
	
	ServicePersonne servicePersonne = new ServicePersonne();
//test
	@RequestMapping(value = "/utilisateur", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<?> getUtilisateurs(){
		List<Utilisateur> luti = (List<Utilisateur>) servicePersonne.findAll();
		return luti;
	}
	
	@RequestMapping(value = "/utilisateur/{nom}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Utilisateur getUtilisateur(@PathVariable("nom") String nom){
		return servicePersonne.findPersonne(nom);
	}
	
	@RequestMapping(value = "/utilisateur", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void postPersonne(@RequestBody Utilisateur personne){
		System.out.println(personne);
		servicePersonne.addPersonne(personne);
	}
}
