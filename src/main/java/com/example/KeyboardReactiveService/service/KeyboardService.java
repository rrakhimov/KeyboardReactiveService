package com.example.KeyboardReactiveService.service;

import com.example.KeyboardReactiveService.model.MyKeyboard;
import reactor.core.publisher.Flux;

import java.util.List;

public interface KeyboardService {

    Flux<MyKeyboard> getAllKeyboards();
}
