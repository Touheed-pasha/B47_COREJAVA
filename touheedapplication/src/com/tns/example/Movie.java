package com.tns.example;

public class Movie {
	private String mname;
	private int mid;
	static String theatername="Cauvery Theater";
	static int count=7;
	Movie() {
		--count;
		System.out.println("Seats available"+" "+count);
	}
	Movie(String mname,int mid){
		this.mname=mname;
		this.mid=mid;
		System.out.println(" ");
		}
	@Override
	public String toString() {
		return "Movie [mname=" + mname + ", mid=" + mid + "]";
	}
	

}
