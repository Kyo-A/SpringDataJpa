package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

// http://localhost:8080/employes?projection=a1
@Projection(types = { Employe.class }, name = "a1")
public interface EmployeProjection {
	
//	public String getFirstName();
//	public String getLastName();
	
	@Value("#{ target.firstName }")
	String getFirstName();

}
