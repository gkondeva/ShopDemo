package com.swiftacad.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.swiftacad.entity.Shop;



public interface ShopRepository extends CrudRepository<Shop, Long>{
	
	List<Shop> findbyname(String name);

}
