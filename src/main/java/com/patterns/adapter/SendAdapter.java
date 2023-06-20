package com.patterns.adapter;

public class SendAdapter extends Sender{
    private final TelegramLogic telegramLogic = new TelegramLogic();
    @Override
    void send() {
        telegramLogic.sendMessageToTelegram();
    }
}
