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



    public class second_info extends Activity implements OnClickListener{
        Button btn[] = new Button[2];
        @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_second_info);

            btn[0] = (Button) findViewById(R.id.next2);
            btn[1] = (Button) findViewById(R.id.skip2);

            for(int i=0; i<2; i++){
                btn[i].setOnClickListener(this);
            }
        }
        @Override
        protected void onResume() {
            super.onResume();


        }
        //this.onStop();
        @Override
        protected void onStop() {
            super.onStop();
            // The activity is no longer visible (it is now "stopped")
        }


        @Override
        public void onClick(View v)
        {
            if(v == findViewById(R.id.next2)){
                //setContentView(R.layout.activity_third_info);
                //Log.v("buttom", "next");
                Intent intent = new Intent(this, third_info.class);
                startActivity(intent);
                onStop();
            }
            else if(v == findViewById(R.id.skip2)){
                //setContentView(R.layout.activity_main);
                Intent intent = new Intent(this, main.class);
                startActivity(intent);
                onStop();
            }
        }
    }