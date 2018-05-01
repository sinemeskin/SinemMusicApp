package com.example.android.sinemmusicapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button jazz = (Button) findViewById(R.id.jazz);

        // Set a click listener on that View
        jazz.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent jazzIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                jazzIntent.putExtra("message", 1);
                startActivity(jazzIntent);
            }
        });

        Button classical = (Button) findViewById(R.id.classical);

        // Set a click listener on that View
        classical.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent classicalIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                classicalIntent.putExtra("message", 2);
                startActivity(classicalIntent);
            }
        });

        Button rock = (Button) findViewById(R.id.rock);

        // Set a click listener on that View
        rock.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                rockIntent.putExtra("message", 3);
                startActivity(rockIntent);
            }
        });

        Button pop = (Button) findViewById(R.id.pop);

        // Set a click listener on that View
        pop.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                popIntent.putExtra("message", 4);
                startActivity(popIntent);
            }
        });


    }
}
