package com.example.android.myalcapp;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    private WebView alc_web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Create new WebView
        alc_web = new WebView(this);
        //Enable JavaScript
        alc_web.getSettings().setJavaScriptEnabled(true);
        //Handle SSL Errors if any with WebView Client
        alc_web.setWebViewClient(new WebViewClient() {
            @Override public void onReceivedSslError( WebView v, SslErrorHandler handler, SslError er)
            { handler.proceed(); }});
        // Load the URL - Has to be a String but cannot use string resource since it is int value
        alc_web.loadUrl("https://andela.com/alc/");
        // Set the View to the ALC Web page
        setContentView(alc_web);
    }
}
