package com.jdbc.dao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDao dao = new StudentDao();

        while (true) {

            try {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Insert Student");
                System.out.println("2. View All Students");
                System.out.println("3. Exit");
                System.out.print("Choose Option: ");

                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        System.out.print("Enter Roll Number: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        Student student = new Student(id, name);
                        dao.insertStudent(student);
                        break;

                    case 2:
                        dao.getAllStudents();
                        break;

                    case 3:
                        System.out.println("Exiting Program...");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice!");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}










/*


package com.jdbc.dao;




import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your RollNumber : ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter Your Name :");
			String name = sc.nextLine();

//			Create Student Object
			Student s1 = new Student(id, name);

//			Create Student DAO Object
			StudentDao dao = new StudentDao();

//			Call insert Method 
			dao.insertStudent(s1);

			dao.getAllStudents();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


*/