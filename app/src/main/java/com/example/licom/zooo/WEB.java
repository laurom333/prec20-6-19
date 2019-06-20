package com.example.licom.zooo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WEB extends AppCompatActivity {
String url="https://www.ecologiaverde.com/los-animales-en-mayor-peligro-de-extincion-375.html";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView web =(WebView)findViewById(R.id.WEB);
        web.setWebViewClient(new MyWebViewClient());
        WebSettings settings=web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl(url);

    }
    private class MyWebViewClient extends WebViewClient{
public boolean shouldOverrideUrlLoading(WebView view,String url){
    view.loadUrl(url);
    return true;
}

    }
    public void regresar(View view) {
        Intent regresar = new Intent(this, SegundoActivity.class);
        startActivity(regresar);}
}
