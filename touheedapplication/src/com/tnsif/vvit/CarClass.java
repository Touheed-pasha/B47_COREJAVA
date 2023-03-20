package com.tnsif.vvit;
/*
 * program to demonstrate class  and objects with Data Encapsulation
 */

public class CarClass {
	// Data members for the class
	int model;
	String color;
	int reg;
	int amount=500000;
	// Member functions for the class
	void forward() {
		System.out.println("Car is moving in forward direction");
	}
	void backward() {
		System.out.println("Car is moving in backward direction");
	}
	void stop() {
		System.out.println("Car is not moving");
	}
	

}
