package com.vis.jtevis.mygrowplan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jtevis on 6/25/2017.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "WhatsGrowing.db";
    public static final String TABLE_NAME ="Cropplan";
    public static final String Col_1 = "ID";
    public static final String Col_2 = "USER";
    public static final String Col_3 = "PLAN_NAME";
    public static final String Col_4 = "PLAN_DATE";
    public static final String Col_5 = "PLANTING_DATE";
    public static final String Col_6 = "GROWING_METHOD";
    public static final String Col_7 = "CROP";
    public static final String Col_8 = "VARIETY";
    public static final String Col_9 = "LIFE_CYCLE";
    public static final String Col_10 = "EPPO_CODE";
    public static final String Col_11 = "PHOTO1";


    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Cropplan (ID INTEGER PRIMARY KEY AUTOINCREMENT,USER STRING, PLAN_NAME STRING, PLANTING_DATE STRING, GROWING_METHOD STRING, CROP STRING, VARIETY STRING, LIFE_CYCLE STRING, EPPO_CODE STRING, PHOTO1 STRING);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL ("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate (db);

    }
}
