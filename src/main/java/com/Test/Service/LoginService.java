package com.Test.Service;

import com.Test.dao.impl.LoginDaoImpl;

public class LoginService {
	LoginDaoImpl loginDao = new LoginDaoImpl();
	public boolean validateUser(String username, String password) {
		if(loginDao.validateUser(username, password) == true) return true;
		else return false;
	}
}
