package com.jdbc.app;

public class Main {

    public static void main(String[] args) {

     StudentApp app = new StudentApp();
     app.start();
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