package com.example.demo.emailsender.dto;

import lombok.Value;

@Value
public class EmailDto {

    String id;
    String content;

    public EmailDto(String id, String content) {
        this.id = id;
        this.content = content;
    }

}
