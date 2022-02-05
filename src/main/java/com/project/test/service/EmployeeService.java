package com.project.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.test.entity.EmployeeEntity;
import com.project.test.repository.EmployeeRepository;
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	
	public List<EmployeeEntity> getAllEmployee(){
		
		empRepo.findAll().stream().forEach(System.out::println);
		
		return empRepo.findAll();
		
	}
}
