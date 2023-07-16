package com.example.lab9to14;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Experiment10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experiment10_activity);
        getSupportActionBar().setTitle("Option Menu Example");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.menu_option1) {
            Toast.makeText(this, "Home is selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.menu_option2) {
            Toast.makeText(this, "Accounts is selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.menu_option3) {
            Toast.makeText(this, "Details is selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.menu_option4) {
            Toast.makeText(this, "Settings is selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.menu_option5) {
            Toast.makeText(this, "Logout is selected", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }


    }
}