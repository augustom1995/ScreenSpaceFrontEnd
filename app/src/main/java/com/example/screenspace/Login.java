package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void IniciarSesion(View view){

        Intent iniciarSesion = new Intent(this, Inicio_Admin.class);
        startActivity(iniciarSesion);
        finish();
    }

    public void Volver(View view){

        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
        finish();
    }

    public void OlvidoPass(View view){

        Intent intent = new Intent(this, Olvido_Pass.class);
        startActivity(intent);
        finish();
    }
}