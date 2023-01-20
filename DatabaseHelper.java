package com.example.testproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(Context context) {
        super(context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table user(email text primary key, password text, username text, fullname text, phonenumber text)");
        db.execSQL("Create table malaria(symptom1 text primary key, symptom2 text, symptom3 text, symptom4 text)");
        db.execSQL("Create table typhoid(symptom1 text primary key, symptom2 text, symptom3 text, symptom4 text)");
        db.execSQL("Create table asthma(symptom1 text primary key, symptom2 text, symptom3 text, symptom4 text)");
        db.execSQL("Create table bcancer(symptom1 text primary key, symptom2 text, symptom3 text, symptom4 text)");
        db.execSQL("Create table cholera(symptom1 text primary key, symptom2 text, symptom3 text, symptom4 text)");
        db.execSQL("Create table diabetes(symptom1 text primary key, symptom2 text, symptom3 text, symptom4 text)");
        db.execSQL("Create table hypertension(symptom1 text primary key, symptom2 text, symptom3 text, symptom4 text)");
        db.execSQL("Create table ulcer(symptom1 text primary key, symptom2 text, symptom3 text, symptom4 text)");
    }
        //db.execSql("Create table malaria(symptom1 text primary key, symptom2 text, symptom3 text, symptom4 text");

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists user");
        db.execSQL("drop table if exists malaria");
        db.execSQL("drop table if exists typhoid");
        db.execSQL("drop table if exists asthma");
        db.execSQL("drop table if exists bcancer");
        db.execSQL("drop table if exists cholera");
        db.execSQL("drop table if exists diabetes");
        db.execSQL("drop table if exists hypertension");
        db.execSQL("drop table if exists ulcer");
    }
    //inserting into database
    public boolean insert(String email, String password, String username, String fullname, String phonenumber){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("email",email);
        contentValues.put("password",password);
        contentValues.put("username",username);
        contentValues.put("fullname",fullname);
        contentValues.put("phonenumber",phonenumber);
        long ins = db.insert("user",null,contentValues);
        if(ins==-1)return false;
        else return true;
    }

    //checking if email exist
    public Boolean chkemail(String email){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from user where email=?",new String[]{email});
        if(cursor.getCount()>0)return false;
        else return true;
    }
    //checking email and password
    public Boolean emailpassword(String email, String password){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from user where email=? and password=?",new String[]{email,password});
        if(cursor.getCount()>0)return true;
        else return false;
    }
}
