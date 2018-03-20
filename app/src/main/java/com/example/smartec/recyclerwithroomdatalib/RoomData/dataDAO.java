package com.example.smartec.recyclerwithroomdatalib.RoomData;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Smartec on 3/18/2018.
 */

@Dao
public interface dataDAO {

    @Insert
    void insertAll(DataEntity... dataEntity);
    @Delete
    void deleteAll(DataEntity... dataEntity);
    @Update
    void update(DataEntity... dataEntity);
    @Query("SELECT * FROM user ")
    List<DataEntity> getAlldata();

}
