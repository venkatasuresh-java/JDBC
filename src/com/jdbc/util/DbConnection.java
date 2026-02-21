package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	private static String url = "jdbc:mysql://localhost:3306/jdbc";
	private static String userName = "root";
	private static String Password = "0143";
	
	public static Connection getConnection() throws Exception{
	return DriverManager.getConnection(url, userName, Password);
	}
}
