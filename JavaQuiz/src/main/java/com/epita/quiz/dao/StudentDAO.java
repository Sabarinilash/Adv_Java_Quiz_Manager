package com.epita.quiz.dao;

import org.springframework.stereotype.Repository;

import com.epita.quiz.model.Students;
@Repository
public interface StudentDAO {
	
	public void savestudent(Students student);
	public Students loginStudent(Students student);

}
