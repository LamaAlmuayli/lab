package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView receiver_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receiver_msg= findViewById(R.id.recieved_value_id);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        str = "Hello, " + str + "!";
        receiver_msg.setText(str);
    }
}