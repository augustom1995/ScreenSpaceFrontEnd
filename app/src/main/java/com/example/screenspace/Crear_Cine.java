package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Crear_Cine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cine);
    }

    public void Volver(View view){

        Intent intent = new Intent(this, Inicio_Admin.class);
        startActivity(intent);
        finish();
    }

    public void CrearCuenta(View view){

        Intent intent = new Intent(this, Inicio_Admin.class);
        startActivity(intent);
        finish();
    }
}