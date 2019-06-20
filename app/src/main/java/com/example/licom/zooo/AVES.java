package com.example.licom.zooo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AVES extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aves);
    }
    public void regresar(View view) {
        Intent regresar = new Intent(this, verte.class);
        startActivity(regresar);}
}
