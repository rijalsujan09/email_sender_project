package com.projectsujan.emailsender.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectsujan.emailsender.entity.Email;
@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {

}
