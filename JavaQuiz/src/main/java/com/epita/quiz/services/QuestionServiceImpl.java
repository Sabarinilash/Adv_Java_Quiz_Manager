package com.epita.quiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epita.quiz.dao.DetailAnswerDAO;
import com.epita.quiz.dao.QuestionDAO;
import com.epita.quiz.model.DetailAnswer;
import com.epita.quiz.model.Question;
@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionDAO questionDAO;
	private DetailAnswerDAO detailAnswerDAO;
	
	@Autowired
	public void setQuestionDao(QuestionDAO questionDao){
		this.questionDAO = questionDao;
	}

	@Autowired
	public void setAnswerDao(DetailAnswerDAO detailAnswerDAO){
		this.detailAnswerDAO = detailAnswerDAO;
	}

	@Override
	public List<Question> loadQuestion() {
		return questionDAO.loadQuestion();
	}

	

	@Override
	public List<Question> loadNextQuestion(int questionId) {
		return questionDAO.loadNextQuestion(questionId);
	}

	@Override
	public List<Question> loadQuestion(int questionId) {
		return questionDAO.loadQuestion(questionId);
	}

	@Override
	public void getAnswer(DetailAnswer detailAnswer) {
		
		detailAnswerDAO.getAnswer(detailAnswer);
		
		
	}

}
