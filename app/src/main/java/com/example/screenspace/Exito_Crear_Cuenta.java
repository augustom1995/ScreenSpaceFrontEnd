package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Exito_Crear_Cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exito_crear_cuenta);
    }

    public void Inicio(View view){

        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
        finish();
    }
}