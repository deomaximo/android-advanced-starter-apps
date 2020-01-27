package com.example.twoactivitiescodechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String pmsg = getIntent().getStringExtra(MainActivity.PASSAGE_MESSAGE);

        TextView txtView = findViewById(R.id.txtPassage);
        txtView.setText(pmsg);

    }
}
