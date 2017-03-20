package com.example.marin.homesecuritywork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;



public class first_info extends AppCompatActivity implements OnClickListener{
    Button btn[] = new Button[2];
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_info);

        btn[0] = (Button) findViewById(R.id.next1);
        btn[1] = (Button) findViewById(R.id.skip1);
        for(int i=0; i<2; i++){
            btn[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v)
    {
        if(v == findViewById(R.id.next1)){
            //do here what u wanna do.
            setContentView(R.layout.activity_second_info);

        }
        else if(v == findViewById(R.id.skip1)){
            //do here what u wanna do.
        }
    }
}

