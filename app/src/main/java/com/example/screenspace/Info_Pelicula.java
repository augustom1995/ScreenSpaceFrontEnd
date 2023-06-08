package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Info_Pelicula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_pelicula);
    }

    public void Volver(View view){

        Intent intent = new Intent(this, Inicio_Usuarios.class);
        startActivity(intent);
        finish();
    }

    public void Resenar(View view){

        Intent intent = new Intent(this,Resena_Pelicula.class);
        startActivity(intent);
        finish();
    }

    public void Compartir(View view){

        Intent intent = new Intent(this, Inicio_Usuarios.class);
        startActivity(intent);
        finish();
    }

    public void Reservar(View view){

        Intent intent = new Intent(this, Usuario_Reservar.class);
        startActivity(intent);
        finish();
    }
}