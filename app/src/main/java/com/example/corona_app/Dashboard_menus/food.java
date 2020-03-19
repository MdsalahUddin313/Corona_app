package com.example.corona_app.Dashboard_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.corona_app.R;

public class food extends AppCompatActivity {

    private WebView food_web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        food_web =(WebView) findViewById(R.id.food_web_id);
        food_web.getSettings().setJavaScriptEnabled(true);
        // Enable Javascript
        WebSettings webSettings =food_web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        food_web.loadUrl("file:///android_asset/food_safety_index.html");


        // Force links and redirects to open in the WebView instead of in a browser
        food_web.setWebViewClient(new WebViewClient());
    }
}
