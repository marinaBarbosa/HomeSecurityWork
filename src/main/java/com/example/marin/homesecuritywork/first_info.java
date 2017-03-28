package com.example.marin.homesecuritywork;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.view.View.OnClickListener;
import java.util.*;
import android.view.*;

public class first_info extends Activity implements OnClickListener{
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
           setContentView(R.layout.activity_second_info);
            //Log.v("buttom", "next");
        }
        else if(v == findViewById(R.id.skip)){
            setContentView(R.layout.activity_main);
        }
    }
}

