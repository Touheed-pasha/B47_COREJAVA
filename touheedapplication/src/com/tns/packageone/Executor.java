package com.tns.packageone;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Base b=new Base();
        b.methodDefault();
        b.methodProtected();
        b.methodPublic();
        b.methodPrivate();
        
        b.varDefault=21;
        b.methodDefault();
        
        /*
         b.varPrivate=18;
         b.methodPrivate();
         */
        b.varProtected=18;
        b.methodProtected();
         
        b.varPublic=65;
        b.methodPublic();
        System.out.println(b instanceof Base);
	}

}
