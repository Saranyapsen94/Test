package com.farmer.first.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FarmerListController {
	
	
	@GetMapping("/farmerlist") 
	public String farmerList() { 
	return "Hi i am from getmethod"; }
	 
	
    @GetMapping("/farmer")
	public Farmer getFarmerName() {
		return new Farmer("Saranya","Palanisamy");
	}
    
    @GetMapping("/allFarmer")
    public List<Farmer> getAllFarmer(){
    	List<Farmer> lst=new ArrayList<>();
    	lst.add(new Farmer("Sara","asd"));
    	lst.add(new Farmer("Vasu","123"));
    	lst.add(new Farmer("Pavi","asd"));
		return lst;
    }
    
    @GetMapping("/allFarmer/{firstName}/{lastName}")
    public Farmer getfindByFarmerId(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName){
		return new Farmer(firstName, lastName);
    }
    
    @PostMapping
	public Farmer saveallFarmer(@RequestBody Farmer farmer) {
    	 System.out.println("User ID: "+farmer.getFirstName());
         System.out.println("User ID: "+farmer.getLastName());
         return farmer;
    }
    
}
