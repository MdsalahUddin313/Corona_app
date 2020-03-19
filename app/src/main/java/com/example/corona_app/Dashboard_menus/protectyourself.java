package com.example.corona_app.Dashboard_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.corona_app.R;

public class protectyourself extends AppCompatActivity {

    private WebView protect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protectyourself);

        protect =(WebView) findViewById(R.id.protect_yourself_web_id);
        protect.getSettings().setJavaScriptEnabled(true);
        // Enable Javascript
        WebSettings webSettings = protect .getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        protect.loadUrl("file:///android_asset/protect_index.html");


        // Force links and redirects to open in the WebView instead of in a browser
        protect.setWebViewClient(new WebViewClient());

    }
}
