package com.example.user.minidoctor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 8/13/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1 ;
    public static final String DATABASE_NAME = "users.db" ;
    public static final String TABLE_NAME = "users" ;
    public static final String COLUMN_ID = "id" ;
    public static final String COLUMN_NAME = "name" ;
    public static final String COLUMN_PASSWORD = "password" ;
    public static final String COLUMN_PLACE = "place";


    SQLiteDatabase db ;

    public static final String TABLE_CREATE = "create table users (id integer primary key not null , name text not null , password text not null);" ;



    public String searchPassWord(String name){
        db = this.getReadableDatabase();
        String query = "select name , password from "+TABLE_NAME ;
        Cursor cursor = db.rawQuery(query , null) ;
        String passWord = "NOTFOUND" , nStr ;
        if(cursor.moveToFirst()){

            do{
                nStr = cursor.getString(0);


                if(nStr.equals(name)){
                    passWord = cursor.getString(1);
                    break;
                }
            }while (cursor.moveToNext());
        }
        //db.close();
        return passWord ;
    }

    public String searchPlace(String uName,String uPass){
        db = this.getReadableDatabase();
        String query = "select name , password , place from "+TABLE_NAME ;
        Cursor cursor = db.rawQuery(query , null) ;
        String s="";

        if(cursor.moveToFirst()){
            do{
                if( uName == cursor.getString(0)  && uPass == cursor.getString(1)  ) {
                    s = cursor.getString(2);
                    break;
                }
            }while (cursor.moveToNext());
        }
        return s ;
    }

    public void insertUser(User user){
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        String query = "select * from users";
        Cursor cursor = db.rawQuery(query , null );
        int count = cursor.getCount();
        values.put(COLUMN_ID,count);
        values.put(COLUMN_NAME,user.getUserName());
        values.put(COLUMN_PASSWORD,user.getPassWord());
        db.insert(TABLE_NAME,null,values);
        db.close();
    }





    public DatabaseHelper(Context context){
        super(context , DATABASE_NAME ,null , DATABASE_VERSION );

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db ;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXITS "+TABLE_NAME ;
        db.execSQL(query);
        this.onCreate(db);

    }





}
