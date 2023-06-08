package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Opciones_Usuarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_usuarios);
    }
    public void Volver(View view){

        Intent intent = new Intent(this, Inicio_Usuarios.class);
        startActivity(intent);
        finish();
    }
    public void Configuracion(View view){

        Intent intent = new Intent(this, Config_Cuenta_Usuarios.class);
        startActivity(intent);
        finish();
    }
    public void CerrarSesion(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}