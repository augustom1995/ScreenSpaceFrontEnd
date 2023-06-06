package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IniciarConGoogle(View view){

        Intent iniciarGoogle = new Intent(this, Inicio_Usuarios.class);
        startActivity(iniciarGoogle);
        finish();
    }

    public void IniciarSesion(View view){

        Intent iniciarSesion = new Intent(this, Login.class);
        startActivity(iniciarSesion);
        //finish();
    }

    public void CrearCuenta(View view){

        Intent crearCuenta = new Intent(this, Crear_Cuenta.class);
        startActivity(crearCuenta);
        finish();
    }
}