package com.tns.staticprogram;

public class Employee {
	// declare instance variable
	private String name;
	private int id;
	// declare static variable
	static String companyname="TNS";
	static int count=0;
	Employee() {
		count++;
		System.out.println("the count is"+count);
	}
	Employee(String name,int id){
		this.name=name;
		this.id=id;
		System.out.println(" ");
		}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

}
