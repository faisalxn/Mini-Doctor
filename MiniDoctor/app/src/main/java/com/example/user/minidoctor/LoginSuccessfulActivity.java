package com.example.user.minidoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class LoginSuccessfulActivity extends AppCompatActivity {

    String userName ;
    public static final String passUserName = "userName" ;
    User user ;
    DatabaseHelper helper = new DatabaseHelper(this);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_successful);

        Toast.makeText(LoginSuccessfulActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

        userName = User.staicPointer.getUserName();
        user = User.staicPointer ;
        TextView tv = (TextView) findViewById(R.id.wellCome);
        tv.setText("Wellcome , "+userName);

    }
    public void onClickButton(View v){
        user = User.staicPointer ;


        if(v.getId()==R.id.bMedicines){
            Intent i = new Intent(LoginSuccessfulActivity.this , MedicinesActivity.class);
            startActivity(i);
        }
        if(v.getId()==R.id.bEmergency){

            Intent i = new Intent(LoginSuccessfulActivity.this , EmergencyActivity.class) ;
            //Toast.makeText(LoginSuccessfulActivity.this, user.getPlace() , Toast.LENGTH_SHORT).show();
            startActivity(i);


        }

        if(v.getId()==R.id.bSuggestion){
            Intent i = new Intent(LoginSuccessfulActivity.this , SuggestionActivity.class );
            startActivity(i);
        }
        if(v.getId()==R.id.bFirstAid){
            Intent i = new Intent(LoginSuccessfulActivity.this , FirstAidActivity.class);
            startActivity(i);
        }
        if(v.getId()==R.id.bAbout){
            Intent i = new Intent(LoginSuccessfulActivity.this , AboutActivity.class);
            startActivity(i);
        }

    }



}
