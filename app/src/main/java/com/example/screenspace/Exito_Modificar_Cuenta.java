package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Exito_Modificar_Cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exito_modificar_cuenta);
    }

    public void Inicio(View view){

        Intent intent = new Intent(this, Inicio_Usuarios.class);
        startActivity(intent);
        finish();
    }
}