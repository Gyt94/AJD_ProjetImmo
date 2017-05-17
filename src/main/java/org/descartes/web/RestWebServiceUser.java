package org.descartes.web;

import java.util.List;

import org.descartes.domain.User;
import org.descartes.services.IServiceUser;
import org.descartes.services.ServiceUser;
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
public class RestWebServiceUser {
	@Autowired
	IServiceUser serviceUser ;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<?> getUsers(){
		List<User> users = (List<User>) serviceUser.findAll();
		return users;
	}
	
	@RequestMapping(value = "/user/{mail}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public User getUserFromMail(@PathVariable("mail") String mail){
		return serviceUser.findUser(mail);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void postUser(@RequestBody User user){
		serviceUser.addUser(user);
	}
}
