package com.ra.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button normal, multi, gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NormalSplashScreen.class);
                startActivity(intent);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MultiGradientSplashScreen.class);
                startActivity(intent);
            }
        });

        gif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GifSplashScreen.class);
                startActivity(intent);
            }
        });
    }

    private void init() {
        normal = findViewById(R.id.normalSS);
        multi = findViewById(R.id.mulGSS);
        gif = findViewById(R.id.gifSS);
    }
}
