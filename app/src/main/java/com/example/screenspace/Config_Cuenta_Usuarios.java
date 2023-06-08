package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Config_Cuenta_Usuarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_cuenta_usuarios);
    }

    public void Volver(View view){

        Intent intent = new Intent(this, Opciones_Usuarios.class);
        startActivity(intent);
        finish();
    }

    public void Actualizar(View view){

        Intent intent = new Intent(this, Exito_Modificar_Cuenta.class);
        startActivity(intent);
        finish();
    }

    public void Eliminar(View view){

        Intent intent = new Intent(this, Confirm_Eliminacion_Cuenta_Usuario.class);
        startActivity(intent);
        finish();
    }
}