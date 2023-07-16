package com.example.lab9to14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Experiment9Activity extends AppCompatActivity {
private Button btnFragmentA, btnFragmentB,btnFragmentC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experiment9_activity);

        btnFragmentA = findViewById(R.id.btnLoadFragmentA);
        btnFragmentB = findViewById(R.id.btnLoadFragmentB);
        btnFragmentC = findViewById(R.id.btnLoadFragmentC);

        btnFragmentA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment(new FragmentA());
            }
        });

        btnFragmentB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment(new FragmentB());
            }
        });
        btnFragmentC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment(new FragmentC());
            }
        });

    }
    private void loadFragment(Fragment fragment){
        FragmentManager fragmentManager =  getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.commit();
    }
}