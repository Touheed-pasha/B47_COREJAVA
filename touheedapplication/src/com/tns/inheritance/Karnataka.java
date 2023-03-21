package com.tns.inheritance;
class India {
	protected String lang="Hindi";
	void displayNationalIndia() {
		System.out.println("national lang"+" "+lang);
		}
}
//Single Inheritance 
public class Karnataka extends India {
	public String lang="Kannada";
	void displayLocalKarnataka() {
		System.out.println("local lang"+" "+lang);
		}
	
}
//Multilevel And Hierarchical Inheritance 
class Kerala extends Karnataka { 
	public String lang="Malyalam";
	void displayLocalKerala() {
		System.out.println("local lang"+" "+lang);
		}
	/*
class Kerala extends India { 
	public String lang="Malyalam";
	void displayLocal() {
		System.out.println("local lang"+" "+lang);
		}
}*/
}
