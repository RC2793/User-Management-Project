package com.rc.mvcApp.controller.update;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rc.mvcApp.dto.register.RegisterDTO;
import com.rc.mvcApp.model.service.update.UpdateService;

@Controller
public class UpdateController {
	@Autowired
	private UpdateService service;

	public UpdateController() {
		System.out.println(this.getClass().getSimpleName() + "created...");
	}

	@RequestMapping(value = "update.do", method = RequestMethod.POST)
	public ModelAndView userUpdateController(@ModelAttribute RegisterDTO udto, HttpServletRequest req) {
		System.out.println("inside update controller");
		HttpSession session = req.getSession(false);
		RegisterDTO dtoFromSession = (RegisterDTO) session.getAttribute("dto");

		if (udto != null) {
			System.out.println("sending dto to update service");
			udto.setId(dtoFromSession.getId());
			RegisterDTO dtofromDB = service.userUpdateService(udto);

			if (dtofromDB != null) {
				System.out.println("Updated user details successfully");
				session.setAttribute("dto", dtofromDB);
				return new ModelAndView("Home.jsp", "update", "User Details Updated Successfully");

			}

		}

		System.out.println("exiting update controller");
		return null;
	}
}
