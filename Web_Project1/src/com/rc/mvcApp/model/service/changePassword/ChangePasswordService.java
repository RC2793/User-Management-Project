package com.rc.mvcApp.model.service.changePassword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.rc.mvcApp.model.dao.changePassword.ChangePasswordDAO;

@Service
public class ChangePasswordService {
	@Autowired
	private ChangePasswordDAO dao;

	public ChangePasswordService() {
		System.out.println(this.getClass().getSimpleName() + "created..");
	}

	public ModelAndView UserCPService(String email,String password,String confirm) {
		System.out.println("inside CP service");
		
	if(password.equals(confirm)){
		System.out.println("password matching..");
			dao.changePassword(email,password);
			return new ModelAndView("Login.jsp", "change", "Password Changed Successfully!!...Login again");
			}
	else{
		System.out.println("password mismatching");
		System.out.println("exiting CP service");
		return new ModelAndView("ChangePassword.jsp", "mis", "Passwords Dont Match!!!....try again");
		
	}
	
		



	}

}
