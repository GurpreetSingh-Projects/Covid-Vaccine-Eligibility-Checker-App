    package com.example.vaccineeligibiltycheckerandcentrelocator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity4 extends AppCompatActivity {
TextView txt;
String text;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        b1=findViewById(R.id.button4);
        txt=findViewById(R.id.maindisp);
        Intent intent=getIntent();
        String name=intent.getStringExtra("temp");
        text=intent.getStringExtra("org");
        int temp=Integer.parseInt(name);
        b1.setVisibility(View.INVISIBLE);
        if(temp==2)
        {
            txt.setText("Congratulations !! \nYou are eligible for Getting \nVaccinated");
            Toast.makeText(getApplicationContext(),
                    "Congrats!! you eligible for being vaccinated again Covid-19 virus",
                    Toast.LENGTH_LONG).show();
            b1.setVisibility(View.VISIBLE);
            MediaPlayer music= MediaPlayer.create(this,R.raw.music);
            music.start();
        }
        else if(temp==0)
        {
            txt.setText("Sorry you are underaged for getting Vaccinated.");
        }
        else if(temp==1)
        {
            txt.setText("Right now, Vaccine for this age group is under Clinical Trial. Please be patient !!");
        }
        else if( temp==3)
        {
            txt.setText("Invalid Selection"+temp);
        }
        else
        {
        }
    }
    public void Onclick(View v)
    {
        Intent intent=new Intent(activity4.this,activity5.class);
        intent.putExtra("org",text);
        startActivity(intent);
    }
    public void restart(View view)
    {
        Intent intent=new Intent(activity4.this,activity2.class);
        startActivity(intent);
    }
}