package com.example.miwok_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Numbers(View view) {
        // Start the activity connect to the
        // specified class

        Intent i = new Intent(this, numbers.class);
        startActivity(i);
    }

    public void Color(View view) {

        Intent i = new Intent(this, color.class);
        startActivity(i);
    }

    public void Family(View view) {
        Intent i = new Intent(this, family.class);
        startActivity(i);
    }
}

