package com.example.atalantafalacons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private ImageView karsilamaImg;
    private static int beklemeSursei = 4000; // 4 Saniye
    private TextView karsilamaMetni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        karsilamaImg = findViewById(R.id.ac_splash_img);
        karsilamaMetni = findViewById(R.id.ac_splash_text);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation);
        karsilamaImg.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(gecis);
                finish();
            }
        },beklemeSursei);
        karsilamaMetni.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(gecis);
                finish();
            }
        },beklemeSursei);

    }
}
