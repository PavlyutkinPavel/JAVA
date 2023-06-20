package com.patterns.adapter;

public class Main {
    public static void main(String[] args){
        Sender sender = new SendAdapter();
        sender.send();
    }
}
