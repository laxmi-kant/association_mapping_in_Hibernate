package com.journaldev.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.journaldev.spring.di.services.EmployeeService;
import com.journaldev.spring.di.services.MessageService;
import com.journaldev.spring.model.Employee;

@Component
public class MyApplication {
private EmployeeService service;
	
//	constructor-based dependency injection	
//	@Autowired
//	public MyApplication(MessageService svc){
//		this.service=svc;
//	}
	
	@Autowired
	public void setService(EmployeeService svc){
		this.service=svc;
	}
	
	public void processMessage(Employee e){
		//some magic like validation, logging etc
		 this.service.setEmployee(e);;
	}
}
