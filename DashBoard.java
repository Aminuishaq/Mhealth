package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class DashBoard extends AppCompatActivity {
    GridLayout main_grid;
    Button b11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        main_grid = (GridLayout)findViewById(R.id.main_grid);
        //set event
        b11 = (Button)findViewById(R.id.diag);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ab = new Intent(DashBoard.this, asa.class);
                startActivity(ab);
            }
        });

        setSingleEvent(main_grid);
    }

    private void setSingleEvent(GridLayout main_grid) {
        //loop all child item of grid
        for(int i = 0; i<main_grid.getChildCount(); i++)
        {
            //you can see all child items is cardview
            CardView cardView = (CardView)main_grid.getChildAt(i);
            final int finalI = i;
            if(finalI==0){
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       // Toast.makeText(DashBoard.this,"item clicked",Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(DashBoard.this,malaria.class);
                        startActivity(a);
                    }
                });

            }else if(finalI==1){
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                      //  Toast.makeText(DashBoard.this,"item 2 is clicked",Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(DashBoard.this,typhoid.class);
                        startActivity(a);
                    }
                });
            }else if(finalI==2){
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                      //  Toast.makeText(DashBoard.this,"item 3 is clicked",Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(DashBoard.this,ulcer.class);
                        startActivity(a);
                    }
                });
            }else if(finalI==3){
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       // Toast.makeText(DashBoard.this,"item 4 is clicked",Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(DashBoard.this,bcancer.class);
                        startActivity(a);
                    }
                });
            }else if(finalI==4){
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       // Toast.makeText(DashBoard.this,"item 5 is clicked",Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(DashBoard.this,diabetes.class);
                        startActivity(a);
                    }
                });
            }else if(finalI==5){
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       // Toast.makeText(DashBoard.this,"item 6 is clicked",Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(DashBoard.this,hypertension.class);
                        startActivity(a);
                    }
                });
            }else if(finalI==6){
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                      //  Toast.makeText(DashBoard.this,"item 7 is clicked",Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(DashBoard.this,ulcer.class);
                        startActivity(a);
                    }
                });
            }else {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       // Toast.makeText(DashBoard.this,"item 8 is clicked",Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(DashBoard.this,cholera.class);
                        startActivity(a);
                    }
                });
            }
        }
    }
}
