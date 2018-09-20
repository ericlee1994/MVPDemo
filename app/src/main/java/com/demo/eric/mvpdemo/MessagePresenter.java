package com.demo.eric.mvpdemo;

public class MessagePresenter implements MessageContact.Presenter{

    private final MessageRepository messageRepository;
    private final MessageContact.View mMessageView;

    public MessagePresenter(MessageRepository messageRepository, MessageContact.View mMessageView) {
        this.messageRepository = messageRepository;
        this.mMessageView = mMessageView;
        mMessageView.setPresenter(this);
    }

    @Override
    public void getData() {
        messageRepository.getMessageCallback(new ServerDataSource.MessageCallback() {
            @Override
            public void callback(String msg) {
                mMessageView.showToast(msg);
            }
        });
    }

    @Override
    public void sendMessage(String msg) {
        messageRepository.sendMessageToServer(msg);
    }

    @Override
    public void start() {

    }
}
