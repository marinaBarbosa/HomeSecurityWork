package com.example.marin.homesecuritywork;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import java.util.*;



public class third_info extends Activity implements OnClickListener{
    Button btn[] = new Button[2];
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_third_info);

        btn[0] = (Button) findViewById(R.id.skip);

        for(int i=0; i<1; i++){
            btn[i].setOnClickListener(this);
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


    @Override
    public void onClick(View v)
    {
        if(v == findViewById(R.id.skip)){
            Intent intent = new Intent(this, main_with_cameras.class);
            startActivity(intent);
            onStop();
        }
    }
}