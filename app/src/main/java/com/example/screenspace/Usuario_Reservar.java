package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Usuario_Reservar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_reservar);
    }

    public void Volver(View view){

        Intent intent = new Intent(this, Info_Pelicula.class);
        startActivity(intent);
        finish();
    }

    public void Reservar(View view){

        Intent intent = new Intent(this, Reserva_Exitosa.class);
        startActivity(intent);
        finish();
    }
}