package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;
    AutoCompleteTextView e1,e2;
    Button b1;
    TextView b2;
    String[] sug = {"sms@gmail.com","shamsu@gmail.com","ab@gmail.com","muhd@gmail.com","abdul@gmail.com"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DatabaseHelper(this);
        e1 = (AutoCompleteTextView)findViewById(R.id.u_email);
        e2 = (AutoCompleteTextView)findViewById(R.id.u_password);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sug);
        b1 = (Button)findViewById(R.id.login);
        e1.setAdapter(adapter);;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = e1.getText().toString();
                String password = e2.getText().toString();
                Boolean chemailpass =  db.emailpassword(email,password);
                //where intent will replace
                if(chemailpass==true) {
                    //Toast.makeText(getApplicationContext(),"Soccessfully login", Toast.LENGTH_SHORT).show();
                    Intent a = new Intent(MainActivity.this, DashBoard.class);
                    startActivity(a);}
                else
                    Toast.makeText(getApplicationContext(), "wrong email or password", Toast.LENGTH_SHORT).show();

                 }
        });

        b2 = (TextView) findViewById(R.id.toreg);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,registration.class);
                startActivity(i);
            }
        });
    }
}
