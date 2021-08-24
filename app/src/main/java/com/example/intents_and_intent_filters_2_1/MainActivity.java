package com.example.intents_and_intent_filters_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    static final String EXTRA_GIGAWATTS = "com.example.EXTRA_GIGAWATTS";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            String fileUrl = "https://www.publicdomainpictures.net/pictures/320000/velka/background-image.png";
// Executed in an Activity, so 'this' is the Context
// The fileUrl is a string URL, such as "http://www.example.com/image.png"
            Intent downloadIntent = new Intent(this, DownloadService.class);
            downloadIntent.setData(Uri.parse(fileUrl));
            startService(downloadIntent);

        });
    }
}