package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Olvido_Pass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olvido_pass);
    }

    public void Recuperar(View view){

        Intent recuperar = new Intent(this, EnvioMail_Olvido_Pass.class);
        startActivity(recuperar);
        finish();
    }
}