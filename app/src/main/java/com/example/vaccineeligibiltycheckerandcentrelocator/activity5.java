package com.example.vaccineeligibiltycheckerandcentrelocator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activity5 extends AppCompatActivity {
String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        Intent intent=getIntent();
        text=intent.getStringExtra("org");
        WebView web=findViewById(R.id.webView);
        web.setWebViewClient(new MyWebViewClient(this));
        web.getSettings().setJavaScriptEnabled(true);
        String str="https://www.google.com/search?q="+text;
        web.loadUrl(str);
        MediaPlayer music= MediaPlayer.create(this,R.raw.music);
        music.start();
    }
}