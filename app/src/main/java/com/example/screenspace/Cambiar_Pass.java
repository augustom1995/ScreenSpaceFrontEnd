package com.example.screenspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cambiar_Pass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambiar_pass);
    }
    public void CambiarPass(View view){

        Intent intent = new Intent(this, Exito_Cambiar_Pass.class);
        startActivity(intent);
        finish();
    }
}