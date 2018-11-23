package com.epita.quiz.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.epita.quiz.model.Admin;
import com.epita.quiz.model.Answers;
import com.epita.quiz.model.DetailAnswer;
import com.epita.quiz.model.MCQChoice;
import com.epita.quiz.model.Question;
import com.epita.quiz.model.Students;


@Configuration
@ComponentScan("com.epita.quiz.controllers,com.epita.quiz.dao,com.epita.quiz.model,com.epita.quiz.services")
@EntityScan("com.epita.quiz.model")
public class PersistenceConfig { 

	/*@Bean(autowire = Autowire.BY_TYPE)
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/sample","root","root");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}*/ 

	@Bean(autowire = Autowire.BY_TYPE) 
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		
		sessionFactory.setAnnotatedClasses(MCQChoice.class,Students.class,Admin.class,DetailAnswer.class,Question.class,Answers.class);
		
		// create the config properties for hibernate
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("show_sql", "true");
		hibernateProperties.setProperty("format_sql", "true");
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");		
		sessionFactory.setHibernateProperties(hibernateProperties);
		return sessionFactory;
	} 

	@Bean(autowire = Autowire.BY_TYPE)
	public HibernateTemplate hibernateTemplate() {
		return new HibernateTemplate();
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public PlatformTransactionManager transactionManager() {
		return new HibernateTransactionManager();
	}


}
