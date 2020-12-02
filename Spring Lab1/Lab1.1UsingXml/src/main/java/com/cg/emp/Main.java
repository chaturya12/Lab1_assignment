package com.cg.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Employee employee=ctx.getBean(Employee.class);
		employee.display();
	}

}
