package com.example.licom.zooo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class inverte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverte);
    }
    public void regresar(View view) {
        Intent regresar = new Intent(this, SegundoActivity.class);
        startActivity(regresar);}
    public void regresar1(View view) {
        Intent regresar1 = new Intent(this, PORIFEROS.class);
        startActivity(regresar1);}
    public void regresar2(View view) {
        Intent regresar2 = new Intent(this, CELENTERADOS.class);
        startActivity(regresar2);}
    public void regresar3(View view) {
        Intent regresar3 = new Intent(this, GUSANOS.class);
        startActivity(regresar3);}
    public void regresar4(View view) {
        Intent regresar4 = new Intent(this, MOLUSCOS.class);
        startActivity(regresar4);}
    public void regresar5(View view) {
        Intent regresar5 = new Intent(this, ARTOPRODOS.class);
        startActivity(regresar5);}
    public void regresar6(View view) {
        Intent regresar6 = new Intent(this, EQUINODERMO.class);
        startActivity(regresar6);}
}
