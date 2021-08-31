package com.example.playground.controller;

import com.example.playground.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @GetMapping("/list/all")
    public ResponseEntity<?> getMessage() {
        return new ResponseEntity<Object>(messageService.messageFromData(), HttpStatus.OK);
    }

}
