package com.epita.quiz.model;

import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.validator.constraints.NotEmpty;

/**
 * Bean class for student details
 * @author Nilash
 *
 */
@Entity
@Table(schema = "quiz_App")

public class Students implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	@Column(nullable =  false)
	private String name;
	
	@NotEmpty
	@Column
	private String email;
	
	@NotEmpty
	@Column
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
