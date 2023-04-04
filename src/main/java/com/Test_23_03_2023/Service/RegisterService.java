package com.Test_23_03_2023.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test_23_03_2023.dao.impl.RegisterDaoImpl;

@Service
public class RegisterService {
	@Autowired
	RegisterDaoImpl rdi;
	public boolean checkRegister(String username, String password) {
		if(rdi.checkRegister(username, password) == true) return true;
		else return false;
	}
}
