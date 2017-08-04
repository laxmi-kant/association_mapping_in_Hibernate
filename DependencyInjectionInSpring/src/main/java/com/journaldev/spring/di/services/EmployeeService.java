package com.journaldev.spring.di.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.journaldev.spring.model.Employee;
@Component
public class EmployeeService {

	private Employee employee;
	
	public Employee getEmployee(){
		return this.employee;
	}
	
	public void setEmployee(Employee e){
		this.employee=e;
	}
}