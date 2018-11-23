package com.epita.quiz.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.epita.quiz.model.MCQChoice;
import com.epita.quiz.model.Question;
@Repository
public interface QuestionDAO {
	public List<Question> loadQuestion();
	public List<Question> loadNextQuestion(int questionId);
	public List<Question> loadQuestion(int questionId);

}


