package com.example.copy;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    private static final String TAG = "LogInActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox2);
        final String[] correctNumber = new String[2];
        //登录
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //学号
                EditText number = (EditText) findViewById(R.id.editTextNumber5);
                correctNumber[0] = number.getText().toString();
                //密码
                EditText password = (EditText) findViewById(R.id.editTextNumberPassword);
                correctNumber[1] = password.getText().toString();
                Log.e(TAG, "输入的学号！！！！" + correctNumber[0] + "输入的密码！！！" + correctNumber[1]);
                if ("2020214629".equals(correctNumber[0])) {
                    if ("20020303".equals(correctNumber[1])) {
                        if (checkBox.isChecked() == true) {
                            Intent intent = new Intent(LogIn.this, XxJj.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(getApplicationContext(), "请先同意用户协议吧", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "请检查一下密码吧，似乎有点儿问题", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "请检查一下学号吧，似乎有点儿问题", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //游客模式
        TextView guestMode = (TextView) findViewById(R.id.guestMode);
        guestMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked() == true) {
                    Intent intent = new Intent(LogIn.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "请先同意用户协议吧", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}