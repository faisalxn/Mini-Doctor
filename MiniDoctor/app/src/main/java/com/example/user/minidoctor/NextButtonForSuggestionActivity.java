package com.example.user.minidoctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextButtonForSuggestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_button_for_suggestion);

        TextView tv = (TextView) findViewById(R.id.tvSuggestions);

        String array [] = new String[100];

        int ct = 0 ;

        array[0] = "Eat protein enriched food as you are an underweight person.";
        array[1] = "Avoid fatty foods and do exercise regularly as you are an obese person.";
        array[2] = "Consult with a dietician and consult with a gym instructor to find out suitable exercise for you.";
        array[3] = "Keep sugar in control and take insulin if neccessery.";
        array[4] = "Don't do any stressfull work as you have undergone a recent operation.";
        array[5] = "Avoid the foods you are allergic to.";
        array[6] = "Avoid using computers and other electronic devices for long time.";
        array[7] = "Try to stay away from dust and take sufficient amount of sleep , it is very neccessery for migrane patient.";
        array[8] = "Avoid fatty foods and try stay tension free to keep your blood pressure in control.";
        array[9] = "To avoid heart disease maintain a healthy blood pressure , monitor your cholesterol , do exercise regularly and avoid smoking.";
        array[10] = "As you are an asthma patient keep your home clean , avoid dust , keep inhaler always with you accoreding to your doctor's prescription.";


        String s = "";

        boolean slim = false ,obes = false , exetremeObese = false ;

        double ratio = User.staicPointer.weight / ((User.staicPointer.height*0.3048)*(User.staicPointer.height*0.3048));

        if(ratio<18.5 ){
            slim = true ;
        }
        else if(ratio>=25 && ratio <=29.9 ){
            obes = true ;
        }
        else if(ratio>30 ){
            exetremeObese = true ;
        }



        if(slim){
            s+=array[0];
            s+="\n\n";
        }
        else if(obes){

            s+=array[1];
            s+="\n\n";
        }
        else if(exetremeObese){

            s+=array[2];
            s+="\n\n";
        }

        if(User.staicPointer.diabetes==true){

            s+=array[3];
            s+="\n\n";
        }

        if(User.staicPointer.operation==true){

            s+=array[4];
            s+="\n\n";
        }

        if(User.staicPointer.allergy==true){

            s+=array[5];
            s+="\n\n";
        }


        if(User.staicPointer.useGlass==true){

            s+=array[6];
            s+="\n\n";
        }

        if(User.staicPointer.migrane==true){

            s+=array[7];
            s+="\n\n";
        }

        if(User.staicPointer.bloodPressure==true){

            s+=array[8];
            s+="\n\n";
        }

        if(User.staicPointer.heartDisease==true){

            s+=array[9];
            s+="\n\n";
        }

        if(User.staicPointer.asthma==true){

            s+=array[10];
            s+="\n\n";
        }



        tv.setText(s);


    }
}
