package com.example.lab9to14;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Experiment13Activity extends AppCompatActivity {
 private Button btnShowAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experiment13_activity);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close the current activity and return to the previous activity
            }
        });

        btnShowAlertDialog= findViewById(R.id.btnShowAlertDialog);
        btnShowAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog();

            }
        });

    }

    private void showAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("This is Alert Dialog");
        builder.setMessage("Are YOu sure to Logout?");
        builder.setPositiveButton("Yes",(dialog, which)->{
            Toast.makeText(Experiment13Activity.this, "You are logged out!!!", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });
        builder.setNegativeButton("No",(dialog,which)->{
            Toast.makeText(Experiment13Activity.this, "Nice, u should not logout !", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });
        AlertDialog dialog = builder.create();
        dialog.show();

    }





}