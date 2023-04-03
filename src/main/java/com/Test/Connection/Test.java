//package com.Test.Connection;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
// 
//public class Test {
//public static void main(String[] args) {
//	DriverManagerDataSource dataSource = new DriverManagerDataSource();
//	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//	dataSource.setUrl("jdbc:mysql://localhost:3306/test_csdl");
//	dataSource.setUsername("root");
//	dataSource.setPassword("tuantuoi2412");
//	
//	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//	String sql = "INSERT INTO userlogin(username, password) VALUE (?, ?)";
//	int result = jdbcTemplate.update(sql, "nh", "123456");
//	if(result > 0) {
//		System.out.println("Success");
//	}
//}
//}
