package com.programs.thread.EducationalInstituteApp;



public class Main 
{
	public static void main(String[] args) {
		EducationInstitute institute = new EducationInstitute();
		
		Student virat = new Student("virat", institute);
		Student dhoni = new Student("Dhoni", institute);
		
		virat.start();
		dhoni.start();
		
		try {
			virat.join();
			dhoni.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
