package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Confirm_Eliminacion_Cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_eliminacion_cuenta);
    }

    public void NoEliminar(View view){

        Intent cerrarSesion = new Intent(this, Opciones_Admin.class);
        startActivity(cerrarSesion);
        finish();
    }

    public void SiEliminar(View view){

        Intent cerrarSesion = new Intent(this, MainActivity.class);
        startActivity(cerrarSesion);
        finish();
    }
}