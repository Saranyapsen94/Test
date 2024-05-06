package com.farmer.backend.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.farmer.backend.entity.Farmer;
import com.farmer.backend.repository.FarmerRepository;
import com.farmer.backend.service.FarmerService;

@Service
public class FarmerServiceImpl implements FarmerService{
	
	@Autowired
	private FarmerRepository farmerRepository;
	
	public FarmerServiceImpl(FarmerRepository farmerRepository) {
		super();
		this.farmerRepository = farmerRepository;
	}

	@Override
	public Farmer saveFarmer(Farmer farmer) {
		return farmerRepository.save(farmer);
	}

	public List<Farmer> getallFarmer() {
		return farmerRepository.findAll();
	}

}
