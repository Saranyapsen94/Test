package com.farmer.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmer.backend.entity.Farmer;
@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Long>{

	Farmer save(Farmer farmer);
	

}
