package com.farmer.backend.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainClass {
	
	
	@Qualifier("farmer")
	@Autowired
	private QualifierInterfaceCheck entity;
	
	@GetMapping("/getDetails")
	public String  getMyMethod() {
		return entity.getMethod();
	}

public  static void main(String[] args) {
	
}
}