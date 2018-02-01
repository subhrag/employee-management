package com.subhra.employee.management.persistence.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
@SequenceGenerator(name = "sequenceGen" , sequenceName = "employee_seq" , allocationSize = 1)
public class Employee {

	@Id
	@Column(name = "employee_id")
	@GeneratedValue(generator = "sequenceGen" , strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "employee_name" , nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String organization;

	
	public Employee() {}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	
}
