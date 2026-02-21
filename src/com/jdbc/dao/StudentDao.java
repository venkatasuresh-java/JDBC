package com.jdbc.dao;


import java.sql.*;

public class StudentDao {

	private String url = "jdbc:mysql://localhost:3306/jdbc";
	private String userName = "root";
	private String Password = "0143";

	public void insertStudent(Student student) throws Exception {

		Connection con = DriverManager.getConnection(url, userName, Password);

		String query = "insert into jdbc_learning values (?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, student.getId());
		ps.setString(2, student.getName());

		int count = ps.executeUpdate();

		System.out.println(count + " Row's Effected ");
		
		ps.close();
		con.close();

	}

//	Select * from jdbc_learning
	public void getAllStudents() throws Exception {
		Connection con = DriverManager.getConnection(url, userName, Password);
		String query = "Select * from jdbc_learning ORDER BY rollNo ASC";
		
		PreparedStatement ps = con.prepareStatement(query);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.println("id   : "+ rs.getInt(1));
			System.out.println("Name : "+ rs.getString(2)+"\n\n");
			
		}
		rs.close();
		ps.close();
		con.close();

	}

}
