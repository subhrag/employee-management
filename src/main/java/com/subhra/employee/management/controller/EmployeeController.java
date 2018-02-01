package com.subhra.employee.management.controller;

import org.eclipse.jdt.core.compiler.InvalidInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.subhra.employee.management.persistence.dto.Employee;
import com.subhra.employee.management.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService ;
	

	@GetMapping("/employee")
	public String welCome() {
		return "index";
	}
	
	@GetMapping("/employee-entry")
	public String employeeView() {
		
		return "employee";
	}
	
	@PostMapping("/add-employee")
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee ) throws InvalidInputException {
		ModelAndView modelAndView = null;
		Employee savedEmployee = employeeService.addEmployee(employee);
		if(savedEmployee == null ) {
			return new ModelAndView("error");
		}
		modelAndView = new ModelAndView("success");
		modelAndView.addObject("employee", savedEmployee);
		modelAndView.addObject("employeeList", employeeService.getAllEmployee());
		modelAndView.addObject("addedEmployee", true);
		return modelAndView;
	}
	
	@GetMapping("/get-employee")
	public ModelAndView getAllEmployee() {
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("employeeList", employeeService.getAllEmployee());
		return modelAndView;
		
	}
	
	@ExceptionHandler(InvalidInputException.class)
	public ModelAndView handleException(InvalidInputException e) {
		ModelAndView modelAndView = new ModelAndView("error");
		modelAndView.addObject("errorMessage", e.getMessage());
		return modelAndView;
	}
	
}
