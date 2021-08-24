package com.example.intents_and_intent_filters_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(view -> {

            String textMessage ="Hello world!";
            // Create the text message with a string.
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, textMessage);
            sendIntent.setType("text/plain");

             // Try to invoke the intent.
            try {
                startActivity(sendIntent);
            } catch (ActivityNotFoundException e) {
                // Define what your app should do if no activity can handle the intent.
            }

        });
    }
}