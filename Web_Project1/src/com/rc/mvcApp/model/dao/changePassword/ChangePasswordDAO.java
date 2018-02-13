package com.rc.mvcApp.model.dao.changePassword;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rc.mvcApp.dto.register.RegisterDTO;

@Repository
public class ChangePasswordDAO {
	@Autowired
	private SessionFactory factory;

	public ChangePasswordDAO() {
		System.out.println(this.getClass().getSimpleName() + "created...");
	}

	public void changePassword(String email,String password) {
		System.out.println("inside CP dao");

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		String qry="update RegisterDTO  set password='"+password+"'where email='"+email+"'";
			Query query = session.createQuery(qry);
			
			query.executeUpdate();
			tx.commit();
		
;
		System.out.println("exiting CP dao");

	}
}
