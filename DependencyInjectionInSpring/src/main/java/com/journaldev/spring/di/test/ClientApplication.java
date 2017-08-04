package com.journaldev.spring.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.journaldev.spring.di.configuration.DIConfiguration;
import com.journaldev.spring.di.consumer.MyApplication;
import com.journaldev.spring.di.services.EmployeeService;
import com.journaldev.spring.model.Employee;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
//		MyApplication app = context.getBean(MyApplication.class);
		Employee e=new Employee();
		e.setName("Laxmi kant");
//		app.processMessage(e);
//		System.out.println(app.setService(svc););
//		app.processMessage("Hi Pankaj", "pankaj@abc.com");
//		
//		//close the context
//		context.close();
		
EmployeeService employeeService = context.getBean(EmployeeService.class);
employeeService.setEmployee(e);
//		
	System.out.println(employeeService.getEmployee().getName());
//		
		employeeService.getEmployee().setName("Pankaj");
//		
//		employeeService.getEmployee().throwException();
//		
	context.close();
	}

}