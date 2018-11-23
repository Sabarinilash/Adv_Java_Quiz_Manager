package com.epita.quiz.services;

import org.springframework.stereotype.Service;

import com.epita.quiz.model.Admin;
import com.epita.quiz.model.Students;

@Service
public interface AdminService {
	public Admin loginStudent(Admin admin);
}
