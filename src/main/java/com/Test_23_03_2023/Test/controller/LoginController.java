package com.Test_23_03_2023.Test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Test.Service.LoginService;

@Controller
public class LoginController {
	@Autowired (required = false)
//	public LoginDaoImpl loginDao = new LoginDaoImpl();
	public LoginService ls =new LoginService();
	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login () {
		return "login"; 
	}
	
	  
	  @RequestMapping(value = "/form-submit", method = RequestMethod.POST)
	  public String checkUser(@RequestParam String username, @RequestParam String password) { 
//		    DriverManagerDataSource dataSource = new DriverManagerDataSource();
//			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//			dataSource.setUrl("jdbc:mysql://localhost:3306/test_csdl");
//			dataSource.setUsername("root");
//			dataSource.setPassword("tuantuoi2412");
//			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//			int count = jdbcTemplate.queryForObject("select count(*) from userlogin where username=? and password=?", Integer.class,username, password);
//			if (count == 1) {
//				return "success";
//			} else {
//				return "failure";
//			}
		  boolean loginFlag = ls.validateUser(username, password);
		  if(loginFlag == true) {
			  return "success";
		  }else return "failure";
	  }
}
