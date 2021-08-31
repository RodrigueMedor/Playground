package com.example.playground.service;

import com.example.playground.domain.Message;
import com.example.playground.domain.MessageEnlosing;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.List;

@Service
public class MessageService {
    public static final String URL = "https://raw.githubusercontent.com/mlenze/CodingExcercise-Java/main/apidata.json";
    @Autowired
    RestTemplate restTemplate;

    public MessageEnlosing messageFromData(){
        ObjectMapper objectMapper = new ObjectMapper();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity entity = new HttpEntity(headers);

        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        ResponseEntity<Message> responseEntity =
                restTemplate.exchange(URL,
                        HttpMethod.GET, entity, new ParameterizedTypeReference<Message>() {
                        });
        Message message = responseEntity.getBody();
//
//        List<Message> messages = objectMapper.convertValue(message, new TypeReference<List<Message>>() {
//        });

        System.out.println(message);
        return null;
    }
}
