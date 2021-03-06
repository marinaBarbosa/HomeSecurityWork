package com.example.marin.homesecuritywork;

/**
 * Created by marin on 25/04/2017.
 */
import android.os.*;
import android.widget.*;
import java.util.*;
import android.graphics.*;
import android.view.*;
import android.content.*;
import android.app.*;



public class ImageAdapter extends BaseAdapter {

        private Context context;
        private ArrayList<Bitmap> bitmapList;

        public ImageAdapter(Context context, ArrayList<Bitmap> bitmapList) {
            this.context = context;
            this.bitmapList = bitmapList;
        }

        public int getCount() {
            return this.bitmapList.size();
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {
                imageView = new ImageView(this.context);
                imageView.setLayoutParams(new GridView.LayoutParams(115, 115));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                imageView = (ImageView) convertView;
            }

            imageView.setImageBitmap(this.bitmapList.get(position));
            return imageView;
        }

    }