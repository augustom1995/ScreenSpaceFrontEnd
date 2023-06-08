package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio_Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_admin);
    }

    public void Opciones(View view){

        Intent opciones = new Intent(this, Opciones_Admin.class);
        startActivity(opciones);
        finish();
    }

    public void InicioAdmin(View view){

        Intent intent = new Intent(this, Inicio_Admin.class);
        startActivity(intent);
        finish();
    }

    public void CrearCine(View view){

        Intent intent = new Intent(this, Crear_Cine.class);
        startActivity(intent);
        finish();
    }

    public void IrASalas(View view){

        Intent intent = new Intent(this, Salas_Admin.class);
        startActivity(intent);
        finish();
    }
}