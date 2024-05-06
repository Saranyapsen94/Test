package com.farmer.backend.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

import lombok.Data;

@Service
public class Farmer  implements QualifierInterfaceCheck{
 
	/*
	 * @Id
	 * 
	 * @GeneratedValue private long id;
	 * 
	 * @Column(name ="first_name", nullable = false) private String fname;
	 * 
	 * @Column(name ="last_name", nullable = false) private String lname;
	 * 
	 * @Column(name ="email", nullable = false) private String email;
	 */
	
	public String getMethod() {
		// TODO Auto-generated method stub
		return "I am from Farmer";
	}
}
