package com.Test.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.Test.dao.ILoginDao;

//@Repository
public class LoginDaoImpl implements ILoginDao {
//	@Autowired
//	DriverManagerDataSource datasource;
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
	@Override
	public boolean validateUser(String username, String password) {
		    DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/test_csdl");
			dataSource.setUsername("root");
			dataSource.setPassword("tuantuoi2412");
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			int count = jdbcTemplate.queryForObject("select count(*) from userlogin where username=? and password=?", Integer.class,username, password);
			if (count == 1) {
				return true;
			} else {
				return false;
			}
	}

}
