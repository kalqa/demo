package com.example.demo.emailsender.infrastructure.db;

import com.example.demo.emailsender.EmailRepository;

// in real life this class would be interface extending Repository from Spring Data
class MongoDbEmailRepository implements EmailRepository {

    @Override
    public String getById(String emailId) {
        return null;
    }

    @Override
    public String saveById(String emailId, String content) {
        return null;
    }
}
