package com.example.finalprojeodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView splashText, splashText2, splashText3;
    private ImageView splashLogo;
    private static int GecisSuresi = 7000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        splashText = findViewById(R.id.splashText);
        splashText2 = findViewById(R.id.splashText2);
        splashText3 = findViewById(R.id.splashText3);
        splashLogo = findViewById(R.id.splashLogo);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(MainActivity.this, LoginActivity.class);
                //Intent gecis = new Intent(MainActivity.this, UserListActivity.class);
                startActivity(gecis);
                finish();
            }
        }, GecisSuresi);
    }
}
