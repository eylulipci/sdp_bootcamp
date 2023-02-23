package com.github.eylulipci.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.mainGoButton);
        EditText text = (EditText) findViewById(R.id.mainName);

        button.setOnClickListener(v -> {
            // Do something in response to button click
            Intent intent = new Intent(v.getContext(), GreetingActivity.class);
            intent.putExtra("NAME", text.getText().toString());
            v.getContext().startActivity(intent);
        });
    }
}