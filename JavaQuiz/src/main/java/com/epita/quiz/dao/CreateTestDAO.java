package com.epita.quiz.dao;

import org.springframework.stereotype.Repository;

import com.epita.quiz.model.MCQChoice;

@Repository
public interface CreateTestDAO {
	
	public void savequestion(MCQChoice MCQchoice);

}
