package com.example.budgetplanner;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Budget_planner.db";
    private static final String TABLE_NAME = "expense";
    private static final int VERSION = 1;
    Context context;
    private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+" (id int PRIMARY key AUTOINCREMENT, " +
            " date datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP ) ";

    /*
    create table expense (id int PRIMARY key AUTO_INCREMENT, date datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6))
     */

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        try {
            sqLiteDatabase.execSQL(CREATE_TABLE);
            Toast.makeText(context,"Table created successfully!:", Toast.LENGTH_LONG).show();
        }catch (Exception e){
            Toast.makeText(context,"Exception:"+e, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
