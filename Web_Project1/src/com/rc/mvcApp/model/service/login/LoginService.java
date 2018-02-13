package com.rc.mvcApp.model.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rc.mvcApp.dto.login.LoginDTO;
import com.rc.mvcApp.dto.register.RegisterDTO;
import com.rc.mvcApp.model.dao.login.LoginDAO;

@Service
public class LoginService {

	@Autowired
	private LoginDAO dao;

	public LoginService() {
		System.out.println(this.getClass().getSimpleName() + "created..");
	}

	public RegisterDTO userLoginService(LoginDTO ldto) {
		System.out.println("entered login service");
		RegisterDTO dtoFromDB = null;

		if (ldto != null) {
			System.out.println("sending dto to dao");
			dtoFromDB = dao.fetchDTO(ldto);

		}

		System.out.println("exiting login service");
		return dtoFromDB;
	}
}
