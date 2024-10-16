package com.programs.oop2;

import java.util.Scanner;

public class TaskTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Title: ");
		String title = scanner.nextLine();
		
		System.out.print("Description: ");
		String description = scanner.nextLine();
		
		System.out.print("priority: ");
		String priority = scanner.nextLine();
		
		System.out.println("---------------------");
	
		Task task = new Task(title, description, priority);
		task.markAsCompleted();
		task.getDisplayTaskDetails();
		
		scanner.close();
				
	}
}
