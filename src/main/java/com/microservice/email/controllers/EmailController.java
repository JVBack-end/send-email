package com.microservice.email.controllers;

import com.microservice.email.dtos.EmailRequest;
import com.microservice.email.models.EmailModel;
import com.microservice.email.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sedingEmail(@RequestBody EmailRequest emailRequest) {
        return new ResponseEntity<>(emailService.sendEmail(emailRequest), HttpStatus.CREATED);
    }

}