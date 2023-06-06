package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Crear_Cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }

    public void CrearCuenta(View view){

        Intent iniciarSesion = new Intent(this, Exito_Crear_Cuenta.class);
        startActivity(iniciarSesion);
        finish();
    }

    public void Volver(View view){

        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
        finish();
    }
}