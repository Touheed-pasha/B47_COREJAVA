package com.tnsif.vvit;
//import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		CarClass ob = new CarClass(); // creation of object
		ob.backward();
		ob.forward();
		ob.stop();
		//Scanner sc=new Scanner(System.in);
		System.out.println("reg is"+ " "+ob.reg);
		System.out.println("amount is"+ " "+ob.amount);
		

	}

}
