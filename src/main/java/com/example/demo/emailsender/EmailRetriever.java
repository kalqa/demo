package com.example.demo.emailsender;

class EmailRetriever {
    private final EmailRepository emailRepository;

    EmailRetriever(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    String retrieve(String emailId) {
        return emailRepository.getById(emailId);
    }

    String addEmail(String emailId, String content) {
        return emailRepository.saveById(emailId, content);
    }
}
