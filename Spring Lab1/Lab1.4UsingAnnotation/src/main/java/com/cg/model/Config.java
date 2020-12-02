package com.cg.model;

import org.springframework.context.annotation.Bean;

public class Config {
	@Bean
	public Sbu sbu()
	{
		Sbu sbu=new Sbu(1,"Kiran Rao","Product Engineering Services");
		return sbu;
	}
	@Bean
	public Employee emp1()
	{
		return new Employee(100, "Sai", 12345,22);
	}
	@Bean
	public Employee emp2()
	{
		return new Employee(101, "Swarupa", 12000,21);
	}
	@Bean
	public Employee emp3()
	{
		return new Employee(102, "Deepika", 15000,24);
	}
	@Bean
	public Employee emp4()
	{
		return new Employee(103, "Bhanu", 16000,25);
	}

}
