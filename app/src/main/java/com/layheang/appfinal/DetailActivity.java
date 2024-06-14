package com.layheang.appfinal;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Enable the back button
        // Set the toolbar title

        TextView titleTextView = findViewById(R.id.detail_title);
        TextView messageTextView = findViewById(R.id.detail_message);

        // Get data from intent extras
        String title = getIntent().getStringExtra("title");
        String message = getIntent().getStringExtra("message");

        // Set data to views
        titleTextView.setText(title);
        messageTextView.setText(message);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle toolbar item clicks
        if (item.getItemId() == android.R.id.home) {
            onBackPressed(); // Navigate back when the back button is pressed
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
