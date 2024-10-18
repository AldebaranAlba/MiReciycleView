package com.example.mireciycleview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Perfil extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil);

        ImageView imageViewPicChat = findViewById(R.id.imageViewPicChat);
        TextView textViewMensajePerfil = findViewById(R.id.textViewMensajePerfil);
        ConstraintLayout constraintLayoutPerfil = findViewById(R.id.constraintLayoutPerfil);

        Intent intent = getIntent();
        int imagen = intent.getIntExtra("imagen", 0);
        String mensajeChat = intent.getStringExtra("mensaje_chat");
        int color = intent.getIntExtra("color",0);

        imageViewPicChat.setImageResource(imagen);
        textViewMensajePerfil.setText(mensajeChat);
        constraintLayoutPerfil.setBackgroundColor(color);

    }
}
