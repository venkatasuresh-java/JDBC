package com.jdbc.dao;

import java.sql.*;
import com.jdbc.model.Student;
import com.jdbc.util.DbConnection;

public class StudentDao {

	public void insertStudent(Student student) {

		String query = "insert into jdbc_learning values (?,?)";

		try (Connection con = DbConnection.getConnection(); 
				PreparedStatement ps = con.prepareStatement(query);) {

			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());

			int count = ps.executeUpdate();

			if (count > 0) {
				System.out.println("Rows Inserted Successfully! ");
			}

		} catch (Exception e) {
			System.err.println("Error :" + e.getMessage());
		}
	}

	
//	Select * from jdbc_learning
	public void getAllStudents(){

		String query = "Select * from jdbc_learning ORDER BY rollNo ASC";

		try (Connection con = DbConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(query);
				ResultSet rs = ps.executeQuery();) {

			while (rs.next()) {
				System.out.println("id   : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString(2) + "\n\n");

			}

		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
