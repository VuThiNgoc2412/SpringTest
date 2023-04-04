package com.Test_23_03_2023.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test_23_03_2023.dao.impl.LoginDaoImpl;

@Service
public class LoginService {
	@Autowired
	LoginDaoImpl loginDao;
	public boolean validateUser(String username, String password) {
		if(loginDao.validateUser(username, password) == true) return true;
		else return false;
	}
}
