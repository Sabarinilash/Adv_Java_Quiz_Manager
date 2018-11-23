package com.epita.quiz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@EnableWebMvc
@Configuration
public class MvcConfig  extends WebMvcConfigurerAdapter {


	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		System.out.println("-");
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

}
