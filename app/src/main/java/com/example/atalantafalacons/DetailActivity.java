package com.example.atalantafalacons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView Header,Description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Header = findViewById(R.id.ac_detail_header);
        Description = findViewById(R.id.ac_detail_description);

        Intent getData = getIntent();

        String header = getData.getStringExtra("HEADER");
        String description = getData.getStringExtra("DESCRIPTION");

        Header.setText(header);
        Description.setText(description);

    }
}
