package com.example.android.sinemmusicapp;

public class Music {

    String mSongName;
    String mArtistName;
    int mImageResourceID;

    public Music(String songName, String artistName, int imageResourceID) {

        mSongName = songName;
        mArtistName = artistName;
        mImageResourceID = imageResourceID;

    }


    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }


}
