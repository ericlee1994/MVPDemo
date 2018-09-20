package com.demo.eric.mvpdemo;

public interface ServerDataSource {
    interface MessageCallback{
        void callback(String msg);
    }

    void getMessageCallback(MessageCallback messageCallback);

    void sendMessageToServer(String msg);
}
