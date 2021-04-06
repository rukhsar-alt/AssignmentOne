package com.example.alphabetapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
    Button alphabetsButton;
    Button videoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().setTitle("Learn Alphabets");
        alphabetsButton =findViewById(R.id.alphabetsButton);
        videoButton=findViewById(R.id.videoButton);
        alphabetsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AlphabetsView.class));
            }
        });
    }
}