package com.epita.quiz.dao;

import org.springframework.stereotype.Repository;

import com.epita.quiz.model.Admin;
import com.epita.quiz.model.Students;

@Repository
public interface AdminDAO {
	

	
	public Admin loginAdmin(Admin admin);

}
