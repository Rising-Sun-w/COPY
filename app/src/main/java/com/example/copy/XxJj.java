package com.example.copy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class XxJj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xxjj_layout);
        Button button1 = (Button) findViewById(R.id.xxJj1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XxJj.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(R.id.xxJj2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XxJj.this,XxHappy.class);
                startActivity(intent);
            }
        });
    }
}