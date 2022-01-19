package com.example.demo.emailsender;

public interface EmailRepository {
    String getById(String emailId);

    String saveById(String emailId, String content);
}
