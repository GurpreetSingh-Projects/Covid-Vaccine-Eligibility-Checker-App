package com.example.vaccineeligibiltycheckerandcentrelocator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity3 extends AppCompatActivity {
TextView disp;
Button b1,b2;
int temp=0;
String str,text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        disp= findViewById(R.id.disp1);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String age=intent.getStringExtra("age");
        String state=intent.getStringExtra("state");
        String city =intent.getStringExtra("city");
        if(age.equals("0-1 years")|| age.equals("2-5 years"))
        {
            temp=0;
        }
        else if(age.equals("6-17 years"))
        {
            temp=1;
        }
        else if(age.equals("18-44 years")|| age.equals("45+ years"))
        {
            temp =2;
        }
        else
        {
            temp=3;
        }
        str=Integer.toString(temp);
        disp.setText(name+"\n\n"+age+"\n\n"+state+"\n\n"+city);
        text="Vaccination Centres location in "+state+" ,"+city+" for "+age;
    }
public void previous(View view)
{
    finish();
}
public void next(View v)
{

    Intent intent=new Intent(activity3.this,activity4.class);
    intent.putExtra("temp",str);
    intent.putExtra("org",text);
    startActivity(intent);
}
}