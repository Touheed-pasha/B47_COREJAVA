package com.tns.staticprogram;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob1 = new Employee();
		System.out.println(Employee.companyname);
		Employee ob = new Employee("raj",123);
		System.out.println(ob);
		//System.out.println(Employee.count);
		Employee ob2 = new Employee();
		System.out.println(Employee.companyname);
		ob = new Employee("Suma",456);
		System.out.println(ob);
	}

}
