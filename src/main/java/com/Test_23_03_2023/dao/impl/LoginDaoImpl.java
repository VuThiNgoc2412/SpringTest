package com.Test_23_03_2023.dao.impl;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.Test_23_03_2023.dao.ILoginDao;

@Repository
public class LoginDaoImpl implements ILoginDao {
//	@Autowired
//	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean validateUser(String username, String password) {
			int count = jdbcTemplate.queryForObject("select count(*) from userlogin where username=? and password=?", Integer.class,username, password);
			if (count == 1) {
				return true;
			} else {
				return false;
			}
	}

}
