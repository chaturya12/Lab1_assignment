package com.cg.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");			
//		  Employee employee1=ctx.getBean(Employee.class);
//		 // Employee employee2=ctx.getBean(Employee.class); 
//		
//			/*
//			 * List<Employee> empList=new ArrayList<Employee>(); empList.add(employee1);
//			 * empList.add(employee2); for(Employee emp:empList) { emp.toString(); }
//			 */
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);

		Sbu sbu=context.getBean(Sbu.class);	
		sbu.display();
		Employee emp1=context.getBean("emp1",Employee.class);
	   	Employee emp2=context.getBean("emp2",Employee.class);
	   	Employee emp3=context.getBean("emp3",Employee.class);
	   	Employee emp4=context.getBean("emp4",Employee.class);
	   	List<Employee> empList =new ArrayList<Employee>();
	   	empList.add(emp1);
	   	empList.add(emp2);
	   	empList.add(emp3);
	   	empList.add(emp4);
	   	Scanner sc=new Scanner(System.in);
	   	System.out.println("Enter the id of employee");
	   	int value=sc.nextInt();
	   	for(Employee emp:empList) {
	   		if(emp.getEmpId()==value) {
	   		System.out.println(emp);
	   		}
	   		
	   	}
	   	
		
		
		
	}

}
