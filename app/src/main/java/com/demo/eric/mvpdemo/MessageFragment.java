package com.demo.eric.mvpdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;

public class MessageFragment extends Fragment implements MessageContact.View{

    public static MessageFragment newInstance() {
        return new MessageFragment();
    }

    private MessageContact.Presenter presenter;
    private Button button;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button = new Button(getActivity());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.sendMessage("send message!");
            }
        });
    }

    @Override
    public void showToast(String msg) {
        //todo
    }

    @Override
    public void setPresenter(MessageContact.Presenter presenter) {
        this.presenter = presenter;
    }
}
