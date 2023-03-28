package com.tns.methodoverriding;
class Base{
	void sum() {
		System.out.println("Sum");
	}
}

public class Overide extends Base{
	void sum() {
		super.sum();
		System.out.println("Sum 1");
	}
}
