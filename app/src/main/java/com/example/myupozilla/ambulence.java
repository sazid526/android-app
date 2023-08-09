package com.example.myupozilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class ambulence extends AppCompatActivity {
    LinearLayout ambulence;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulence);
        ambulence = findViewById(R.id.ambulence);
    }
}