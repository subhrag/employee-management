package com.subhra.employee.management.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jdt.core.compiler.InvalidInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subhra.employee.management.persistence.dto.Employee;
import com.subhra.employee.management.persistence.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository ;
	
	public Employee addEmployee(Employee employee) throws InvalidInputException {
		if(StringUtils.isBlank(employee.getName()) || StringUtils.isBlank(employee.getOrganization())) {
			throw new InvalidInputException("Name and Organization are mandatory");
		}
		return employeeRepository.save(employee);
	}
	
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	/*public Employee getEmployeeByID(Long id) {
		
		return employeeRepository.findOne(id);
	}*/
	
/*	public Employee updateEmployeeById(Long id, Employee employee) {
		
	Employee getEmployee = this.getEmployeeByID(id);
	
	if(getEmployee == null) {
		return 
	}
		
	}*/
}
