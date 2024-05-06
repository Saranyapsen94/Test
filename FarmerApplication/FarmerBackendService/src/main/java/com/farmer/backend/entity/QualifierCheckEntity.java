package com.farmer.backend.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QualifierCheckEntity extends MainClass{
	
	@Autowired
	private MainClass baseEntity;

}
