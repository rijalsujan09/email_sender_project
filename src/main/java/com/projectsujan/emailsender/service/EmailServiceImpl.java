package com.projectsujan.emailsender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.projectsujan.emailsender.entity.Email;
@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender mailSender;

	@Override
	public void sendEmail(Email email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email.getReciver());
		message.setSubject(email.getSubject());
		message.setText(email.getMessage());
		mailSender.send(message);

	}

}
