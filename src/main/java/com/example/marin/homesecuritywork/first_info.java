package com.example.marin.homesecuritywork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import java.util.*;


public class first_info extends AppCompatActivity implements OnClickListener{
    Button btn[] = new Button[2];
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_info);

        btn[0] = (Button) findViewById(R.id.next);
        btn[1] = (Button) findViewById(R.id.skip);
        for(int i=0; i<2; i++){
            btn[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v)
    {
        if(v == findViewById(R.id.next)){
            //do here what u wanna do.
           // setContentView(R.layout.activity_second_info);
            Intent intent = new Intent(this,second_info.class);

            Log.v("buttom", "next");

        }
        else if(v == findViewById(R.id.skip)){
            //do here what u wanna do.
            setContentView(R.layout.activity_main);
          //  Intent intent = new Intent(this,main.class);
            Log.v("buttom2", "skip");

        }
    }
}

