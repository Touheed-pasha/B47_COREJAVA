package com.tns.packageone;

public class Base {
	/*
	 * Declaring access specifiers
	 */
	int varDefault=10; // no access specifier then it is default
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	/*
	 * declaring access specifiers for methods
	 */
	void methodDefault() { //default method
		System.out.println("default access base class");
		System.out.println("default variable "+varDefault);
	}
	void methodPublic() { //public method
		System.out.println("public access base class");
		System.out.println("public variable "+varPublic);
	}
	void methodPrivate() { //private method
		System.out.println("private access base class");
		System.out.println("private variable "+varPrivate);
	}
	void methodProtected() { //protected method
		System.out.println("Protected access base class");
		System.out.println("Protected variable "+varProtected);
	}

}
