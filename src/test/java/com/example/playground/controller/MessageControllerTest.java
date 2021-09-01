package com.example.playground.controller;

import com.example.playground.domain.Message;
import com.example.playground.domain.MessageEnlosing;
import com.example.playground.service.MessageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class MessageControllerTest {

    private MockMvc mockMvc;

    @Mock
    MessageService messageService;

    @InjectMocks
    MessageController messageController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(messageController).build();
    }

    @Test
    void testEndPoint_success() throws Exception {
        Message message = Message.builder().affenpinschers(Arrays.asList("irish")).basenji(Arrays.asList("american", "australian")).build();
        MessageEnlosing line = MessageEnlosing.builder()
                .message(message)
                .status("success")
                .build();

        when(messageService.messageFromData()).thenReturn(line);

        MvcResult result = this.mockMvc.perform(
                        get("/list/all")
                                .accept(MediaType.APPLICATION_JSON_VALUE)
                                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        String actual = result.getResponse().getContentAsString();
        assertNotNull(actual);
    }
}
