package com.epita.quiz.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.epita.quiz.dao.DetailAnswerDAO;
import com.epita.quiz.model.DetailAnswer;
import com.epita.quiz.model.MCQChoice;
import com.epita.quiz.model.Question;
@Service
public interface QuestionService {
	
	public List<Question> loadQuestion();
	public void getAnswer(DetailAnswer detailAnswer);
	public List<Question> loadNextQuestion(int questionId);
	public List<Question> loadQuestion(int questionId);

}
