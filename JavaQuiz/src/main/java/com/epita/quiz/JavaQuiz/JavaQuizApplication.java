package com.epita.quiz.JavaQuiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.epita.quiz.config")
@EnableAutoConfiguration
public class JavaQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaQuizApplication.class, args);
	}
}
