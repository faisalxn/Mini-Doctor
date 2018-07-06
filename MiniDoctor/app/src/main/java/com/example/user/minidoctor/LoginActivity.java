package com.example.user.minidoctor;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.Serializable;

public class LoginActivity extends AppCompatActivity {

    public static final String forIntent = "doIntent" ;
    public static final String passObjectInIntent = "passObjectInIntent" ;



    DatabaseHelper helper = new DatabaseHelper(this);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void onClickButton(View v){
        if(v.getId()==R.id.bLogin){
            EditText eu = (EditText)findViewById(R.id.userName);
            String su = eu.getText().toString();
            EditText ep = (EditText)findViewById(R.id.passWord);
            String sp = ep.getText().toString();

            String password = helper.searchPassWord(su);
            //Toast.makeText(LoginActivity.this, password , Toast.LENGTH_SHORT).show();
            if(sp.equals(password)){

                Intent i = new Intent(LoginActivity.this,LoginSuccessfulActivity.class);

                User user = new User(su,sp);
                user.setUserName(su);
                user.setPassWord(sp);

                User.staicPointer = user ;


                startActivity(i);


            }
            else {
                Toast.makeText(LoginActivity.this, "Invalid Id", Toast.LENGTH_SHORT).show();

            }



        }
        if(v.getId()==R.id.bSignUp){
            Intent i = new Intent(LoginActivity.this,SignUpActivity.class);
            startActivity(i);
        }
    }

}
