package com.demo.eric.mvpdemo;

public class MessageRepository implements ServerDataSource {

    private MessageCallback messageCallback;
    private static MessageRepository INSTANCE = null;

    private MessageRepository() {

    }

    public static MessageRepository getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new MessageRepository();
        }
        return INSTANCE;
    }

    @Override
    public void getMessageCallback(MessageCallback messageCallback) {
        this.messageCallback = messageCallback;
    }

    @Override
    public void sendMessageToServer(String msg) {
        //todo
    }

}
