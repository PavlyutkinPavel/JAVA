package com.patterns.adapter;

public class SmsSender extends Sender{
    @Override
    void send() {
        System.out.println("SMS send successfully");
    }
}
