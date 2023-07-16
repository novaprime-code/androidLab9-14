package com.example.lab9to14;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Experiment14Activity extends AppCompatActivity {
    private EditText etLength, etWidth;
    private TextView tvArea;
    private Button btnShowCustomDialog, btnBack, btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experiment14_activity);
        btnShowCustomDialog = findViewById(R.id.btnShowCustomDialog);

        btnShowCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCustomDialog();
            }
        });
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close the current activity and return to the previous activity
            }
        });
    }

    private void showCustomDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Experiment14Activity.this);
        builder.setTitle("Calculate Area ");
        builder.setCancelable(true);

        LayoutInflater inflater = getLayoutInflater();
        View dialogView  =  inflater.inflate(R.layout.dialog_custom, null);
        builder.setView(dialogView );

        etLength = dialogView.findViewById(R.id.etLength);
        etWidth = dialogView.findViewById(R.id.etWidth);
        btnCalculate = dialogView.findViewById(R.id.btnCalculate);
        tvArea = dialogView.findViewById(R.id.tvArea);


        AlertDialog alert = builder.create();
        alert.show();

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lengthStr = etLength.getText().toString().trim();
                String widthStr = etWidth.getText().toString().trim();

                if (lengthStr.isEmpty() || widthStr.isEmpty()) {
                    // Handle the case where one or both input fields are empty
                    Toast.makeText(getApplicationContext(), "Please enter values for length and width", Toast.LENGTH_SHORT).show();
                } else {
                    double length = Double.parseDouble(lengthStr);
                    double width = Double.parseDouble(widthStr);
                    double area = length * width;
                    tvArea.setText("Area: " + area);
                }
            }
        });
    }

}