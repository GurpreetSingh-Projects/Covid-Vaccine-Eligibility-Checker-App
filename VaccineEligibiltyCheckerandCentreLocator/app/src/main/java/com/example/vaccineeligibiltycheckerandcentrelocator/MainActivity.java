package com.example.vaccineeligibiltycheckerandcentrelocator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.imageButton);
        MediaPlayer music= MediaPlayer.create(MainActivity.this,R.raw.chariots_of_fire);
        music.start();
        music.setLooping(true);

    }
    public void onClick1(View v)
    {
        Intent i1=new Intent(MainActivity.this,activity2.class);
        startActivity(i1);
    }
}
