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
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class first_info extends Activity implements OnClickListener{
    Button btn[] = new Button[2];
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
            // start register activity.
            setContentView(R.layout.activity_first_info);

            btn[0] = (Button) findViewById(R.id.next);
            btn[1] = (Button) findViewById(R.id.skip);

            for(int i=0; i<2; i++){
                btn[i].setOnClickListener(this);

        }

    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        boolean previouslyStarted = prefs.getBoolean(getString(R.string.app_name), false);
        if(!previouslyStarted) {
            SharedPreferences.Editor edit = prefs.edit();
            edit.putBoolean(getString(R.string.app_name), Boolean.TRUE);
            edit.commit();
          //  showHelp();
        }

    }
    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    public void onClick(View v)
    {
        if(v == findViewById(R.id.next)) {
            //setContentView(R.layout.activity_second_info);
            Intent intent = new Intent(this, second_info.class);
            startActivity(intent);
            onStop();
        }

        else if(v == findViewById(R.id.skip)){
            //setContentView(R.layout.activity_main);
            Intent intent = new Intent(this, main.class);
            startActivity(intent);
            onStop();
        }
    }

}

