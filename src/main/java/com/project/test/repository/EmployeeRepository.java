package com.project.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.test.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

}
