package com.rc.mvcApp.model.service.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rc.mvcApp.dto.register.RegisterDTO;
import com.rc.mvcApp.model.dao.update.UpdateDAO;

@Service
public class UpdateService {
	@Autowired
	private UpdateDAO dao;

	public UpdateService() {
		System.out.println(this.getClass().getSimpleName() + "created...");
	}

	public RegisterDTO userUpdateService(RegisterDTO udto) {
		System.out.println("inside update Service");
		RegisterDTO dtoFromDB = null;
		if (udto != null) {
			dtoFromDB = dao.updateDTO(udto);
		}
		System.out.println("exiting update service");
		return dtoFromDB;
		
	}

}
