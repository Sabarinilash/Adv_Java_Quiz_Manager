package com.epita.quiz.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.epita.quiz.dao.CreateTestDAOImpl;
import com.epita.quiz.dao.StudentDAOImpl;
import com.epita.quiz.model.MCQChoice;
import com.epita.quiz.model.Students;
import com.epita.quiz.services.MCQServiceImpl;
import com.epita.quiz.services.StudentService;
import com.epita.quiz.validation.StudentValidation;
/**
 * controller class for the which connects the admin page view with the admin question insertion model
 * @author Nilash
 *
 */
@Controller
public class adminController {
	/**
	 * this is the class which loads the jsp page in which the admin can add the questions
	 */
	@Autowired
	  public CreateTestDAOImpl createTest;
	  
	  @RequestMapping(value = "/admin", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("create");
	    mav.addObject("mchoice", new MCQChoice());
	    return mav;
	  }
	  
	  /**
	   * This is the class is used process the action class given in the form to insert the question into the database.
	   */
	  @RequestMapping(value = "/adminProcess", method = RequestMethod.POST)
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("question") MCQChoice mcqChoice) {
		  System.out.println(mcqChoice);
		 createTest.savequestion(mcqChoice);
	  return new ModelAndView("create");
	  }
	}
	
	



