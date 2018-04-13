package com.example.johnnytunguyen.filmtracking.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by johnnytunguyen on 2018-04-12.
 */

public class DBManager extends SQLiteOpenHelper {


    public static final String DATABASE_NAME ="MovieTracking" ;
    public static final String TABLE_NAME = "Movie";
    public static final int VERSION_NUM = 1;
    public static final String KEY_ID ="id";
    public static final String TITLE="title";
    public static final String ACTORS="actors";
    public static final String DESCRIPTION="description";
    public static final String RATING="rating";
    public static final String GENER="genre";




    private static final String SQL= "CREATE TABLE "+TABLE_NAME + " ( "+
            KEY_ID +" integer primary key autoincrement, "
            + TITLE +" Varchar(120), "
            +ACTORS +" Varchar(120),"
            +DESCRIPTION+" Text,"
            + RATING +" Decimal(1,1),"
            +GENER+" Varchar(50) ;";


    public DBManager(Context cxt) {
        super(cxt,DATABASE_NAME,null,VERSION_NUM);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }


    //insert or updating ->return void
    public void ChangeTable(String sql){

        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sql);


    }

    //get database by select statement, return the cusor
    public Cursor getData(String query){
        SQLiteDatabase db = getReadableDatabase();
        return db.rawQuery(query,null);
    }

}
