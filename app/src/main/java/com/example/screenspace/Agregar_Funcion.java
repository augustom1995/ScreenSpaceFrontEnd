package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Agregar_Funcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_funcion);
    }

    public void Volver(View view){

        Intent intent = new Intent(this, Ver_Funcion.class);
        startActivity(intent);
        finish();
    }

    public void AgregarFuncion(View view){

        Intent intent = new Intent(this, Ver_Funcion.class);
        startActivity(intent);
        finish();
    }
}