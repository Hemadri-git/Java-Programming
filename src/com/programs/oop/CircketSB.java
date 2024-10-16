package com.programs.oop;

public class CircketSB 
{

	private String name;
	private int runs;
	private int matches;
	private float batting_avg;
	
	public CircketSB()
	{
		this.name = "";
		this.runs = 0;
		this.matches = 0;
	}

	public CircketSB(String name, int runs, int matches)
	{
		super();
		this.name = name;
		this.runs = runs;
		this.matches = matches;
		
		if (this.runs <= 0 || this.matches <= 0) {
			System.err.println("Error");
		}
		else if (this.runs>0 && this.matches == 0) {
			System.err.println("Error");
		}
		else if (this.name == "") {
			System.err.println("Name cant be empty");
		}
		
		computeBattingAverage();

	}
	
	public void computeBattingAverage()
	{
		this.batting_avg = this.runs / this.matches;
		
	}
	
	public void getStatistics()
	{
		System.out.println("player name: "+ this.name);
		System.out.println("Player Runs : " + this.runs);
		System.out.println("Mathes played : "+this.matches);
		System.out.println("Batting Average : " + batting_avg);
	}
	
	
}
