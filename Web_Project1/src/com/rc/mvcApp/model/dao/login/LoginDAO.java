package com.rc.mvcApp.model.dao.login;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rc.mvcApp.dto.login.LoginDTO;
import com.rc.mvcApp.dto.register.RegisterDTO;

@Repository
public class LoginDAO {

	@Autowired
	private SessionFactory factory;

	public LoginDAO() {
		System.out.println(this.getClass().getSimpleName() + "created....");
	}

	public RegisterDTO fetchDTO(LoginDTO ldto) {
		System.out.println("entered login dao");
		RegisterDTO dtoFromDB = null;
		Session session = factory.openSession();

		String qry = "from RegisterDTO R where R.name=:nm and R.password=:pwd";
		if (ldto != null) {
			Query query = session.createQuery(qry);
			query.setParameter("nm", ldto.getName());
			query.setParameter("pwd", ldto.getPassword());

			dtoFromDB = (RegisterDTO) query.uniqueResult();
		}

		System.out.println("exiting login dao");
		return dtoFromDB;
	}
}
