package com.Test_23_03_2023.Test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Test.Service.RegisterService;

@Controller
public class RegisterController {
	@Autowired(required = false)
	RegisterService RS = new RegisterService();
	
	@RequestMapping("/register")
	public String Register() {
		return "register";
	}
	
	@RequestMapping("form-register")
	public String insertUser(String username, String password) {
		if(RS.checkRegister(username, password) == true) return "success";
		else return "failure";
	}
}
