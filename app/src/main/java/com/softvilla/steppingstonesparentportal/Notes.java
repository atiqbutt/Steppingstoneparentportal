package com.softvilla.steppingstonesparentportal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class Notes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);


        LayoutInflater inflator = (LayoutInflater) this .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflator.inflate(R.layout.customlayout, null);
        v.findViewById(R.id.imageView4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefrences = PreferenceManager.getDefaultSharedPreferences(Notes.this);
                SharedPreferences.Editor editor = prefrences.edit();
                editor.putString("isLogin","0");
                editor.apply();
                finish();
                startActivity(new Intent(Notes.this,MainActivity.class));
            }
        });
        v.findViewById(R.id.backBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Notes.this,MainMenu.class));
            }
        });

        TextView label = (TextView) v.findViewById(R.id.Label);
        label.setText("Notes");

        actionBar.setCustomView(v);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
