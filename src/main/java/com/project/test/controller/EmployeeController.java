package com.project.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.test.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE ,value="/get")
	public ResponseEntity<Object> getAllEmployee() {
		return new ResponseEntity<>(empService.getAllEmployee(), HttpStatus.OK);
	}
}
