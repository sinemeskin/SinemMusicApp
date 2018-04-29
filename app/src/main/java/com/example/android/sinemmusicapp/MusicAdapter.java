package com.example.android.sinemmusicapp;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {


    private static final String LOG_TAG = com.example.android.sinemmusicapp.MusicAdapter.class.getSimpleName();


    public MusicAdapter(Activity context, ArrayList<Music> music) {

        super(context, 0, music);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Music currentMusic = getItem(position);

        TextView songTextView = (TextView)listItemView.findViewById(R.id.song_name);
        songTextView.setText(currentMusic.getSongName());

        TextView artistTextView = (TextView)listItemView.findViewById(R.id.artist_name);
        artistTextView.setText(currentMusic.getArtistName());

        ImageView imageTextView = (ImageView) listItemView.findViewById(R.id.image);
        imageTextView.setImageResource(currentMusic.getImageResourceID());


        return listItemView;

    }
}
