package com.epita.quiz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epita.quiz.dao.StudentDAO;
import com.epita.quiz.model.Students;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO studentDAO;
	
	
	public void setStudentDao(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	

	@Override
	public void savestudent(Students student) {
		studentDAO.savestudent(student);
		
		
	}

	@Override
	public Students loginStudent(Students student) {
		return studentDAO.loginStudent(student);
	}
	
	
	
	

}
