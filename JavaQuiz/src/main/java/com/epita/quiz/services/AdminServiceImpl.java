package com.epita.quiz.services;

import org.springframework.stereotype.Service;

import com.epita.quiz.dao.AdminDAO;
import com.epita.quiz.dao.StudentDAO;
import com.epita.quiz.model.Admin;
@Service
public class AdminServiceImpl implements AdminService {
private AdminDAO adminDao;
	
	
	public void setAdminDao(AdminDAO adminDAO) {
		this.adminDao = adminDAO ;
	}

	@Override
	public Admin loginStudent(Admin admin) {
		return adminDao.loginAdmin(admin);
	}

}
