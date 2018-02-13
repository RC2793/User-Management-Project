package com.rc.mvcApp.model.dao.register;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rc.mvcApp.dto.register.RegisterDTO;

@Repository
public class RegisterDAO {

	@Autowired
	private SessionFactory factory;

	public RegisterDAO() {

		System.out.println(this.getClass().getSimpleName() + "created...");
	}

	public void saveDTO(RegisterDTO dto) {
		System.out.println("saving dto..");

		if (dto != null) {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			try {
				session.save(dto);
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
			}
		}

		System.out.println("dto saved..");
	}
}
