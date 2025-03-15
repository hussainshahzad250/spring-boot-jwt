package com.hussain.service;

import com.hussain.factory.EmailSenderFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Slf4j
@Service
public class EmailService {

    private final EmailSenderFactory emailSenderFactory;

    public EmailService(EmailSenderFactory emailSenderFactory) {
        this.emailSenderFactory = emailSenderFactory;
    }

    public void sendEmail(String senderEmail, String to, String subject, String body) {
        JavaMailSender mailSender = emailSenderFactory.getMailSender(senderEmail);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(senderEmail);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
        log.info("Mail sent successfully to {}", to);
    }

    public void sendEmailT(String senderEmail, String to, String subject, String text) throws MessagingException, UnsupportedEncodingException {
        JavaMailSender mailSender = emailSenderFactory.getMailSender(senderEmail);
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        helper.setTo(to);
        helper.setText(text);
        helper.setSubject(subject);
        helper.setFrom(new InternetAddress(senderEmail, "Sender Name").toString());
        mailSender.send(message);
        log.info("Mail sent successfully to {}", to);
    }
}
