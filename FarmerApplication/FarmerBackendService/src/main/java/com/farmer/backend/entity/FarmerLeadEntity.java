package com.farmer.backend.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class FarmerLeadEntity implements QualifierInterfaceCheck {

	
	public String getMethod() {
		return "I am from FL";
	}
	

}
