package com.example.marin.homesecuritywork;
import android.app.Activity;
import android.os.Bundle;
import android.graphics.*;
import java.util.*;
import java.net.*;
import android.widget.*;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class main_with_cameras extends Activity {


    private GridView imageGrid;
    private ArrayList<Bitmap> bitmapList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_with_cameras);

        this.imageGrid = (GridView) findViewById(R.id.gridview);
        this.bitmapList = new ArrayList<Bitmap>();

        try {
            for(int i = 0; i < 10; i++) {
                this.bitmapList.add(urlImageToBitmap("http://placehold.it/150x150"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.imageGrid.setAdapter(new ImageAdapter(this, this.bitmapList));

    }

    private Bitmap urlImageToBitmap(String imageUrl) throws Exception {
        Bitmap result = null;
        URL url = new URL(imageUrl);
        if(url != null) {
            result = BitmapFactory.decodeStream(url.openConnection().getInputStream());
        }
        return result;
    }

    }

