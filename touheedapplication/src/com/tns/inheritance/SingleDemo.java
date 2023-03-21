package com.tns.inheritance;

public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*India i=new India();
		i.displayNational();
		i.display();*/
		Karnataka k = new Karnataka(); //Single Inheritance and Hierarchical
		Kerala kk = new Kerala(); //Multilevel Inheritance
		k.displayLocalKarnataka();
		kk.displayLocalKerala();
		k.displayNationalIndia();
		
	}

}
