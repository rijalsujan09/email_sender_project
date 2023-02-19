package com.projectsujan.emailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.projectsujan.emailsender.entity.Email;
import com.projectsujan.emailsender.repository.EmailRepository;
import com.projectsujan.emailsender.service.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	  private EmailService emailService;
	  
	  @Autowired
	  private EmailRepository emailRepository;
	  
	  @GetMapping("/send-email")
	  public String getSendEmailForm() {
		  return "email-sender";
	  }
	  
	  @PostMapping("/send-email")
	  public String sendEmail(@ModelAttribute Email email) {
	    emailService.sendEmail(email);
	    emailRepository.save(email);
	    return "redirect:/send-email";
	  }

}
