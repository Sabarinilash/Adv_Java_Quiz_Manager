package com.epita.quiz.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.epita.quiz.model.*;
@Service
public interface MCQService {
	
		public List<MCQChoice> loadQuestion();
		public String getAnswer(int questionId);
		public List<MCQChoice> loadNextQuestion(int questionId);
		public List<MCQChoice> loadQuestion(int questionId);
	}


