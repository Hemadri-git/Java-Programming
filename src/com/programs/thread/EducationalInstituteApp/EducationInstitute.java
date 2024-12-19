package com.programs.thread.EducationalInstituteApp;

public class EducationInstitute {

	private Course[] courses;
	private Offer[] offers;
	
	public EducationInstitute() {
		
		courses = new Course[] {
				new Course(1, "maths", 1000.0),
				new Course(2, "Science", 1200.0),
				new Course(3, "English", 900.0)
		};
		
		offers = new Offer[] {
			new Offer("Special discount: get 20% OFF on all courses!"),
			new Offer("Limited time Offer: enroll in any two Couses and get one course free!")
		};
	}

	public Course[] getCourses() {
		return courses;
	}

	public Offer[] getOffers() {
		return offers;
	}
	
	public void enrollStudentInCourse(int courseId, String studentName) {
		for(Course course : courses) {
			if (course.getCourseId() == courseId) {
				System.out.println(studentName + "has enrolled in the course: "+ course.getCourseName());
			     return;
			}
		}
		System.out.println("Invalid course ID. Enrollment faile");
	}
	
   
	
	
	
}
