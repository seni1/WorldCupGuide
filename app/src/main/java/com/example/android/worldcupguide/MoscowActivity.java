package com.example.android.worldcupguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MoscowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MoscowFragment())
                .commit();
    }
}
