package com.ra.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GifSplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif_splash_screen);

        GifImageView gifImageView = (GifImageView) findViewById(R.id.GifImageView);
        gifImageView.setGifImageResource(R.drawable.giphy);
    }
}
