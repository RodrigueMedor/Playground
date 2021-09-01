package com.example.playground.service;

import com.example.playground.domain.Message;
import com.example.playground.domain.MessageEnlosing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class MessageService {

    public static final String URL = "https://raw.githubusercontent.com/mlenze/CodingExcercise-Java/main/apidata.json";

    @Autowired
    private RestTemplate restTemplate;

    public MessageEnlosing messageFromData() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity entity = new HttpEntity(headers);

        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        ResponseEntity<Message> responseEntity =
                restTemplate.exchange(URL,
                        HttpMethod.GET, entity, new ParameterizedTypeReference<Message>() {
                        });
        Message entityBody = responseEntity.getBody();

        MessageEnlosing messageEnlosing = MessageEnlosing.builder()
                .message(entityBody)
                .status("success")
                .build();

        return messageEnlosing;
    }
}
