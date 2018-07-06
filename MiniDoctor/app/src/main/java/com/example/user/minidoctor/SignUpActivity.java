package com.example.user.minidoctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void onClickButton(View v){
        if(v.getId()==R.id.bSave){
            EditText en = (EditText) findViewById(R.id.edUserName);
            String name = en.getText().toString();


            EditText eps = (EditText) findViewById(R.id.edPassWord);
            EditText ecps = (EditText) findViewById(R.id.edConfirmPassWord);
            String ps = eps.getText().toString();
            String cps = ecps.getText().toString();

            //Spinner spinnerP = (Spinner) findViewById(R.id.spPlace);
            //String place = spinnerP.getSelectedItem().toString();


            if(!ps.equals(cps)){
                Toast.makeText(SignUpActivity.this, "Password doesn't match", Toast.LENGTH_SHORT).show();

            }
            else if(ps.equals("")==false && en.equals("")==false){
                // insert details in database


                User u = new User(name,ps);
                //u.setPlace(place);
                helper.insertUser(u);
                Toast.makeText(SignUpActivity.this, "Done", Toast.LENGTH_SHORT).show();

            }

        }


    }
}
