package com.rc.mvcApp.model.dao.ForgotPassword;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rc.mvcApp.dto.register.RegisterDTO;

@Repository
public class ForgotPasswordDAO {
	@Autowired
	private SessionFactory factory;

	public ForgotPasswordDAO() {
		System.out.println(this.getClass().getSimpleName() + "created..");
	}

	public RegisterDTO userCheckEmail(String email) {
		System.out.println("inside FP dao");
		RegisterDTO dtoFromDB = null;
		Session session = factory.openSession();
		String qry = " from RegisterDTO R where R.email=:email";
		if (email != null) {
			Query query = session.createQuery(qry);
			query.setParameter("email", email);

			dtoFromDB = (RegisterDTO) query.uniqueResult();
		}

		System.out.println("exiting FP dao");
		return dtoFromDB;

	}
}
