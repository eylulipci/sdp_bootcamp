package com.github.eylulipci.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        TextView textView = (TextView) findViewById(R.id.greetingMessage);
        Intent i = getIntent();

        String name = i.getStringExtra("NAME");
        textView.setText(String.format("Greetings %s", name));

    }
}
