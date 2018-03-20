package com.example.smartec.recyclerwithroomdatalib.RoomData;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Smartec on 3/18/2018.
 */
@Database(entities = {DataEntity.class} , version = 1, exportSchema = false)
public abstract class My_DataBase extends RoomDatabase {


    public static final String DB_NAME = "Mydatabase";

    public abstract dataDAO getdataDao();


}
