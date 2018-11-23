package com.epita.quiz.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epita.quiz.model.Admin;
/**
 * this class is for checking the admin credentials with the database
 * @author Nilash
 *
 */
@Repository
public class AdminDAOImpl implements AdminDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
/**
 * Method is for validating the admin login credentials
 */
	@Override
	public Admin loginAdmin(Admin admin) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from Admin as s where s.email= ? and s.password= ?";
		try {
			Query query = session.createQuery(hql);
			query.setParameter(0, admin.getEmail());
			query.setParameter(1, admin.getPassword() );
			admin = (Admin)query.uniqueResult();
			tx.commit();
			session.close();
	
		}
		catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
			return null;
		}
		return admin;
	}
}
