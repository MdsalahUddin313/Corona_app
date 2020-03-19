package com.example.corona_app.Dashboard_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.corona_app.R;

public class tools extends AppCompatActivity {


    private WebView tools_web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

                tools_web =(WebView) findViewById(R.id.tools_web_id);
        tools_web.getSettings().setJavaScriptEnabled(true);
        // Enable Javascript
        WebSettings webSettings = tools_web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        tools_web.loadUrl("file:///android_asset/tools.html");


        // Force links and redirects to open in the WebView instead of in a browser
        tools_web.setWebViewClient(new WebViewClient());
    }
}
