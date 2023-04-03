//package com.Test.Connection;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Demo {
//	public static void main(String[] args) {
//		String url ="jdbc:mysql://localhost:3306/test_csdl";
//		String user = "root";
//		String password = "tuantuoi2412";
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			try {
//				Connection conn = DriverManager.getConnection(url, user, password);
//				System.out.println("Connection sucessfull with: " + url);
//				String query = "Insert into userlogin(username, password) values('anh', '123')";
//				Statement statement = conn.createStatement();
//				statement.execute(query);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.print("Success");
//	}
//}
