package com.example.counsellingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginPageActivity extends AppCompatActivity {
    TextView signUpTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        initLoginView();
    }

    private void initLoginView() {
        signUpTxt=findViewById(R.id.signUpTxt);

        signUpTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(LoginPageActivity.this,SignUpPageActivity.class);
                startActivity(i);
            }
        });
    }
}