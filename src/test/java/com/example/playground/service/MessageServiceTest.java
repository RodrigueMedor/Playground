package com.example.playground.service;

import com.example.playground.domain.Message;
import com.example.playground.domain.MessageEnlosing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class MessageServiceTest {

    @Mock
    RestTemplate restTemplate;

    @InjectMocks
    MessageService messageService;

    public static final String URL = "https://raw.githubusercontent.com/mlenze/CodingExcercise-Java/main/apidata.json";

    @Test
    void givenMockIsTest() {
        Message message = Message.builder().affenpinschers(Arrays.asList("irish")).basenji(Arrays.asList("american", "australian")).build();
        MessageEnlosing line = MessageEnlosing.builder()
                .message(message)
                .status("success")
                .build();

        ResponseEntity<Message> myEntity = new ResponseEntity<Message>(message, HttpStatus.OK);

        when(restTemplate.exchange(
                Matchers.eq(URL),
                Matchers.eq(HttpMethod.GET),
                Matchers.<HttpEntity<Message>>any(),
                Matchers.<ParameterizedTypeReference<Message>>any())
        ).thenReturn(myEntity);

        MessageEnlosing messageEnlosing = messageService.messageFromData();

        Assertions.assertEquals(line.getStatus(), messageEnlosing.getStatus());

        Assertions.assertDoesNotThrow(() -> messageService.messageFromData());
    }
}
