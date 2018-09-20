package com.demo.eric.mvpdemo;

public interface MessageContact {
    interface View extends BaseView<Presenter> {

        void showToast(String msg);

    }

    interface Presenter extends BasePresenter {

        void getData();
        void sendMessage(String msg);
    }
}
