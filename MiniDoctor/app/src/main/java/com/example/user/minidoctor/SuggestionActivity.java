package com.example.user.minidoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class SuggestionActivity extends AppCompatActivity {

    double age , height , weight ;
    String gender , place ;
    boolean diabetes , operation , allergy ,useGlass , migrane , bloodPressure ,  heartDisease , asthma ;

    User user ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);
    }

    public void setInformation(){
        EditText eAge = (EditText) findViewById(R.id.edAge);
        age =  Double.parseDouble(eAge.getText().toString());


        Spinner spinnerG = (Spinner) findViewById(R.id.spGender);
        gender = spinnerG.getSelectedItem().toString();

        int f,l;

        EditText eHeightF = (EditText) findViewById(R.id.edHeightFt);
        f =  (int)Double.parseDouble(eHeightF.getText().toString());

        EditText eHeightI = (EditText) findViewById(R.id.edHeightInch);
        l =  (int)Double.parseDouble(eHeightI.getText().toString());

        height = (f*1.0) + (l/12.0) ;


        EditText eWeight = (EditText) findViewById(R.id.edWeightKg);
        weight = Double.parseDouble(eWeight.getText().toString() );

        //Spinner spinnerP = (Spinner) findViewById(R.id.spPlace);
        //place = spinnerP.getSelectedItem().toString();


        CheckBox cbDiabetes = (CheckBox) findViewById(R.id.checkBoxDiabetes);
        CheckBox cbOperation = (CheckBox) findViewById(R.id.checkBoxOperation);
        CheckBox cbAllergy = (CheckBox) findViewById(R.id.checkBoxAllergy);
        CheckBox cbGlassOrLens = (CheckBox) findViewById(R.id.checkBoxGlassOrLens);
        CheckBox cbMigrane = (CheckBox) findViewById(R.id.checkBoxMigrane);
        CheckBox cbBloodPressure = (CheckBox) findViewById(R.id.checkBoxBloodPressure);
        CheckBox cbHeartDisease = (CheckBox) findViewById(R.id.checkBoxHeartDisease);
        CheckBox cbAsthma = (CheckBox) findViewById(R.id.checkBoxAsthma);


        if(cbDiabetes.isChecked()){
            //Toast.makeText(ProfileActivity.this, "checkBoxAsthma", Toast.LENGTH_SHORT).show();
            diabetes = true ;
        }
        if(cbOperation.isChecked()){
            operation = true ;
        }
        if(cbAllergy.isChecked()){
            allergy = true ;
        }
        if(cbGlassOrLens.isChecked()){
            useGlass = true ;
        }
        if(cbMigrane.isChecked()){
            migrane = true ;
        }
        if(cbBloodPressure.isChecked()){
            bloodPressure = true ;
        }
        if(cbHeartDisease.isChecked()){
            heartDisease = true ;
        }
        if(cbAsthma.isChecked()){
            asthma = true ;
        }
    }

    public void setInformationInUserObjectForDatabase(){
        user.setAge(age);
        user.setGender(gender);
        user.setHeight(height);
        user.setWeight(weight);
        user.setPlace(place);


        user.setDiabetes(diabetes);
        user.setOperation(operation);
        user.setAllergy(allergy);
        user.setUseGlass(useGlass);
        user.setMigrane(migrane);
        user.setBloodPressure(bloodPressure);
        user.setHeartDisease(heartDisease);
        user.setAsthma(asthma);

    }




    public void onClickButton(View view) {
        if(view.getId()==R.id.bSuggestion){
            user = new User();
            User.staicPointer = user ;
            diabetes = operation = allergy = useGlass = migrane = bloodPressure =  heartDisease = asthma = false ;
            setInformation();
            setInformationInUserObjectForDatabase();
            Intent intent = new Intent(this,NextButtonForSuggestionActivity.class);
            startActivity(intent);

        }


    }

}
