package com.example.demo.emailsender;

import com.example.demo.emailsender.dto.EmailDto;

public class EmailFacade {

    private final EmailRetriever emailRetriever;
    private final EmailSender emailSender;

    public EmailFacade(EmailRetriever emailRetriever, EmailSender emailSender) {
        this.emailRetriever = emailRetriever;
        this.emailSender = emailSender;
    }

    public EmailDto retrieveEmail(String emailId) {
        return new EmailDto(emailId, emailRetriever.retrieve(emailId));
    }

    public String addEmail(String emailId, String content) {
        return emailRetriever.addEmail(emailId, content);
    }
}
