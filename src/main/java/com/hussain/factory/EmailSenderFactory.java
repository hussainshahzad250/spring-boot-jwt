package com.hussain.factory;

import com.hussain.entity.EmailConfig;
import com.hussain.repository.EmailConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class EmailSenderFactory {

    private final Map<String, JavaMailSender> mailSenders = new HashMap<>();

    EmailProperties emailProperties = new EmailProperties();

    @Autowired
    private EmailConfigRepository emailConfigRepository;

    @PostConstruct
    public void setupEmailConfig() {
        emailProperties.setAccounts(emailConfigRepository.findAll());
        if (!CollectionUtils.isEmpty(emailProperties.getAccounts())) {
            for (EmailConfig config : emailProperties.getAccounts()) {
                mailSenders.put(config.getName(), createMailSender(config));
            }
        }
    }

    private JavaMailSender createMailSender(EmailConfig config) {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(config.getHost());
        mailSender.setPort(config.getPort());
        mailSender.setUsername(config.getUsername());
        mailSender.setPassword(config.getPassword());

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", config.getProtocol());
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        return mailSender;
    }

    public JavaMailSender getMailSender(String accountName) {
        return mailSenders.getOrDefault(accountName, mailSenders.values().iterator().next());
    }
}
