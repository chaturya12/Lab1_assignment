package com.cg.model;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config {
	@Bean
	public Sbu sbu()
	{
		Sbu sbu=new Sbu(1,"Kiran Rao","Product Engineering Services");
		return sbu;
	}

	/*
	 * @Bean public Employee emp1() { return new Employee(100, "Sai", 12345,22); }
	 * 
	 * @Bean public Employee emp2() { return new Employee(101, "Swarupa", 12000,21);
	 * }
	 * 
	 * @Bean public Employee emp3() { return new Employee(102, "Deepika", 15000,24);
	 * }
	 * 
	 * @Bean public Employee emp4() { return new Employee(103, "Bhanu", 16000,25); }
	 */
	@Bean(name="empList")
	public ArrayList<Employee> getEmpList(){
		Employee e1=new Employee(1,"harison",20000,29);
		Employee e2=new Employee(2,"Gopi",25000,22);
		ArrayList<Employee> empList=new ArrayList<>();
		empList.add(e1);
		empList.add(e2);		
		return empList;
		
	}

}
