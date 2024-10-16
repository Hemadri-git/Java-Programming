package com.programs.oop;

public class MovieTest {

	public static void main(String[] args) {
		
		Movie m1 = new Movie("Aadi", 2002, "Drama");
		
		m1.setTitle("Simhadri");
		String title = m1.getTitle();
		System.out.println(title);
		
		m1.setReleaseYear(2004);
		int releaseYear = m1.getReleaseYear();
		System.out.println(releaseYear);
		
		m1.setGenre("Action");
		String genre = m1.getGenre();
		System.out.println(genre);
		
	}
}
