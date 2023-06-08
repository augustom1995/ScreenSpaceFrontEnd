package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Salas_Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salas_admin);
    }

    public void InicioCine(View view){

        Intent intent = new Intent(this, Inicio_Admin.class);
        startActivity(intent);
        finish();
    }

    public void Opciones(View view){

        Intent intent = new Intent(this, Opciones_Admin.class);
        startActivity(intent);
        finish();
    }

    public void CrearSala(View view){

        Intent intent = new Intent(this, Crear_Sala.class);
        startActivity(intent);
        finish();
    }

    public void VerFuncion(View view){

        Intent intent = new Intent(this, Ver_Funcion.class);
        startActivity(intent);
        finish();
    }
}