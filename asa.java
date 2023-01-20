package com.example.testproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class asa extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    AutoCompleteTextView auto1, auto2,auto3,auto4;
    Button btn1,btn2;
    String[] symptoms = {"Fever","Headache","Chills","Weakness","Loss of Appetite",  "Abdominal pain",
    "Loss of Weight",  "Frequent urination","Increased Thirst","Slow healing of wound","Blurry Vision",  "Shortness of breath",
    "Chest pain","Trouble sleeping","Coughing",  "Diarrhea","Nausea","Vomiting","Dehydration",  "Severe headache","Vision problem","Irriguler heartbeat",
    "Blood in the urine",  "Nipple discharge","Dimpling","Breast pain","Swelling"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asa);
        auto1 = (AutoCompleteTextView)findViewById(R.id.syp1);
        auto2 = (AutoCompleteTextView)findViewById(R.id.syp2);
        auto3 = (AutoCompleteTextView)findViewById(R.id.syp3);
        auto4 = (AutoCompleteTextView)findViewById(R.id.syp4);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,symptoms);
        auto1.setAdapter(adapter);
        auto2.setAdapter(adapter);
        auto3.setAdapter(adapter);
        auto4.setAdapter(adapter);

        btn1 = (Button)findViewById(R.id.chk);
        btn2 = (Button)findViewById(R.id.clr);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auto1.setText("");
                auto2.setText("");
                auto3.setText("");
                auto4.setText("");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String symptom1 = auto1.getText().toString();
                String symptom2 = auto2.getText().toString();
                String symptom3 = auto3.getText().toString();
                String symptom4 = auto4.getText().toString();

                if(symptom1.equals("") || symptom2.equals("") || symptom3.equals("") || symptom4.equals("")){
                    Toast.makeText(getApplicationContext(), "Field will not be Empty",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Fever") && symptom2.equalsIgnoreCase("Headache") && symptom3.equalsIgnoreCase("Chills") && symptom4.equalsIgnoreCase("Vomiting")){
                   // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                }
                else if(symptom1.equalsIgnoreCase("Fever") && symptom2.equalsIgnoreCase("Chills") && symptom3.equalsIgnoreCase("Headache") && symptom4.equalsIgnoreCase("Vomiting")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                    // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Fever") && symptom2.equalsIgnoreCase("Chills") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Headache")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Fever") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Chills") && symptom4.equalsIgnoreCase("Headache")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Headache") && symptom2.equalsIgnoreCase("Fever") && symptom3.equalsIgnoreCase("Chills") && symptom4.equalsIgnoreCase("Vomiting")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                    // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Headache") && symptom2.equalsIgnoreCase("Chills") && symptom3.equalsIgnoreCase("Fever") && symptom4.equalsIgnoreCase("Vomiting")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Headache") && symptom2.equalsIgnoreCase("Chills") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Fever")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);

                    // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Fever") && symptom2.equalsIgnoreCase("Headache") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Chills")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);

                    // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Headache") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Chills") && symptom4.equalsIgnoreCase("Fever")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Chills") && symptom2.equalsIgnoreCase("Fever") && symptom3.equalsIgnoreCase("Headache") && symptom4.equalsIgnoreCase("Vomiting")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Chills") && symptom2.equalsIgnoreCase("Headache") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Fever")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Chills") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Fever") && symptom4.equalsIgnoreCase("Headache")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Chills") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Headache") && symptom4.equalsIgnoreCase("Fever")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Headache") && symptom3.equalsIgnoreCase("Chills") && symptom4.equalsIgnoreCase("Fever")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Chills") && symptom3.equalsIgnoreCase("Headache") && symptom4.equalsIgnoreCase("Fever")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Chills") && symptom3.equalsIgnoreCase("Fever") && symptom4.equalsIgnoreCase("Headache")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Fever") && symptom3.equalsIgnoreCase("Chills") && symptom4.equalsIgnoreCase("Headache")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                    // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Headache") && symptom2.equalsIgnoreCase("Fever") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Chills")){
                    Intent a = new Intent(asa.this, malariapres.class);
                    startActivity(a);
                    // Toast.makeText(getApplicationContext(), "malaria",Toast.LENGTH_SHORT).show();
                }

                //typhoid
                else if(symptom1.equalsIgnoreCase("Headache") && symptom2.equalsIgnoreCase("Coughing") && symptom3.equalsIgnoreCase("Fever") && symptom4.equalsIgnoreCase("Vomiting")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Coughing") && symptom2.equalsIgnoreCase("Fever") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Headache")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Fever") && symptom3.equalsIgnoreCase("Headache") && symptom4.equalsIgnoreCase("Coughing")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Headache") && symptom2.equalsIgnoreCase("Fever") && symptom3.equalsIgnoreCase("Coughing") && symptom4.equalsIgnoreCase("Vomiting")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Fever") && symptom2.equalsIgnoreCase("Headache") && symptom3.equalsIgnoreCase("Coughing") && symptom4.equalsIgnoreCase("Vomiting")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Fever") && symptom2.equalsIgnoreCase("Headache") && symptom3.equalsIgnoreCase("loss of Appetite") && symptom4.equalsIgnoreCase("Weakness")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Fever") && symptom2.equalsIgnoreCase("Loss of Appetite") && symptom3.equalsIgnoreCase("Headache") && symptom4.equalsIgnoreCase("weakness")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Fever") && symptom2.equalsIgnoreCase("Weakness") && symptom3.equalsIgnoreCase("Headache") && symptom4.equalsIgnoreCase("Loss of Appetite")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Weakness") && symptom2.equalsIgnoreCase("Headache") && symptom3.equalsIgnoreCase("Fever") && symptom4.equalsIgnoreCase("Loss of Appetite")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Weakness") && symptom2.equalsIgnoreCase("Headache") && symptom3.equalsIgnoreCase("Loss of Appetite") && symptom4.equalsIgnoreCase("Fever")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Weakness") && symptom2.equalsIgnoreCase("Fever") && symptom3.equalsIgnoreCase("Headache") && symptom4.equalsIgnoreCase("Loss of Appetite")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Weakness") && symptom2.equalsIgnoreCase("Fever") && symptom3.equalsIgnoreCase("Loss of Appetite") && symptom4.equalsIgnoreCase("Headache")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Appetite") && symptom2.equalsIgnoreCase("Fever") && symptom3.equalsIgnoreCase("Headache") && symptom4.equalsIgnoreCase("Weakness")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                    //  Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Appetite") && symptom2.equalsIgnoreCase("Fever") && symptom3.equalsIgnoreCase("Weakness") && symptom4.equalsIgnoreCase("Headache")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Appetite") && symptom2.equalsIgnoreCase("Headache") && symptom3.equalsIgnoreCase("Fever") && symptom4.equalsIgnoreCase("Weakness")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Appetite") && symptom2.equalsIgnoreCase("Headache") && symptom3.equalsIgnoreCase("Weakness") && symptom4.equalsIgnoreCase("Fever")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Appetite") && symptom2.equalsIgnoreCase("Weakness") && symptom3.equalsIgnoreCase("Headache") && symptom4.equalsIgnoreCase("Fever")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Fever") && symptom2.equalsIgnoreCase("Lost of Appetite") && symptom3.equalsIgnoreCase("Weakness") && symptom4.equalsIgnoreCase("Headache")){
                    Intent a = new Intent(asa.this, typhoidpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "typhoid",Toast.LENGTH_SHORT).show();
                }

                //ulcer
                else if(symptom1.equalsIgnoreCase("Abdominal pain") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Loss of Appetite") && symptom4.equalsIgnoreCase("Loss of Weight")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Abdominal pain") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Loss of Weight") && symptom4.equalsIgnoreCase("Loss of Appetite")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Abdominal pain") && symptom2.equalsIgnoreCase("Loss of Appetite") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Loss of Weight")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Abdominal pain") && symptom2.equalsIgnoreCase("Loss of Weight") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Loss of Appetite")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Abdominal pain") && symptom3.equalsIgnoreCase("Loss of Weight") && symptom4.equalsIgnoreCase("Loss of Appetite")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Abdominal pain") && symptom3.equalsIgnoreCase("Loss of Appetite") && symptom4.equalsIgnoreCase("Loss of Weight")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Loss of Weight") && symptom3.equalsIgnoreCase("Abdominal pain") && symptom4.equalsIgnoreCase("Loss of Appetite")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Loss of Appetite") && symptom3.equalsIgnoreCase("Abdominal pain") && symptom4.equalsIgnoreCase("Loss of Weight")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Appetite") && symptom2.equalsIgnoreCase("Abdominal pain") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Loss of Weight")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Appetite") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Abdominal pain") && symptom4.equalsIgnoreCase("Loss of Weight")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Appetite") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Loss of Weight") && symptom4.equalsIgnoreCase("Abdominal pain")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Appetite") && symptom2.equalsIgnoreCase("Abdominal pain") && symptom3.equalsIgnoreCase("Loss of Weight") && symptom4.equalsIgnoreCase("Vomiting")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Weight") && symptom2.equalsIgnoreCase("Abdominal pain") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Loss of Appetite")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Weight") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Abdominal pain") && symptom4.equalsIgnoreCase("Loss of Appetite")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Weight") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Loss of Appetite") && symptom4.equalsIgnoreCase("Abdominal pain")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Loss of Weight") && symptom2.equalsIgnoreCase("Abdominal pain") && symptom3.equalsIgnoreCase("Loss of Appetite") && symptom4.equalsIgnoreCase("Vomiting")){
                    Intent a = new Intent(asa.this, ulcerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "ulcer",Toast.LENGTH_SHORT).show();
                }

                //diabetes
                else if(symptom1.equalsIgnoreCase("Frequent urination") && symptom2.equalsIgnoreCase("Increased Thirst") && symptom3.equalsIgnoreCase("Slow healing of wound") && symptom4.equalsIgnoreCase("Blurry Vision")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Frequent urination") && symptom2.equalsIgnoreCase("Increased Thirst") && symptom3.equalsIgnoreCase("Blurry Vision") && symptom4.equalsIgnoreCase("Slow healing of wound")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Frequent urination") && symptom2.equalsIgnoreCase("Blurry Vision") && symptom3.equalsIgnoreCase("Increased Thirst") && symptom4.equalsIgnoreCase("Slow healing of wound")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Frequent urination") && symptom2.equalsIgnoreCase("Blurry Vision") && symptom3.equalsIgnoreCase("Slow healing of wound") && symptom4.equalsIgnoreCase("Increased Thirst")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Increased Thirst") && symptom2.equalsIgnoreCase("Frequent urination") && symptom3.equalsIgnoreCase("Slow healing of wound") && symptom4.equalsIgnoreCase("Blurry Vision")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                    // Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Increased Thirst") && symptom2.equalsIgnoreCase("Frequent urination") && symptom3.equalsIgnoreCase("Blurry Vision") && symptom4.equalsIgnoreCase("Slow healing of wound")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Increased Thirst") && symptom2.equalsIgnoreCase("Blurry Vision") && symptom3.equalsIgnoreCase("Frequent urination") && symptom4.equalsIgnoreCase("Slow healing of wound")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Increased Thirst") && symptom2.equalsIgnoreCase("Slow healing of wound") && symptom3.equalsIgnoreCase("Frequent urination") && symptom4.equalsIgnoreCase("Blurry Vision")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Slow healing of wound") && symptom2.equalsIgnoreCase("Frequent urination") && symptom3.equalsIgnoreCase("Blurry Vision") && symptom4.equalsIgnoreCase("Increased Thirst")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Slow healing of wound") && symptom2.equalsIgnoreCase("Frequent urination") && symptom3.equalsIgnoreCase("Increased Thirst") && symptom4.equalsIgnoreCase("Blurry Vision")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Slow healing of wound") && symptom2.equalsIgnoreCase("Blurry Vision") && symptom3.equalsIgnoreCase("Increased Thirst") && symptom4.equalsIgnoreCase("Frequent urination")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Slow healing of wound") && symptom2.equalsIgnoreCase("Increased Thirst") && symptom3.equalsIgnoreCase("Blurry Vision") && symptom4.equalsIgnoreCase("Frequent urination")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Blurry Vision") && symptom2.equalsIgnoreCase("Increased Thirst") && symptom3.equalsIgnoreCase("Slow healing of wound") && symptom4.equalsIgnoreCase("Frequent urination")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Blurry Vision") && symptom2.equalsIgnoreCase("Increased Thirst") && symptom3.equalsIgnoreCase("Frequent urination") && symptom4.equalsIgnoreCase("Slow healing of wound")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Blurry Vision") && symptom2.equalsIgnoreCase("Slow healing of wound") && symptom3.equalsIgnoreCase("Frequent urination") && symptom4.equalsIgnoreCase("Increased Thirst")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Blurry Vision") && symptom2.equalsIgnoreCase("Slow healing of wound") && symptom3.equalsIgnoreCase("Increased Thirst") && symptom4.equalsIgnoreCase("Frequent urination")){
                    Intent a = new Intent(asa.this, diabetespres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }


                //asthma
                else if(symptom1.equalsIgnoreCase("Coughing") && symptom2.equalsIgnoreCase("Shortness of breath") && symptom3.equalsIgnoreCase("Chest pain") && symptom4.equalsIgnoreCase("Trouble sleeping")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Coughing") && symptom2.equalsIgnoreCase("Shortness of breath") && symptom3.equalsIgnoreCase("Trouble sleeping") && symptom4.equalsIgnoreCase("Chest pain")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    // Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Coughing") && symptom2.equalsIgnoreCase("Chest pain") && symptom3.equalsIgnoreCase("Shortness of breath") && symptom4.equalsIgnoreCase("Trouble sleeping")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Coughing") && symptom2.equalsIgnoreCase("Chest pain") && symptom3.equalsIgnoreCase("Trouble sleeping") && symptom4.equalsIgnoreCase("Shortness of breath")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Shortness of breath") && symptom2.equalsIgnoreCase("Coughing") && symptom3.equalsIgnoreCase("Trouble sleeping") && symptom4.equalsIgnoreCase("Chest pain")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Shortness of breath") && symptom2.equalsIgnoreCase("Chest pain") && symptom3.equalsIgnoreCase("Coughing") && symptom4.equalsIgnoreCase("Trouble sleeping")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Shortness of breath") && symptom2.equalsIgnoreCase("Coughing") && symptom3.equalsIgnoreCase("Chest pain") && symptom4.equalsIgnoreCase("Trouble sleeping")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Shortness of breath") && symptom2.equalsIgnoreCase("Trouble sleeping") && symptom3.equalsIgnoreCase("Coughing") && symptom4.equalsIgnoreCase("Chest pain")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Chest pain") && symptom2.equalsIgnoreCase("Shortness of breath") && symptom3.equalsIgnoreCase("Coughing") && symptom4.equalsIgnoreCase("Trouble sleeping")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }

                //asthma
                else if(symptom1.equalsIgnoreCase("Chest pain") && symptom2.equalsIgnoreCase("Shortness of breath") && symptom3.equalsIgnoreCase("Trouble sleeping") && symptom4.equalsIgnoreCase("Coughing")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Chest pain") && symptom2.equalsIgnoreCase("Trouble sleeping") && symptom3.equalsIgnoreCase("Shortness of breath") && symptom4.equalsIgnoreCase("Coughing")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Chest pain") && symptom2.equalsIgnoreCase("Coughing") && symptom3.equalsIgnoreCase("Trouble sleeping") && symptom4.equalsIgnoreCase("Shortness of breath")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Trouble sleeping") && symptom2.equalsIgnoreCase("Shortness of breath") && symptom3.equalsIgnoreCase("Chest pain") && symptom4.equalsIgnoreCase("Coughing")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Trouble sleeping") && symptom2.equalsIgnoreCase("Shortness of breath") && symptom3.equalsIgnoreCase("Coughing") && symptom4.equalsIgnoreCase("Chest pain")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Trouble sleeping") && symptom2.equalsIgnoreCase("Chest pain") && symptom3.equalsIgnoreCase("Shortness of breath") && symptom4.equalsIgnoreCase("Coughing")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Trouble sleeping") && symptom2.equalsIgnoreCase("Chest pain") && symptom3.equalsIgnoreCase("Coughing") && symptom4.equalsIgnoreCase("Shortness of breath")){
                    Intent a = new Intent(asa.this, asthmapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "diabetes",Toast.LENGTH_SHORT).show();
                }

                //cholera
                else if(symptom1.equalsIgnoreCase("Diarrhea") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Nausea") && symptom4.equalsIgnoreCase("Dehydration")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Diarrhea") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Dehydration") && symptom4.equalsIgnoreCase("Nausea")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Diarrhea") && symptom2.equalsIgnoreCase("Dehydration") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Nausea")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Diarrhea") && symptom2.equalsIgnoreCase("Nausea") && symptom3.equalsIgnoreCase("Dehydration") && symptom4.equalsIgnoreCase("Vomiting")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Diarrhea") && symptom3.equalsIgnoreCase("Nausea") && symptom4.equalsIgnoreCase("Dehydration")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                    // Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Diarrhea") && symptom3.equalsIgnoreCase("Dehydration") && symptom4.equalsIgnoreCase("Nausea")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Dehydration") && symptom3.equalsIgnoreCase("Diarrhea") && symptom4.equalsIgnoreCase("Nausea")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vomiting") && symptom2.equalsIgnoreCase("Nausea") && symptom3.equalsIgnoreCase("Dehydration") && symptom4.equalsIgnoreCase("Diarrhea")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Nausea") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Dehydration") && symptom4.equalsIgnoreCase("Diarrhea")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Nausea") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Diarrhea") && symptom4.equalsIgnoreCase("Dehydration")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Nausea") && symptom2.equalsIgnoreCase("Diarrhea") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Dehydration")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Nausea") && symptom2.equalsIgnoreCase("Dehydration") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Diarrhea")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Dehydration") && symptom2.equalsIgnoreCase("Vomiting") && symptom3.equalsIgnoreCase("Diarrhea") && symptom4.equalsIgnoreCase("Nausea")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Dehydration") && symptom2.equalsIgnoreCase("Diarrhea") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Nausea")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Dehydration") && symptom2.equalsIgnoreCase("Nausea") && symptom3.equalsIgnoreCase("Vomiting") && symptom4.equalsIgnoreCase("Diarrhea")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Dehydration") && symptom2.equalsIgnoreCase("Diarrhea") && symptom3.equalsIgnoreCase("Nausea") && symptom4.equalsIgnoreCase("Vomiting")){
                    Intent a = new Intent(asa.this, cholerapres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "cholera",Toast.LENGTH_SHORT).show();
                }


                //hypertention
                else if(symptom1.equalsIgnoreCase("Severe headache") && symptom2.equalsIgnoreCase("Irriguler heartbeat") && symptom3.equalsIgnoreCase("Blood in the urine") && symptom4.equalsIgnoreCase("Vision problem")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Severe headache") && symptom2.equalsIgnoreCase("Irriguler heartbeat") && symptom3.equalsIgnoreCase("Vision problem") && symptom4.equalsIgnoreCase("Blood in the urine")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Severe headache") && symptom2.equalsIgnoreCase("Vision problem") && symptom3.equalsIgnoreCase("Irriguler heartbeat") && symptom4.equalsIgnoreCase("Blood in the urine")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Severe headache") && symptom2.equalsIgnoreCase("Blood in the urine") && symptom3.equalsIgnoreCase("Irriguler heartbeat") && symptom4.equalsIgnoreCase("Vision problem")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Irriguler heartbeat") && symptom2.equalsIgnoreCase("Severe headache") && symptom3.equalsIgnoreCase("Blood in the urine") && symptom4.equalsIgnoreCase("Vision problem")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Irriguler heartbeat") && symptom2.equalsIgnoreCase("Severe headache") && symptom3.equalsIgnoreCase("Vision problem") && symptom4.equalsIgnoreCase("Blood in the urine")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Irriguler heartbeat") && symptom2.equalsIgnoreCase("Blood in the urine") && symptom3.equalsIgnoreCase("Vision problem") && symptom4.equalsIgnoreCase("Severe headache")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Irriguler heartbeat") && symptom2.equalsIgnoreCase("Vision problem") && symptom3.equalsIgnoreCase("Blood in the urine") && symptom4.equalsIgnoreCase("Severe headache")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Blood in the urine") && symptom2.equalsIgnoreCase("Severe headache") && symptom3.equalsIgnoreCase("Vision problem") && symptom4.equalsIgnoreCase("Irriguler heartbeat")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Blood in the urine") && symptom2.equalsIgnoreCase("Severe headache") && symptom3.equalsIgnoreCase("Irriguler heartbeat") && symptom4.equalsIgnoreCase("Vision problem")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Blood in the urine") && symptom2.equalsIgnoreCase("Irriguler heartbeat") && symptom3.equalsIgnoreCase("Vision problem") && symptom4.equalsIgnoreCase("Severe headache")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Blood in the urine") && symptom2.equalsIgnoreCase("Irriguler heartbeat") && symptom3.equalsIgnoreCase("Severe headache") && symptom4.equalsIgnoreCase("Vision problem")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vision problem") && symptom2.equalsIgnoreCase("Severe headache") && symptom3.equalsIgnoreCase("Blood in the urine") && symptom4.equalsIgnoreCase("Irriguler heartbeat")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vision problem") && symptom2.equalsIgnoreCase("Severe headache") && symptom3.equalsIgnoreCase("Irriguler heartbeat") && symptom4.equalsIgnoreCase("Blood in the urine")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vision problem") && symptom2.equalsIgnoreCase("Irriguler heartbeat") && symptom3.equalsIgnoreCase("Severe headache") && symptom4.equalsIgnoreCase("Blood in the urine")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Vision problem") && symptom2.equalsIgnoreCase("Irriguler heartbeat") && symptom3.equalsIgnoreCase("Blood in the urine") && symptom4.equals("Severe headache")){
                    Intent a = new Intent(asa.this, hypertensionpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }

                //breast cancer
                else if(symptom1.equalsIgnoreCase("Nipple discharge") && symptom2.equalsIgnoreCase("Breast pain") && symptom3.equalsIgnoreCase("Dimpling") && symptom4.equalsIgnoreCase("Swelling")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Nipple discharge") && symptom2.equalsIgnoreCase("Breast pain") && symptom3.equalsIgnoreCase("Swelling") && symptom4.equalsIgnoreCase("Dimpling")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Nipple discharge") && symptom2.equalsIgnoreCase("Dimpling") && symptom3.equalsIgnoreCase("Swelling") && symptom4.equalsIgnoreCase("Breast pain")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Nipple discharge") && symptom2.equalsIgnoreCase("Swelling") && symptom3.equalsIgnoreCase("Dimpling") && symptom4.equalsIgnoreCase("Breast pain")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Breast pain") && symptom2.equalsIgnoreCase("Nipple discharge") && symptom3.equalsIgnoreCase("Dimpling") && symptom4.equalsIgnoreCase("Swelling")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Breast pain") && symptom2.equalsIgnoreCase("Nipple discharge") && symptom3.equalsIgnoreCase("Swelling") && symptom4.equalsIgnoreCase("Dimpling")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Breast pain") && symptom2.equalsIgnoreCase("Dimpling") && symptom3.equalsIgnoreCase("Nipple discharge") && symptom4.equalsIgnoreCase("Swelling")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Breast pain") && symptom2.equalsIgnoreCase("Swelling") && symptom3.equalsIgnoreCase("Nipple discharge") && symptom4.equalsIgnoreCase("Dimpling")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Dimpling") && symptom2.equalsIgnoreCase("Swelling") && symptom3.equalsIgnoreCase("Nipple discharge") && symptom4.equalsIgnoreCase("Breast pain")){

                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Dimpling") && symptom2.equalsIgnoreCase("Swelling") && symptom3.equalsIgnoreCase("Breast pain") && symptom4.equalsIgnoreCase("Nipple discharge")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Dimpling") && symptom2.equalsIgnoreCase("Breast pain") && symptom3.equalsIgnoreCase("Swelling") && symptom4.equalsIgnoreCase("Nipple discharge")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Dimpling") && symptom2.equalsIgnoreCase("Breast pain") && symptom3.equalsIgnoreCase("Nipple discharge") && symptom4.equalsIgnoreCase("Swelling")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Swelling") && symptom2.equalsIgnoreCase("Breast pain") && symptom3.equalsIgnoreCase("Nipple discharge") && symptom4.equalsIgnoreCase("Dimpling")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                    //Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Swelling") && symptom2.equalsIgnoreCase("Breast pain") && symptom3.equalsIgnoreCase("Dimpling") && symptom4.equalsIgnoreCase("Nipple discharge")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Swelling") && symptom2.equalsIgnoreCase("Dimpling") && symptom3.equalsIgnoreCase("Breast pain") && symptom4.equalsIgnoreCase("Nipple discharge")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else if(symptom1.equalsIgnoreCase("Swelling") && symptom2.equalsIgnoreCase("Nipple discharge") && symptom3.equalsIgnoreCase("Dimpling") && symptom4.equalsIgnoreCase("Breast pain")){
                    Intent a = new Intent(asa.this, bcancerpres.class);
                    startActivity(a);
                   // Toast.makeText(getApplicationContext(), "hyphertention",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Result not found!!! please contact your Doctor",Toast.LENGTH_SHORT).show();
                }
            }
        });

        /*mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        /getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       */
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(asa.this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation_views);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.med){
             Intent intent = new Intent(asa.this, medication.class);
             startActivity(intent);
        }
        if (id == R.id.remainder){
            Intent intent = new Intent(asa.this, remainder.class);
            startActivity(intent);
        }
        if (id == R.id.htips){
            Intent intent = new Intent(asa.this, health_tips.class);
            startActivity(intent);
        }
        if (id == R.id.about){
            Intent intent = new Intent(asa.this, abouts.class);
            startActivity(intent);
        }

        return false;
    }
}
