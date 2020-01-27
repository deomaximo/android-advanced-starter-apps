package com.example.twoactivitiescodechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private Intent intent = new Intent(this, SecondActivity.class);
    public static final String PASSAGE_MESSAGE = "com.example.twoactivitiescodechallenge.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void sendPassageMessage(String pMessage) {
        intent.putExtra(EXTRA_MESSAGE, pMessage);
        startActivity(intent);
    }

    public void clk_btn1(View view) {
        sendPassageMessage(getString(R.string.btn_psg1));
    }

    public void clk_btn2(View view) {
        sendPassageMessage(getString(R.string.btn_psg2));
    }

    public void clk_btn3(View view) {
        sendPassageMessage(getString(R.string.btn_psg3));
    }
}
