package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Opciones_Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_admin);
    }
    public void EliminarCuenta(View view){

        Intent eliminar = new Intent(this, Confirm_Eliminacion_Cuenta.class);
        startActivity(eliminar);
        finish();
    }

    public void CerrarSesion(View view){

        Intent cerrarSesion = new Intent(this, MainActivity.class);
        startActivity(cerrarSesion);
        finish();
    }
    public void Volver(View view){

        Intent volver = new Intent(this, Inicio_Admin.class);
        startActivity(volver);
        finish();
    }
}