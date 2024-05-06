package com.farmer.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.farmer.backend.entity.Farmer;
@Service
public interface FarmerService {

	Farmer saveFarmer(Farmer farmer);
	List<Farmer> getallFarmer();
}
