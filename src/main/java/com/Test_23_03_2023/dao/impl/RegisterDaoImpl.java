package com.Test_23_03_2023.dao.impl;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.Test_23_03_2023.dao.IRegisterDao;

@Repository
public class RegisterDaoImpl implements IRegisterDao {
//	@Autowired
//	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public boolean checkRegister(String username, String password) {
		String sql = "INSERT INTO userlogin(username, password) VALUE (?, ?)";
		try {
			int result = jdbcTemplate.update(sql, username, password);
			if(result > 0) return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

}
