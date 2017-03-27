package com.example.marin.homesecuritywork;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class register_server_manually extends AppCompatActivity {

    TextView sucessMessage;
    EditText addressMaunally, portManually;
    Button buttonConnect,buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_server_manually);
    }
}
