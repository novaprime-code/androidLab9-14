package com.example.lab9to14;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Experiment10Activity extends AppCompatActivity {
 private Button btnContextMenuActivate, btnShowPopupMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experiment10_activity);
        getSupportActionBar().setTitle("Option Menu Example");

        btnContextMenuActivate = findViewById(R.id.btnContextMenuActivate);
        registerForContextMenu(btnContextMenuActivate);

        btnShowPopupMenu= findViewById(R.id.btnShowPopupMenu);
        btnShowPopupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu();
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




//   CINTEXT MENU STARTS
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_options, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
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

    //   CONTEXT MENU ends

    // POPUP MENU STARTS
    private void showPopupMenu(){
        PopupMenu popupMenu = new PopupMenu(this, btnShowPopupMenu);
        popupMenu.getMenuInflater().inflate(R.menu.menu_options, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.menu_option1) {
                    Toast.makeText(Experiment10Activity.this, "Home is selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.menu_option2) {
                    Toast.makeText(Experiment10Activity.this, "Accounts is selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.menu_option3) {
                    Toast.makeText(Experiment10Activity.this, "Details is selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.menu_option4) {
                    Toast.makeText(Experiment10Activity.this, "Settings is selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.menu_option5) {
                    Toast.makeText(Experiment10Activity.this, "Logout is selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else {
                    return false;
                }
            }
        });
        popupMenu.show();

    }


}