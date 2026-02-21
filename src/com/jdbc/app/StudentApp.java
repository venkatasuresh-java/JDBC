package com.jdbc.app;

import java.util.Scanner;
import com.jdbc.dao.StudentDao;
import com.jdbc.model.Student;

public class StudentApp {

	Scanner sc = new Scanner(System.in);
	private StudentDao dao = new StudentDao();

	public void start() {

		boolean running = true;

		while (running) {

			System.out.println("\n===== MENU =====");
			System.out.println("1. Insert Student");
			System.out.println("2. View All Students");
			System.out.println("3. Exit");
			System.out.print("Choose Option: ");

			try {

				int choice = Integer.parseInt(sc.nextLine());

				switch (choice) {

				case 1:
					insertStudent();
					break;

				case 2:
					dao.getAllStudents();
					break;

				case 3:
					running = false;
					System.out.println("Exiting Program...");
					break;

				default:
					System.out.println("Invalid Choice!");
				}

			} catch (Exception e) {
				System.out.println("Invalid Input ");
			}
		}

	}

	private void insertStudent() {
		try {
			System.out.print("Enter Roll Number: ");
			int id = Integer.parseInt(sc.nextLine());

			System.out.print("Enter Name: ");
			String name = sc.nextLine();

			Student student = new Student(id, name);
			dao.insertStudent(student);

		} catch (Exception e) {
			System.out.println("Invalid Data");
		}
	}
}
