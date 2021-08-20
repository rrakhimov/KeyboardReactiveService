package com.example.KeyboardReactiveService.model;

import org.springframework.data.annotation.Id;

public class MyKeyboard {
    @Id
    private Long id;
    private String text;
    private String responce;

    public MyKeyboard() {
    }

    public MyKeyboard(Long id, String text, String responce) {
        this.id = id;
        this.text = text;
        this.responce = responce;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResponce() {
        return responce;
    }

    public void setResponce(String responce) {
        this.responce = responce;
    }

    @Override
    public String toString() {
        return "MyKeyboard{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", responce='" + responce + '\'' +
                '}';
    }
}
