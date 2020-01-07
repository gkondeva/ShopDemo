package com.swiftacad.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swiftacad.entity.Client;
import com.swiftacad.repository.ClientRepository;


@RestController
public class ClientControler {
	
	@Autowired
	private ClientRepository clientrepository;
	
	@RequestMapping(value="/client", method = RequestMethod.POST)
	public ResponseEntity<Client> addclient (@RequestBody Client client) {
		clientrepository.save(client);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/client/name/{name}", method = RequestMethod.GET)
	public ResponseEntity<List <Client>> findByName(@PathVariable String name){
		if(name == null || name.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		List<Client> clientlist = clientrepository.findbyname(name);
		return new ResponseEntity<>(clientlist, HttpStatus.OK);
	}
	
	@RequestMapping(value="/client/lastname/{lastname}", method = RequestMethod.GET)
	public ResponseEntity<List<Client>> findbylastname(@PathVariable String lastname){
		return new ResponseEntity<>(clientrepository.findbylastname(lastname), HttpStatus.OK);
	}
	
	@RequestMapping(value="/client/age/{age}", method = RequestMethod.GET)
	public ResponseEntity<List<Client>> findClient(@PathVariable int age){
		return new ResponseEntity<>(clientrepository.findbyage(age), HttpStatus.OK);
	}
	
	@RequestMapping(value="/client/city/{city}", method = RequestMethod.GET)
	public ResponseEntity<List<Client>> findbycity(@PathVariable String city){
		return new ResponseEntity<>(clientrepository.findbycity(city), HttpStatus.OK);
	}
}
