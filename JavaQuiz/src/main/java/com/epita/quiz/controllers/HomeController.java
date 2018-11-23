package com.epita.quiz.controllers;



import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 

@Controller
public class HomeController {
	
	 private final Logger logger = LoggerFactory.getLogger(HomeController.class);
	 
	 @RequestMapping(value="/",method = RequestMethod.GET)
	 public String home(Locale locale, Model model) {
		 System.out.println("Hello");
		 
		 logger.info("Welcome Quiz Manager ! The client locale is {}.",locale);
		 return "home";
	 }
}