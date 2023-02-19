package com.projectsujan.emailsender.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "email")
public class Email {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String reciver;

	@Column(nullable = false)
	private String subject;

	@Column(nullable = false)
	private String message;

	public Email(String reciver, String subject, String message) {
		super();
		this.reciver = reciver;
		this.subject = subject;
		this.message = message;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReciver() {
		return reciver;
	}

	public void setReciver(String reciver) {
		this.reciver = reciver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
