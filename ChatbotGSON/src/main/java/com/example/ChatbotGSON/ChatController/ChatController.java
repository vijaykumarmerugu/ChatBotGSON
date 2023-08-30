package com.example.ChatbotGSON.ChatController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    @GetMapping("/chat")
    public String Chat(@RequestParam String message){
        return "You Asked:" +message;
    }

}
