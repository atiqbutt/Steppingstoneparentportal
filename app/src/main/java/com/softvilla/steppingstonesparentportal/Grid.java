package com.softvilla.steppingstonesparentportal;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

/**
 * Created by Malik on 17/08/2017.
 */

public class Grid extends ArrayAdapter {
    private Context context;
    //private final String[] web;
    private final Integer[] Imageid;

    public Grid(Activity context,Integer[] Imageid ) {
        super(context,R.layout.grid);
        this.context = context;
        this.Imageid = Imageid;
       //this.web = web;
    }


    @Override
    public int getCount() {
        return Imageid.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(context);
            grid = inflater.inflate(R.layout.grid, null);
            //TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView) grid.findViewById(R.id.grid_image);
            //textView.setText(web[position]);
            imageView.setImageResource(Imageid[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;

    }
}

