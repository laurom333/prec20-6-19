package com.example.licom.zooo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ARTOPRODOS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artoprodos);
    }
    public void regresar(View view) {
        Intent regresar = new Intent(this, inverte.class);
        startActivity(regresar);}
}
