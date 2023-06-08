package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ver_Funcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_funcion);
    }

    public void Volver(View view){

        Intent intent = new Intent(this, Salas_Admin.class);
        startActivity(intent);
        finish();
    }

    public void AgregarFuncion(View view){

        Intent intent = new Intent(this, Agregar_Funcion.class);
        startActivity(intent);
        finish();
    }
}