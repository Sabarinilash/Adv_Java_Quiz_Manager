package com.epita.quiz.dao;

import org.springframework.stereotype.Repository;

import com.epita.quiz.model.DetailAnswer;
@Repository
public interface DetailAnswerDAO {
	public void getAnswer(DetailAnswer detailAnswer);

}
