package com.example.user.minidoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmergencyActivity extends AppCompatActivity {

    User user ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);


    }

    public void onClickButton(View view){
        if(view.getId()==R.id.bDhaka){
            Intent i = new Intent(this,DhakaEmergencyActivity.class);
            startActivity(i);

        }
        if(view.getId()==R.id.bChittagong){
            Intent i = new Intent(this,ChittagongEmergencyActivity.class);
            startActivity(i);

        }
        if(view.getId()==R.id.bBarisal){
            Intent i = new Intent(this,BarisalEmergencyActivity.class);
            startActivity(i);

        }
        if(view.getId()==R.id.bKhulna){
            Intent i = new Intent(this,KhulnaEmergencyActivity.class);
            startActivity(i);

        }
        if(view.getId()==R.id.bRajshahi){
            Intent i = new Intent(this,RajshahiEmergencyActivity.class);
            startActivity(i);

        }
        if(view.getId()==R.id.bRangpur){
            Intent i = new Intent(this,RangpurEmergencyActivity.class);
            startActivity(i);

        }
        if(view.getId()==R.id.bMymensingh){
            Intent i = new Intent(this,MymensinghEmergencyActivity.class);
            startActivity(i);

        }
        if(view.getId()==R.id.bSylhet){
            Intent i = new Intent(this,SylhetEmergencyActivity.class);
            startActivity(i);

        }




    }





}
