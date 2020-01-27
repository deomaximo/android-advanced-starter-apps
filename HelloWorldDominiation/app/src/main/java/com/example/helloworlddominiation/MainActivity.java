package com.example.helloworlddominiation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, SecondActivity.class);


    }

    public void openSecondActivity(View view) {
        view.getId();
        TextView txtPassage = findViewById(view.getId());
        String txtPsg = txtPassage.getText().toString();
        if (txtPsg == getString(R.string.passage_1)) {
                //Passage 1
            } else if (txtPsg == getString(R.string.passage_2)) {
                    //Passage 2
                } else if (txtPsg == getString(R.string.passage_3)){
                        //Passage 3

                    }

        startActivity(intent);
    }
}
