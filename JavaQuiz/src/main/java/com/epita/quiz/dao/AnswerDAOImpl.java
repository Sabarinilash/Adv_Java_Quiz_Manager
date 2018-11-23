package com.epita.quiz.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epita.quiz.model.Answers;
@Repository
public class AnswerDAOImpl implements AnswerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public String getAnswer(int questionId) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Answers answer = new Answers();
		String hql = "from Answers a where a.questionId ="+questionId;
		try {
			Query query = session.createQuery(hql);
			List<Answers> questionList = query.list();
			answer = questionList.get(0);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		
		return answer.getAnswer();
	}

}
