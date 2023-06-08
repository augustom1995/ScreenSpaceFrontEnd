package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Resena_Pelicula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resena_pelicula);
    }

    public void Volver(View view){

        Intent intent = new Intent(this, Info_Pelicula.class);
        startActivity(intent);
        finish();
    }

    public void Resenar(View view){

        Intent intent = new Intent(this, Resena_Enviada.class);
        startActivity(intent);
        finish();
    }

}