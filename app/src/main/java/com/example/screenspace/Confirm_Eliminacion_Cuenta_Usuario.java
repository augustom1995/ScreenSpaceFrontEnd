package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Confirm_Eliminacion_Cuenta_Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_eliminacion_cuenta_usuario);
    }
    public void NoEliminar(View view){

        Intent intent = new Intent(this, Config_Cuenta_Usuarios.class);
        startActivity(intent);
        finish();
    }

    public void SiEliminar(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}