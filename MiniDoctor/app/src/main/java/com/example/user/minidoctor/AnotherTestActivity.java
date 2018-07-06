package com.example.user.minidoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AnotherTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_test);
    }


    public void onClickButton(View view){
        EditText edt = (EditText) findViewById(R.id.ed);
        String s = edt.getText().toString();

        User u = new User();
        u.setUserName(s);
        User.staicPointer = u ;
        Intent i = new Intent(AnotherTestActivity.this , TestActivity.class);
        startActivity(i);


    }



}
