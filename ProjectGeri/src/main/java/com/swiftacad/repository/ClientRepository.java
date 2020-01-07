package com.swiftacad.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swiftacad.entity.Client;



@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{
	
	List<Client> findbyname(String name);
	List<Client> findbylastname(String lastname);
	List<Client> findbyage(int age);
	List<Client> findbycity(String city);
	
}
