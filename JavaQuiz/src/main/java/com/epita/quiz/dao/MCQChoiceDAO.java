package com.epita.quiz.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.epita.quiz.model.*;
@Repository
public interface MCQChoiceDAO {
	
	public List<MCQChoice> loadQuestion();
	public List<MCQChoice> loadNextQuestion(int questionId);
	public List<MCQChoice> loadQuestion(int questionId);

}
