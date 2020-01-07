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

import com.swiftacad.entity.Shop;
import com.swiftacad.repository.ShopRepository;




@RestController
public class ShopControler {
	
	@Autowired
	private ShopRepository shoprepository;
	
	@RequestMapping(value = "shop" , method = RequestMethod.POST)
	 public ResponseEntity<Shop> createShop(@RequestBody Shop newShop) {
		 Shop shop = shoprepository.save(newShop);
		 return new ResponseEntity<>(shop, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/shop/name/{name}", method = RequestMethod.GET)
	public ResponseEntity<List<Shop>> findbyname(@PathVariable String name){
		return new ResponseEntity<>(shoprepository.findbyname(name), HttpStatus.OK);
	}
}
