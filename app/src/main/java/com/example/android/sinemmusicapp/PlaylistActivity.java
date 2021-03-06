package com.example.android.sinemmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        Bundle bundle = getIntent().getExtras();
        final int message = bundle.getInt("message");

        final ArrayList<Music> music = new ArrayList<Music>();

        final ListView background = (ListView) findViewById(R.id.list);

        if (message == 1) {
            setTitle(R.string.category_jazz);
            background.setBackgroundResource(R.drawable.jazz_background);
            music.add(new Music("So What", "Miles Davis", R.drawable.miles_davis));
            music.add(new Music("My Favorite Things", "Dave Brubeck", R.drawable.dave_brubeck));
            music.add(new Music("Take Five", "Miles Davis", R.drawable.miles_davis));
            music.add(new Music("Acknowledgement", "John Coltrane", R.drawable.john_coltrane));
            music.add(new Music("Freddie Freeloader", "Miles Davis", R.drawable.miles_davis));
            music.add(new Music("Equinox", "John Coltrane", R.drawable.john_coltrane));

        } else if (message == 2) {
            setTitle(R.string.category_classical);
            background.setBackgroundResource(R.drawable.classical_background);
            music.add(new Music("Symphony 5, movement I", "Beethoven", R.drawable.beethoven));
            music.add(new Music("1812 overture", "Tchaikovsky", R.drawable.tchaikovsky));
            music.add(new Music("Symphony 9, movement IV(Ode to Joy)", "Beethoven", R.drawable.beethoven));
            music.add(new Music("Toccata and Fugue in D minor", "Bach", R.drawable.bach));
            music.add(new Music("Fantasie Improptu", "Chopin", R.drawable.chopin));
            music.add(new Music("Symphony 40", "Mozart", R.drawable.mozart));
            music.add(new Music("Swan Lake Waltz", "Tchaikovsky", R.drawable.tchaikovsky));
            music.add(new Music("Cello Suite", "Bach", R.drawable.bach));
            music.add(new Music("Ave Maria", "Schubert", R.drawable.schubert));
            music.add(new Music("Moonlight Sonata", "Beethoven", R.drawable.beethoven));

        } else if (message == 3) {
            setTitle(R.string.category_rock);
            background.setBackgroundResource(R.drawable.rock_background);
            music.add(new Music("Stairway to Heaven", "Led Zeppelin", R.drawable.led_zeppelin));
            music.add(new Music("Bohemian Rhapsody", "Queen", R.drawable.queen));
            music.add(new Music("Free Bird", "Lynyrd Skynyrd", R.drawable.lynyrd_skynyrd));
            music.add(new Music("Smoke on the Water", "Deep Purple", R.drawable.deep_purple));
            music.add(new Music("Stargazer", "Rainbow", R.drawable.rainbow));
            music.add(new Music("Supermassive Black Hole", "Muse", R.drawable.muse));
            music.add(new Music("Whole Lotta Love", "Led Zeppelin", R.drawable.led_zeppelin));
            music.add(new Music("Won't Get Fooled Again", "The Who", R.drawable.the_who));
            music.add(new Music("Back in Black", "AC/DC", R.drawable.ac_dc));
            music.add(new Music("We Will Rock You", "Queen", R.drawable.queen));
            music.add(new Music("Paint It Black", "Deep Purple", R.drawable.deep_purple));
            music.add(new Music("Hysteria", "Muse", R.drawable.muse));
        } else {
            setTitle(R.string.category_pop);
            background.setBackgroundResource(R.drawable.pop_background);
            music.add(new Music("Delicate", "Taylor Swift", R.drawable.taylor_swift));
            music.add(new Music("Slow Down", "Selena Gomez", R.drawable.selena_gomez));
            music.add(new Music("God's Plan", "Drake", R.drawable.drake));
            music.add(new Music("Single Ladies", "Beyonce", R.drawable.beyonce));
            music.add(new Music("Sick Boy", "The Chainsmokers", R.drawable.the_chainsmokers));
            music.add(new Music("One Kiss", "Calvin Harris", R.drawable.calvin_harris));
            music.add(new Music("Everybody Hates Me", "The Chainsmokers", R.drawable.the_chainsmokers));
            music.add(new Music("Don't Stop the Music", "Rihanna", R.drawable.rihanna));
            music.add(new Music("Faded", "Selena Gomez", R.drawable.selena_gomez));
            music.add(new Music("Run the World", "Beyonce", R.drawable.beyonce));
            music.add(new Music("Diamonds", "Rihanna", R.drawable.rihanna));
            music.add(new Music("Love Story", "Taylor Swift", R.drawable.taylor_swift));
        }

        final MusicAdapter adapter = new MusicAdapter(this, music);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        final ListView myList = (ListView) findViewById(R.id.list);


        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object listItem = myList.getItemAtPosition(position);
                Intent intent = new Intent(PlaylistActivity.this, NowPlaying.class);
                intent.putExtra("songName", music.get(position).getSongName());
                intent.putExtra("artistName", music.get(position).getArtistName());
                intent.putExtra("image", music.get(position).getImageResourceID());
                intent.putExtra("background", message);

                startActivity(intent);

            }
        });


    }

}

