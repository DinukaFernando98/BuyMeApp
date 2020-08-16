package com.example.buymeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        //setSupportActionBar(toolbar);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        //set selected
        bottomNavigationView.setSelectedItemId(R.id.Home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.Home:
                        return true;

                    case R.id.Orders:
                        startActivity(new Intent(getApplicationContext()
                                ,Orders.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Cart:
                        startActivity(new Intent(getApplicationContext()
                                ,Cart.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Account:
                        startActivity(new Intent(getApplicationContext()
                                ,Account.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });

    }
}