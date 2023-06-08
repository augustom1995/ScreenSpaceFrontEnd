package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio_Usuarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_usuarios);
    }

    public void Inicio(View view){

        Intent intent = new Intent(this, Inicio_Usuarios.class);
        startActivity(intent);
        finish();
    }

    public void Opciones(View view){

        Intent intent = new Intent(this, Opciones_Usuarios.class);
        startActivity(intent);
        finish();
    }

    public void InfoPelicula(View view){

        Intent intent = new Intent(this, Info_Pelicula.class);
        startActivity(intent);
        finish();
    }
}