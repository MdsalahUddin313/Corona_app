package com.example.corona_app.Dashboard_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.corona_app.R;

public class History_Of_Corona extends AppCompatActivity {

    private WebView history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history__of__corona);


        history =(WebView) findViewById(R.id.history_web_id);
        history.getSettings().setJavaScriptEnabled(true);
        // Enable Javascript
        WebSettings webSettings = history.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        history.loadUrl("file:///android_asset/history_of_corona_index.html");
        // Force links and redirects to open in the WebView instead of in a browser
        history.setWebViewClient(new WebViewClient());
    }
}
