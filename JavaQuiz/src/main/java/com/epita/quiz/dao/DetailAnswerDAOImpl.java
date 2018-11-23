package com.epita.quiz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epita.quiz.model.Answers;
import com.epita.quiz.model.DetailAnswer;
import com.epita.quiz.model.Students;
@Repository
public class DetailAnswerDAOImpl implements DetailAnswerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void getAnswer(DetailAnswer detailAnswer) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if(detailAnswer!=null) {
			try {
				session.save(detailAnswer);
				tx.commit();
				session.close();
			} catch (Exception e) {
				tx.rollback();
				session.close();
				e.printStackTrace();
			}
		}
	}
}
