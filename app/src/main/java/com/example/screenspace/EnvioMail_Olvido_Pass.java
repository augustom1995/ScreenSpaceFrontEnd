package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EnvioMail_Olvido_Pass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envio_mail_olvido_pass);
    }

    public void Inicio(View view){

        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
        finish();
    }
}