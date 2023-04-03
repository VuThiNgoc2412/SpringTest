package com.Test.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.Test.dao.IRegisterDao;
//@Repository

public class RegisterDaoImpl implements IRegisterDao {
//	@Autowired
//	DataSource dataSource;
//	@Autowired
//	JdbcTemplate jdbcTemplate;
	@Override
	public boolean checkRegister(String username, String password) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test_csdl");
		dataSource.setUsername("root");
		dataSource.setPassword("tuantuoi2412");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO userlogin(username, password) VALUE (?, ?)";
		int result = jdbcTemplate.update(sql, username, password);
		if(result > 0) return true;
		else return false;
	}

}
