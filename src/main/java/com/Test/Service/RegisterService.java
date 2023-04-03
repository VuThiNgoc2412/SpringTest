package com.Test.Service;

import com.Test.dao.impl.RegisterDaoImpl;

public class RegisterService {
	RegisterDaoImpl rdi = new RegisterDaoImpl();
	public boolean checkRegister(String username, String password) {
		if(rdi.checkRegister(username, password) == true) return true;
		else return false;
	}
}
