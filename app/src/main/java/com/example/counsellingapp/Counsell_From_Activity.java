package com.example.counsellingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Counsell_From_Activity extends AppCompatActivity {

    AppCompatButton signBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counsell_from);
        initView();
    }

    private void initView() {

        signBtn=findViewById(R.id.signBtn);

        signBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Counsell_From_Activity.this,SignUpPageActivity.class);
                    startActivity(i);
                }
            });

        }

}