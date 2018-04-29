package com.example.android.sinemmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

                // Get the Intent that started this activity and extract the string
               Intent intent = getIntent();
               String message = intent.getStringExtra("songName");


                TextView textView = findViewById(R.id.play_song_name);
                textView.setText(message);
    }
}
