package com.example.uas;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBopenHelper extends SQLiteOpenHelper {

    private  static final String DATABASE_NAME = "pinjam.db";
    private static final int DATABASE_VERSION = 1;
    public DBopenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata(no INTEGER primary key, nama TEXT null, tgl TEXt null, nim TEXT null, prodi TEXT null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
//        sql = "INSERT INTO biodata (no, nama, tgl, jk, alamat) VALUES ('1', 'RahBagus', '01-06-2002', 'Laki-laki','Bali');";
//        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }


}
