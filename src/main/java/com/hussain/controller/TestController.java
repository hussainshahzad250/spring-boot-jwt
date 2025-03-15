package com.hussain.controller;

import com.hussain.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/public")
public class TestController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello from Spring Boot Application");
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody String senderEmail) throws MessagingException, UnsupportedEncodingException {
        emailService.sendEmailT(senderEmail,"shahzad.jdeveloper@gmail.com","Test Mail","Hi Test");
        return ResponseEntity.ok("Hello from Spring Boot Application");
    }

}
