package com.subhra.employee.management.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subhra.employee.management.persistence.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
