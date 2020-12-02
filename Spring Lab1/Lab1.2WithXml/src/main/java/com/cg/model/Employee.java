package com.cg.model;

import org.springframework.stereotype.Component;


public class Employee {

	private int empId;
	private String empName;
	private int salary;
	private SBu businessUnit;
	private int age;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public SBu getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBu businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	  public void display() {
	  System.out.println("employee details are:");
	  
	  System.out.print("Employee[");
	  System.out.print("empId : "+getEmpId());
	  System.out.print(" empName : "+getEmpName());
	  System.out.print(" empSalary:"+getSalary());
	  System.out.print(" empBu : "+getBusinessUnit());
	
	  System.out.println("]");}
	 
	/*
	 * public String display() { return "Employee [empId=" + getEmpId() +
	 * ", empName=" + getEmpName() + ", salary=" + getSalary() + ", businessUnit=" +
	 * getBusinessUnit() + ", age=" + getAge() + "]"; }
	 */
	

}
