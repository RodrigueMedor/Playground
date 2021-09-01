package com.example.playground.controller;

import com.example.playground.domain.MessageEnlosing;
import com.example.playground.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @GetMapping("/list/all")
    public ResponseEntity<MessageEnlosing> getMessage() {
        return new ResponseEntity<>(messageService.messageFromData(), HttpStatus.OK);
    }

}
