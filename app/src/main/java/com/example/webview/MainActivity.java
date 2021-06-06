package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
   EditText etserch;
   Button btngo;
   WebView WebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etserch = (EditText) findViewById(R.id.etserch);
        btngo = (Button) findViewById(R.id.btngo);
        WebView = (WebView) findViewById(R.id.WebView);
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btngo:

                        String url = etserch.getText().toString();
                        WebView.getSettings().setJavaScriptEnabled(true);
                        WebView.loadUrl(url);
                        break;

                }


            }

            class MyWebViewClint extends WebViewClient {
                @Override
                public boolean shouldOverrideUrlLoading(android.webkit.WebView view, String url) {
                    // return super.shouldOverrideUrlLoading(view, url);
                    WebView.loadUrl(url);
                    return true;
                }
            }


        });
    }}