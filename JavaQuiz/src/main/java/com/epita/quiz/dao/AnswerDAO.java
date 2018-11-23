package com.epita.quiz.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface AnswerDAO {
	
	public String getAnswer(int questionId);

}
