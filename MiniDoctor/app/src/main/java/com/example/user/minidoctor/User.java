package com.example.user.minidoctor;

/**
 * Created by user on 8/13/2016.
 */
public class User {
    String userName , passWord ;
    public static User staicPointer ;


    double age , height , weight ;
    String gender , place ;
    boolean diabetes , operation , allergy ,useGlass , migrane , bloodPressure ,  heartDisease , asthma ;

    public User(){


    }



    public User(String userName, String passWord ){
        this.userName = userName ;
        this.passWord = passWord ;
    }




    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isOperation() {
        return operation;
    }

    public void setOperation(boolean operation) {
        this.operation = operation;
    }

    public boolean isAllergy() {
        return allergy;
    }

    public void setAllergy(boolean allergy) {
        this.allergy = allergy;
    }

    public boolean isUseGlass() {
        return useGlass;
    }

    public void setUseGlass(boolean useGlass) {
        this.useGlass = useGlass;
    }

    public boolean isMigrane() {
        return migrane;
    }

    public void setMigrane(boolean migrane) {
        this.migrane = migrane;
    }

    public boolean isBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(boolean bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public boolean isHeartDisease() {
        return heartDisease;
    }

    public void setHeartDisease(boolean heartDisease) {
        this.heartDisease = heartDisease;
    }

    public boolean isAsthma() {
        return asthma;
    }

    public void setAsthma(boolean asthma) {
        this.asthma = asthma;
    }


}
