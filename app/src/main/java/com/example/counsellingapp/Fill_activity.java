package com.example.counsellingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Fill_activity extends AppCompatActivity {
    AppCompatButton next2Btn;
    TextView skip2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill);
        initSecondView();
    }

    private void initSecondView() {
        next2Btn=findViewById(R.id.Next2Btn);
        skip2=findViewById(R.id.skip2);

        next2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Fill_activity.this,Counsell_From_Activity.class);
                startActivity(i);
            }
        });

        skip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Fill_activity.this,LoginPageActivity.class);
                startActivity(intent);
            }
        });
    }
}