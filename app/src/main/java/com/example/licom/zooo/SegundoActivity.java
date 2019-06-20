package com.example.licom.zooo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }

    public void regresar(View view) {
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }
    public void VERTE(View view) {
        Intent VERTE = new Intent(this, verte.class);
        startActivity(VERTE);}
    public void inverte(View view) {
        Intent inverte = new Intent(this, inverte.class);
        startActivity(inverte);}
    public void WEE(View view) {
        Intent WEE = new Intent(this, WEB.class);
        startActivity(WEE);}
}