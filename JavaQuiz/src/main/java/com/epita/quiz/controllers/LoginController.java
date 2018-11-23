package com.epita.quiz.controllers;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.epita.quiz.dao.AdminDAOImpl;
import com.epita.quiz.dao.StudentDAOImpl;
import com.epita.quiz.model.Students;
import com.epita.quiz.services.StudentServiceImpl;

/**
 * This class is for connecting the student login model and the student login
 * view
 * 
 * @author Nilash This class is for connecting the user login model and the user
 *         login model
 *
 */

@Controller
public class LoginController {

	/**
	 * This method is used for loading the student login page
	 */
	@Autowired
	StudentDAOImpl studentService;
	@Autowired
	AdminDAOImpl adminService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(ModelMap model) {
		model.addAttribute("login", new Students());
		return "login";
	}

	/**
	 * 
	 * This method is to perform the form action to perform the login validation
	 * 
	 * @param request
	 * @param response
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String loginProcess(ModelMap model, @ModelAttribute("login") Students student) {
		Students student1 = studentService.loginStudent(student);
		if (null != student1) {
			model.addAttribute("name", student1.getName());
			return "success";
		} else {
			model.addAttribute("message", "Username or Password is wrong!!");
		}
		return "login";
	}

}
