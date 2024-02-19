package com.example.local;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button b_breakfast, b_lunch, b_supper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_breakfast = findViewById(R.id.button5);
        b_lunch = findViewById(R.id.button6);
        b_supper = findViewById(R.id.button);

        b_breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BreakfastActivity.class);
                startActivity(intent);
            }
        });

        b_lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LunchActivity.class);
                startActivity(intent);
            }
        });

        b_supper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SupperActivity.class);
                startActivity(intent);
            }
        });
    }

    public void language(View view) {
        Intent intent = new Intent(MainActivity.this, TwoActivity.class);
        startActivity(intent);
    }
}