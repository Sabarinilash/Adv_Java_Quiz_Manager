package com.epita.quiz.model;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.hibernate.validator.constraints.NotEmpty;
/**
 * Bean class for MCQ questions
 * @author Nilash
 *
 */

@Entity
@Table(schema = "quiz_App",name="mcqchoice")

public class MCQChoice {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotEmpty
	@OneToOne(targetEntity=Question.class)
	private Question question;
	
	@NotEmpty
	@Column
	private String option1;

	@NotEmpty
	@Column
	private String option2;

	@NotEmpty
	@Column
	private String option3;

	@NotEmpty
	@Column
	private String option4;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}
	


}
