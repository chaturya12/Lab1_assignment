package com.cg.anno;

import com.cg.anno.Sbu;

public class Employee {
	private int empId;
	private String empName;
	private int salary;
	private Sbu businessUnit;
	private int age;
	
	
	/*
	 * public Employee(int empId, String empName, int salary, Sbu businessUnit, int
	 * age) { this.empId = empId; this.empName = empName; this.salary = salary;
	 * this.businessUnit = businessUnit; this.age = age; }
	 */
	
	public Employee(int empId, String empName, int salary, Sbu businessUnit, int age) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}

	

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
	public Sbu getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(Sbu businessUnit) {
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
	  @Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", businessUnit="
					+ businessUnit + ", age=" + age + "]";
		}
	 

}
