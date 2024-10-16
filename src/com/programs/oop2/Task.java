package com.programs.oop2;

public class Task {

	private String tittle;
	private String description;
	private String priority;
	private boolean isComplete;
	
	public Task(String tittle, String descreption, String priority) {
		super();
		if (tittle == null || tittle == "") {
			System.err.println("Error message indicating invalid title");
		}
		this.tittle = tittle;
		
		if (descreption == null || descreption == "") {
			System.err.println("Error message indicating invalid description");
		}
		this.description = descreption;
		
		if (priority == null || priority == "") {
			System.err.println("Error message indicating invalid priority");
		}
		this.priority = priority;
		this.isComplete = false;
	}
	
	public void updateDescription(String newDescription) {
		this.description = newDescription;
	}
	
	public void updatePriority(String newPriority) {
		this.priority = newPriority;
	}
	
	public void markAsCompleted() {
		this.isComplete = true;
	}
	
	public String getTitle() {
		return tittle;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getPriority() {
		return priority;
	}
	
	public boolean isCompleted() {
		return isComplete;
	}
	
	public void getDisplayTaskDetails() {
		System.out.println("Task Title : " + tittle);
		System.out.println("Task Description : " + description);
		System.out.println("Task Priority : " + priority);
		System.out.println("Is Task Completed? " + (isComplete? " True" : " False"));
		
	}
}
