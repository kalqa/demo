package com.example.demo.emailsender;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryEmailRepository implements EmailRepository {

    private final Map<String, String> storage = new ConcurrentHashMap<>();

    @Override
    public String getById(String emailId) {
        return storage.get(emailId);
    }

    @Override
    public String saveById(String emailId, String content) {
        storage.put(emailId, content);
        return emailId;
    }
}
