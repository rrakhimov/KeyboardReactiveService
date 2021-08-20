package com.example.KeyboardReactiveService.controller;

import com.example.KeyboardReactiveService.model.MyKeyboard;
import com.example.KeyboardReactiveService.service.KeyboardService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class KeyboardRestController {
    private KeyboardService keyboardService;

    public KeyboardRestController(KeyboardService keyboardService) {
        this.keyboardService = keyboardService;
    }

    @GetMapping(value = "api/keyboard/all")
    public Flux<MyKeyboard> getAllKeyboards() {

        return keyboardService.getAllKeyboards();
    }
}
