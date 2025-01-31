package com.example.mireciycleview;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mireciycleview.MainActivity;
import com.example.mireciycleview.R;

public class Splash extends AppCompatActivity {
    //    Splash
    private TextView textView;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.mireciycleview.R.layout.splash);




        new CountDownTimer(5000 , 1000) {

            @Override
            public void onTick(long milis) {
                int segundos = (int) (milis / 1000);
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();
        //crea un objeto Intent que se utiliza para iniciar una nueva actividad en Android.
        //la intención es iniciar la actividad MainActivity desde la actividad Splash.
    }
}