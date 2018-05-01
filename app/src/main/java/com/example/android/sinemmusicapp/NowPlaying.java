package com.example.android.sinemmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
        setTitle(R.string.now_playing);


        Intent intent = getIntent();
        String playSongName = intent.getStringExtra("songName");
        String playArtistName = intent.getStringExtra("artistName");
        int playImage = intent.getIntExtra("image", 0);
        int backgroundImage = intent.getIntExtra("background", 0);

        LinearLayout background = (LinearLayout) findViewById(R.id.now_playing_layout);

        if (backgroundImage == 1) {
            background.setBackgroundResource(R.drawable.jazz_background);
        } else if (backgroundImage == 2) {
            background.setBackgroundResource(R.drawable.classical_background);
        } else if (backgroundImage == 3) {
            background.setBackgroundResource(R.drawable.rock_background);
        } else {
            background.setBackgroundResource(R.drawable.pop_background);
        }

        TextView songTextView = findViewById(R.id.play_song_name);
        songTextView.setText(playSongName);

        TextView artistTextView = findViewById(R.id.play_artist_name);
        artistTextView.setText(playArtistName);

        ImageView imageImageView = findViewById(R.id.play_image);
        imageImageView.setImageResource(playImage);
    }
}
