package tasksGPT;

//Education Institute Course Enrollment System

class Course {
	private int courseId;
	private String courseName;
	private double courseFee;

	public Course(int courseId, String courseName, double courseFee) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public double getCourseFee() {
		return courseFee;
	}

	@Override
	public String toString() {
		return courseId + ". " + courseName + " - Fee: Rs." + courseFee;
	}
}

class Offer {
	private String offerText;

	public Offer(String offerText) {
		this.offerText = offerText;
	}

	public String getOfferText() {
		return offerText;
	}
}

class EducationInstitute {
	private Course[] courses;
	private Offer[] offers;

	public EducationInstitute() {
		// Hardcoded data for courses and offers
		courses = new Course[] { new Course(1, "Mathematics", 1000.0), new Course(2, "Science", 1200.0),
				new Course(3, "English", 900.0) };

		offers = new Offer[] { new Offer("Special discount: Get 20% off on all courses!"),
				new Offer("Limited time offer: Enroll in any two courses and get one course free!") };
	}

	public Course[] getCourses() {
		return courses;
	}

	public Offer[] getOffers() {
		return offers;
	}

	public void enrollStudentInCourse(int courseId, String studentName) {
		for (Course course : courses) {
			if (course.getCourseId() == courseId) {
				System.out.println(studentName + " has enrolled in the course: " + course.getCourseName());
				return;
			}
		}
		System.out.println("Invalid course ID. Enrollment failed.");
	}
}

class Student extends Thread {
	private String name;
	private EducationInstitute institute;

	public Student(String name, EducationInstitute institute) {
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
		System.out.println("Ongoing Offers:");
		for (Offer offer : institute.getOffers()) {
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
			enrollInCourse(name.equals("Virat") ? 1 : 2); // Virat chooses Mathematics, Dhoni chooses Science
		}
	}
}

public class EducationInstituteApp {
	public static void main(String[] args) {
		EducationInstitute institute = new EducationInstitute();

		// Creating students
		Student virat = new Student("Virat", institute);
		Student dhoni = new Student("Dhoni", institute);

		// Simulating concurrent interactions
		virat.start();
		dhoni.start();

		try {
			virat.join();
			dhoni.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
