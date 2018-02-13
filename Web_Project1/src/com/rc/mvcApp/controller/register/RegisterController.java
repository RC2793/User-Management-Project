package com.rc.mvcApp.controller.register;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rc.mvcApp.dto.register.RegisterDTO;
import com.rc.mvcApp.model.service.register.RegisterService;

@Controller
@RequestMapping("/")
public class RegisterController {
	@Autowired
	private RegisterService service;

	public RegisterController() {
		System.out.println(this.getClass().getSimpleName() + "created..");
	}

	@RequestMapping(value = "register.do", method = RequestMethod.POST)
	public String userRegisterController(@ModelAttribute RegisterDTO dto, HttpServletRequest req) {
		System.out.println("inside register comtroller");

		if (dto != null) {
			System.out.println("sending dto to service class...");
			service.userRegisterService(dto);
		} else {
			System.out.println("dto is null");
		}
		System.out.println("existing register controller");

		req.setAttribute("name", dto.getName());
		return "Success.jsp";

	}

}
