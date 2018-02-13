package com.rc.mvcApp.model.service.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rc.mvcApp.dto.register.RegisterDTO;
import com.rc.mvcApp.model.dao.register.RegisterDAO;

@Service
public class RegisterService {

	@Autowired
	private RegisterDAO dao;
	public RegisterService() {
		System.out.println(this.getClass().getSimpleName() + "created...");
	}
	
	public void userRegisterService(RegisterDTO dto)
	{
		System.out.println("inside register service...");
		
		if(dto!=null)
		{
			dao.saveDTO(dto);
		}
		
		
		System.out.println("exiting register service...");
		
	}

}
