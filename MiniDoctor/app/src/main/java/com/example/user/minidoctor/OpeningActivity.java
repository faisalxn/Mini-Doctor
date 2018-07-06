package com.example.user.minidoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OpeningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
    }


    public void onClickButton(View v){

        if(v.getId()==R.id.imageButton){

            Intent i = new Intent(OpeningActivity.this , LoginActivity.class);
            startActivity(i);


        }


    }
}
