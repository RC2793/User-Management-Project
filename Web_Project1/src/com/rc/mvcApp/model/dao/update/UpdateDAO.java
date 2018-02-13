package com.rc.mvcApp.model.dao.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rc.mvcApp.dto.register.RegisterDTO;

@Repository
public class UpdateDAO {
	@Autowired
	private SessionFactory factory;

	public UpdateDAO() {
		System.out.println(this.getClass().getSimpleName() + "created...");
	}

	public RegisterDTO updateDTO(RegisterDTO udto) {
		System.out.println("inside update dao");
		RegisterDTO dtofromDB = null;
		if (udto != null) {

			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			try {
				dtofromDB = (RegisterDTO) session.merge(udto);
				tx.commit();
			} catch (Exception e) {

				tx.rollback();
			}
		}
		System.out.println("exiting update dao");
		return dtofromDB;

	}
}
