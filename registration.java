package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class registration extends AppCompatActivity {
    DatabaseHelper db = new DatabaseHelper(this);
    AutoCompleteTextView e1,e2,e3,e4,e5,e6;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        db = new DatabaseHelper(this);
        e1 = (AutoCompleteTextView)findViewById(R.id.user_email);
        e2 = (AutoCompleteTextView)findViewById(R.id.user_password);
        e3 = (AutoCompleteTextView)findViewById(R.id.c_user_password);
        e4 = (AutoCompleteTextView)findViewById(R.id.user_name);
        e5 = (AutoCompleteTextView)findViewById(R.id.user_fullname);
        e6 = (AutoCompleteTextView)findViewById(R.id.user_phone);
        b1 = (Button)findViewById(R.id.reg);
        b2 = (Button)findViewById(R.id.clear);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();
                String s6 = e6.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals("")||s6.equals("")){
                    Toast.makeText(getApplicationContext(),"The fields are empty", Toast.LENGTH_SHORT).show();
                }
                //password comfirmation
                else{
                    if(s2.equals(s3)){
                        Boolean chkemail = db.chkemail(s1);
                        if(chkemail==true){
                            Boolean insert = db.insert(s1,s2,s3,s4,s5);
                            if (insert==true){
                                Toast.makeText(getApplicationContext(),"registered successefully", Toast.LENGTH_SHORT).show();
                                e1.setText("");
                                e2.setText("");
                                e3.setText("");
                                e4.setText("");
                                e5.setText("");
                                e6.setText("");
                            }
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"email already exists",Toast.LENGTH_SHORT).show();
                        }

                    }
                        // Toast.makeText(getApplicationContext(),"password do not match", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                e3.setText("");
                e4.setText("");
                e5.setText("");
                e6.setText("");
            }
        });
    }


}
