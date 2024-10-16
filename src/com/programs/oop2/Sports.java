package com.programs.oop2;

public class Sports 
{
	private String sportName;
	private int teamSize;
	private String sportType;
	
	public Sports()
	{
		this.sportName = null;
		this.teamSize = 0;
		this.sportType = null;
	}
	
	public Sports(String sportName, int teamSize) 
	{
		if (sportName == null || sportName == "") {
			System.err.println("Error: Name can't be Empty!!");
		}
		this.sportName = sportName;
		
		if(teamSize < 0 ) {
			this.teamSize = 0;
		   System.err.println("Error: Team size must be positive.");
		}
		this.teamSize = teamSize;
	}
	
	public Sports(String sportName, int teamSize, String sportType) 
	{
		if (sportName == null|| sportName == "") {
			System.err.println("Error: Name can't be Empty!!");
		}
		this.sportName = sportName;
		
		if(teamSize <= 0 ) {
			this.teamSize = 0;
		   System.err.println("Error: Team size must be positive.");
		}
		this.teamSize = teamSize;
		
		if (sportType == null|| sportType == "") {
			System.err.println("Error: Type cant be Empty!!");
		}
		this.sportType = sportType;
	}
	
	public void displayInfo() 
	{
		System.out.println("Sport Name: " + this.sportName);
		System.out.println("Team Size: " + this.teamSize);
		System.out.println("Sport Type: " + this.sportType);
	}
}
