package com.tns.example;

public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie ob1 = new Movie();
		System.out.println(Movie.theatername);
		Movie ob = new Movie("KGF",123);
		System.out.println(ob);
		Movie ob2 = new Movie();
		System.out.println(Movie.theatername);
		ob = new Movie("Pathaan",456);
		System.out.println(ob);
		Movie ob3 = new Movie();
		System.out.println(Movie.theatername);
		ob = new Movie("RRR",454);
		System.out.println(ob);
		Movie ob4 = new Movie();
		System.out.println(Movie.theatername);
		ob = new Movie("ABCD",123);
		System.out.println(ob);
		Movie ob5 = new Movie();
		System.out.println(Movie.theatername);
	}

}
