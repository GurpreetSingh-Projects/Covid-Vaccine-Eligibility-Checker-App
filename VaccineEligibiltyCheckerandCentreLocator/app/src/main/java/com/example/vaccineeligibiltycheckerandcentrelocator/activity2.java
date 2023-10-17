package com.example.vaccineeligibiltycheckerandcentrelocator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import org.w3c.dom.Text;

public class activity2 extends AppCompatActivity {
    EditText name,state,city;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        name=(EditText)findViewById(R.id.name);
        state=(EditText)findViewById(R.id.state);
        city=(EditText)findViewById(R.id.city);
        spinner=(Spinner)findViewById(R.id.agespinner);

    }
    public void OnClick(View v)
    {
            String age= spinner.getSelectedItem().toString();
            String name1= name.getText().toString();
            String statename= state.getText().toString();
            String cityname= city.getText().toString();
            Intent intent=new Intent(getApplicationContext(),activity3.class);
            intent.putExtra("age",age);
            intent.putExtra("name",name1);
            intent.putExtra("state",statename);
            intent.putExtra("city",cityname);
            startActivity(intent);

    }
}