package com.example.KeyboardReactiveService.service;

import com.example.KeyboardReactiveService.model.MyKeyboard;
import com.example.KeyboardReactiveService.repository.MyKeyboardRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;
@Service
public class KeyboardServiceImpl implements KeyboardService {

   private MyKeyboardRepository myKeyboardRepository;

    public KeyboardServiceImpl(MyKeyboardRepository myKeyboardRepository) {
        this.myKeyboardRepository = myKeyboardRepository;
    }

    @Override
    public Flux<MyKeyboard> getAllKeyboards() {
        return myKeyboardRepository.findAll();
    }
}
