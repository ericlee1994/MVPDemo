package com.demo.eric.mvpdemo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MessageFragment messageFragment;
    private MessagePresenter messagePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (messageFragment == null) {
            messageFragment = MessageFragment.newInstance();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.message_fragment, messageFragment);
            transaction.commit();
        }

        messagePresenter = new MessagePresenter(MessageRepository.getInstance(), messageFragment);
    }
}
