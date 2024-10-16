package com.programs.oop;

public class Movie 
{

	String title;
	int releaseYear;
	String genre;
	
	
	public Movie(String title, int releaseYear, String genre) {
		super();
		this.title = title;
		this.releaseYear = releaseYear;
		this.genre = genre;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
		System.out.println();
	}
	
    
	
	
	
}
