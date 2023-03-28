package com.tns.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point ob = new Point();   //Default Constructor is called
		System.out.println(ob);
		Point ob1 = new Point(14.5f);
		System.out.println(ob1);
		Point ob2 = new Point(14.5f,15.6f);
		System.out.println(ob2);
	}

}
