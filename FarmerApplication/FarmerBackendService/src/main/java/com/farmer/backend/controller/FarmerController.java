package com.farmer.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmer.backend.entity.Farmer;
import com.farmer.backend.service.FarmerService;

@RestController
@RequestMapping("/farmer/data")
public class FarmerController {
	
	@Autowired
	private FarmerService farmerService;

	public FarmerController(FarmerService farmerService) {
		super();
		this.farmerService = farmerService;
	}
	
	//build post Farmer REST API
	@PostMapping
	public ResponseEntity<Farmer> saveFarmer(@RequestBody Farmer farmer){
		return new ResponseEntity<Farmer>(farmerService.saveFarmer(farmer), HttpStatus.CREATED);
		
	}

	//build get Farmer REST API
	@GetMapping
	public List<Farmer> getallFarmer() {
		return farmerService.getallFarmer();
		
	}
	//build get Farmer REST API
	@PostMapping
	public List<Farmer> saveallFarmer(@RequestBody Farmer farmer) {
		return farmerService.getallFarmer();
		}
}
