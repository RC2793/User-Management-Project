package com.rc.mvcApp.model.service.ForgotPassword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rc.mvcApp.dto.register.RegisterDTO;
import com.rc.mvcApp.model.dao.ForgotPassword.ForgotPasswordDAO;

@Service
public class ForgotPasswordService {
	@Autowired
	private ForgotPasswordDAO dao;

	public ForgotPasswordService() {
		System.out.println(this.getClass().getSimpleName() + "created..");
	}

	public RegisterDTO userForgotPasswordService(String email) {
		RegisterDTO dtoFromDB = null;
		System.out.println("inside FP Service");
		if (email != null) {
			dtoFromDB = dao.userCheckEmail(email);
		}

		System.out.println("exiting FP service");
		return dtoFromDB;
	}
}
