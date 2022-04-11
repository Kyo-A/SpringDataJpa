package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employe;
import com.example.demo.model.EmployeProjection;

@RepositoryRestResource(excerptProjection = EmployeProjection.class)
public interface EmployeRepository extends JpaRepository<Employe, Integer>{
	
	// http://localhost:8080/api/v1/employes findAll
	
	// http://localhost:8080/api/v1/employes/search/findByFirstName?firstName=John
	List<Employe> findByFirstName(@Param("firstName") String firstName);

}
