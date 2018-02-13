package com.rc.mvcApp.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rc.mvcApp.dto.login.LoginDTO;
import com.rc.mvcApp.dto.register.RegisterDTO;
import com.rc.mvcApp.model.service.login.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private LoginService service;

	public LoginController() {
		System.out.println(this.getClass().getSimpleName() + "created...");
	}

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public ModelAndView userLoginController(@ModelAttribute LoginDTO ldto, HttpServletRequest req) {
		System.out.println("entered controller");
		RegisterDTO dtoFromDB = null;
		HttpSession session = req.getSession(true);
		if (ldto != null) {
			System.out.println("sending ldto to service..");
			dtoFromDB = service.userLoginService(ldto);
			if (dtoFromDB != null) {
				session.setAttribute("dto", dtoFromDB);

				System.out.println("Login Successful");
				return new ModelAndView("Home.jsp", "name", dtoFromDB.getName());
			} else {
				System.out.println("Invalid credentials");
				return new ModelAndView("Login.jsp", "err", "Invalid Credentials!!!!  try again..");
			}
		}

		System.out.println("exiting login controller");
		return null;

	}
}
