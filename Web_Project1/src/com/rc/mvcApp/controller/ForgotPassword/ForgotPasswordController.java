package com.rc.mvcApp.controller.ForgotPassword;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rc.mvcApp.dto.register.RegisterDTO;
import com.rc.mvcApp.model.service.ForgotPassword.ForgotPasswordService;

@Controller
public class ForgotPasswordController {
	@Autowired
	private ForgotPasswordService service;

	public ForgotPasswordController() {
		System.out.println(this.getClass().getSimpleName() + "created...");
	}

	@RequestMapping(value = "forget.do", method = RequestMethod.POST)
	public String userForgotPasswordController(@RequestParam String email, HttpServletRequest req) {
		System.out.println("inside FPController");
		HttpSession session=req.getSession(true);
		RegisterDTO dtoFromDB = null;
		if (email != null) {
			dtoFromDB = service.userForgotPasswordService(email);
			if (dtoFromDB != null) {
				session.setAttribute("pass_dto", dtoFromDB.getEmail());
				System.out.println("Email is valid");
				return "ChangePassword.jsp";
				
			} else {
				System.out.println("invalid email");
				req.setAttribute("err", "Invalid Email-ID!!!!!....try again");
				return "Forgot.jsp";
			}
		}

		System.out.println("exiting FPController");
		return null;

	}

}
