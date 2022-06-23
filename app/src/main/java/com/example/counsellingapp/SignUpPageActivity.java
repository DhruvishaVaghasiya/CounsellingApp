package com.example.counsellingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUpPageActivity extends AppCompatActivity {

    TextView loginTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        initView();
    }

    private void initView() {
        loginTxt=findViewById(R.id.loginTxt);

        loginTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignUpPageActivity.this,LoginPageActivity.class);
                startActivity(i);
            }
        });
    }
}