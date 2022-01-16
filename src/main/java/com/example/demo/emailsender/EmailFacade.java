package com.example.demo.emailsender;

public class EmailFacade {

    private final EmailRetriever emailRetriever;
    private final EmailSender emailSender;

    public EmailFacade(EmailRetriever emailRetriever, EmailSender emailSender) {
        this.emailRetriever = emailRetriever;
        this.emailSender = emailSender;
    }
}
