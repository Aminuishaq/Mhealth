package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;

public class health_tips extends AppCompatActivity {
    ViewFlipper v_flipper;

    int[] htips = {R.drawable.images__47_,
            R.drawable.images__47_,
            R.drawable.images__48_,
            R.drawable.images__49_,
            R.drawable.images__51_,
            R.drawable.images__50_,
            R.drawable.images__48_,
            R.drawable._76642,
            R.drawable.images__52_,
            R.drawable.n396155};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tips);

        v_flipper = findViewById(R.id.v_flipper);

        for(int i = 0; i < htips.length; i++){
            flip_image(htips[i]);
        }

        }
    public void flip_image(int i){
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);
        v_flipper.addView(view);
        v_flipper.setFlipInterval(3000);
        v_flipper.setAutoStart(true);


        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
    }


