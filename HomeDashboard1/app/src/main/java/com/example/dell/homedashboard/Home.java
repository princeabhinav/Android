package com.example.dell.homedashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void onButtonClick(View v)
    {
        if(v.getId()== R.id.Bdisplay1)
        {
            Intent i = new Intent(Home.this, Display.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.Bdisplay2)
        {
            Intent i= new Intent(Home.this, Display1.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.Bdisplay3)
        {
            Intent i= new Intent(Home.this, Display2.class);
            startActivity(i);

        }
        else if(v.getId() == R.id.Bdisplay3)
        {
            Intent i= new Intent(Home.this, Display2.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.Bdisplay4)
        {
            Intent i= new Intent(Home.this, Display3.class);
            startActivity(i);

        }
        else if(v.getId() == R.id.Bdisplay5)
        {
            Intent i= new Intent(Home.this, Display4.class);
            startActivity(i);

        }


    }
}
