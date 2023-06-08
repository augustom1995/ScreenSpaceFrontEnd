package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Crear_Sala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_sala);
    }

    public void Volver(View view){

        Intent intent = new Intent(this, Salas_Admin.class);
        startActivity(intent);
        finish();
    }

    public void CrearSala(View view){

        Intent intent = new Intent(this, Salas_Admin.class);
        startActivity(intent);
        finish();
    }
}