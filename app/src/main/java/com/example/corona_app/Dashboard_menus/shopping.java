package com.example.corona_app.Dashboard_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.corona_app.R;

public class shopping extends AppCompatActivity {

    private WebView shopping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);


        shopping =(WebView) findViewById(R.id.shopping_web_id);
        shopping.getSettings().setJavaScriptEnabled(true);
        // Enable Javascript
        WebSettings webSettings = shopping.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        shopping.loadUrl("file:///android_asset/shopping_guide_index.html");
        // Force links and redirects to open in the WebView instead of in a browser
        shopping.setWebViewClient(new WebViewClient());
    }
}
