package com.example.lab9to14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnExp9, btnExp10, btnExp13,btnExp14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnExp9 = findViewById(R.id.btnExperiment9);
        btnExp10 = findViewById(R.id.btnExperiment10);
        btnExp13 = findViewById(R.id.btnExperiment13);
        btnExp14 = findViewById(R.id.btnExperiment14);

        btnExp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Experiment9Activity.class);
                startActivity(intent);
            }
        });

        btnExp10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Experiment10Activity.class);
                startActivity(intent);
            }
        });
        btnExp13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Experiment13Activity.class);
                startActivity(intent);
            }
        });

        btnExp14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Experiment14Activity.class);
                startActivity(intent);
            }
        });


    }
}