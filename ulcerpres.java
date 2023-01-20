package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ulcerpres extends AppCompatActivity {
    ImageButton imgbtnh, imgbtnrem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulcerpres);

        imgbtnh = (ImageButton)findViewById(R.id.bttips);
        imgbtnrem = (ImageButton)findViewById(R.id.btrem);

        imgbtnrem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ulcerpres.this, remainder.class);
                startActivity(i);
            }
        });

        imgbtnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ulcerpres.this, ulcer_prev.class);
                startActivity(intent);
            }
        });
    }
}
