package com.epita.quiz.services;

import org.springframework.stereotype.Service;

import com.epita.quiz.model.Students;
@Service
public interface StudentService {
	
	public void savestudent(Students student);
	public Students loginStudent(Students student);

}
