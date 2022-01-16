package com.example.demo.emailsender;

class EmailConfiguration {

    public EmailFacade emailFacade() {
        EmailRetriever emailRetriever = new EmailRetriever();
        EmailSender emailSender = new EmailSender();
        return new EmailFacade(emailRetriever, emailSender);
    }


}
