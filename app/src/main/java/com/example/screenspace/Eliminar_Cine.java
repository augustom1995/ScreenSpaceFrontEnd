package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Eliminar_Cine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar_cine);
    }

    public void Aceptar(View view){

        Intent intent = new Intent(this, Inicio_Admin.class);
        startActivity(intent);
        finish();
    }

    public void Cancelar(View view){

        Intent intent = new Intent(this, Modificar_Cine.class);
        startActivity(intent);
        finish();
    }
}