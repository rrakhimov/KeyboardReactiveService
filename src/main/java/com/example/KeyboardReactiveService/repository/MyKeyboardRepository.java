package com.example.KeyboardReactiveService.repository;

import com.example.KeyboardReactiveService.model.MyKeyboard;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MyKeyboardRepository extends R2dbcRepository<MyKeyboard, Long> {
    Flux<MyKeyboard> findAll();
}
