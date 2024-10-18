package com.example.mireciycleview;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Clases.Usuario;
import Clases.UsuarioAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewUsuarios;
    private UsuarioAdapter usuarioAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerViewUsuarios = findViewById(R.id.recyclerViewUsuario);
        recyclerViewUsuarios.setLayoutManager(new LinearLayoutManager(this));
        List<Usuario> usuarios = new ArrayList<>();

        Color colorShore = null;
        Color colorAldebaran = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            colorShore = Color.valueOf(0xff99fbf4);
            colorAldebaran = Color.valueOf(0xfffbe899);
        }

        Usuario shore = new Usuario("Shore","Hola","30 minutos",R.drawable.shore, colorShore);
        Usuario aldebaran = new Usuario("Aldebaran","Ya voy para alla","Ahora",R.drawable.aldebaran, colorAldebaran);

        usuarios.add(shore);
        usuarios.add(aldebaran);

//        ConstraintLayout l = findViewById(R.id.main);
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            l.setBackgroundColor(aldebaran.getColor().toArgb());
//        }

        usuarioAdapter = new UsuarioAdapter(usuarios);
        recyclerViewUsuarios.setAdapter(usuarioAdapter);

    }
}