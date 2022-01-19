package com.example.demo.emailsender;

class EmailConfiguration {

    public EmailFacade emailFacade(EmailRepository emailRepository) {
        EmailRetriever emailRetriever = new EmailRetriever(emailRepository);
        EmailSender emailSender = new EmailSender();
        return new EmailFacade(emailRetriever, emailSender);
    }

}
