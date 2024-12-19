package com.programs.thread.EducationalInstituteApp;

public class Student extends Thread{
	
	private String name;
	private EducationInstitute institute;
	
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	
	public void viewCoursesAndFees() {
		System.out.println("Available Courses:");
		for (Course course : institute.getCourses()) {
			System.out.println(course);
		}	
		
	}
	
	public void viewOffers() {
		System.out.println("on-going offers: ");
		for(Offer offer : institute.getOffers()) {
			System.out.println(offer.getOfferText());
		}
	}
	
	public void enrollInCourse(int courseId) {
		institute.enrollStudentInCourse(courseId, name);
	}
	
	@Override
	public void run() {
		synchronized (institute) {
			viewCoursesAndFees();
			viewOffers();
			enrollInCourse(name.equals("virat")? 1: 2);
		}
	}
	
}
	
	


