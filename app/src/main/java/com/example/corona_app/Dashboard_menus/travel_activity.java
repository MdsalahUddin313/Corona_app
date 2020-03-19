package com.example.corona_app.Dashboard_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.corona_app.R;

public class travel_activity extends AppCompatActivity {

    private WebView travel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_activity);

        travel =(WebView) findViewById(R.id.travel_web_id);
        travel.loadUrl("file:///android_asset/travelling_index.html");

        // Enable Javascript
        WebSettings webSettings = travel.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        travel.setWebViewClient(new WebViewClient());
    }
}
