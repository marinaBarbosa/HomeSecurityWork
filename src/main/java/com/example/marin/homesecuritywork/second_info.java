package com.example.marin.homesecuritywork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import java.util.*;


public class second_info extends AppCompatActivity implements OnClickListener{
    Button btn[] = new Button[2];
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_info);
        Log.v("buttom3", "cenasfgdfgf");

        btn[0] = (Button) findViewById(R.id.next2);
        btn[1] = (Button) findViewById(R.id.skipsecound);
        for(int i=0; i<2; i++){
            btn[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v)
    {
        if(v == findViewById(R.id.next2)){
            //do here what u wanna do.
            Log.v("buttom3", "cenas");
            setContentView(R.layout.activity_main);
            Log.v("buttom3", "next456977");

        }
        else if(v == findViewById(R.id.skipsecound)){
            Log.v("buttom4", "skipsecound");
            //do here what u wanna do.
            setContentView(R.layout.activity_main);
            Log.v("buttom4", "skipsecound");

        }
    }
}
