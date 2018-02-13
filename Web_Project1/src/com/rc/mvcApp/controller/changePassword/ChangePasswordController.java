package com.rc.mvcApp.controller.changePassword;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rc.mvcApp.model.service.changePassword.ChangePasswordService;

@Controller
public class ChangePasswordController {
	@Autowired
	private ChangePasswordService service;

	public ChangePasswordController() {
		System.out.println(this.getClass().getSimpleName() + "created...");
	}

	@RequestMapping(value = "change_password.do", method = RequestMethod.POST)
	public ModelAndView userCPController(@RequestParam("email") String email,
			@RequestParam("password") String password,@RequestParam("confirm") String confirm) {
		System.out.println("inside CP Controller");
		if ((password)!=null) {
			ModelAndView mv=service.UserCPService(email,password,confirm);
			System.out.println("password changed");
			return mv;
			
			
		}

		System.out.println("exiting CP controller");
		return null;
		
	}

}
