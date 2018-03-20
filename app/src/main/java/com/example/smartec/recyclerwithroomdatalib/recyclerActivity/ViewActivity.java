package com.example.smartec.recyclerwithroomdatalib.recyclerActivity;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.smartec.recyclerwithroomdatalib.R;
import com.example.smartec.recyclerwithroomdatalib.RoomData.DataEntity;
import com.example.smartec.recyclerwithroomdatalib.RoomData.My_DataBase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Smartec on 3/19/2018.
 */

public class ViewActivity extends AppCompatActivity
{
    private My_DataBase dp;

    private List<DataEntity> movieList = new ArrayList<>();

    private RecyclerView recyclerView;
    private Adapter mAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        recyclerView = (RecyclerView) findViewById(R.id.myrecycler);
        mAdapter = new Adapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
        dp = Room.databaseBuilder(this, My_DataBase.class, My_DataBase.DB_NAME).allowMainThreadQueries().build();
        List<DataEntity> users = dp.getdataDao().getAlldata();
        for(int i=0;i<users.size();i++)
        {
            movieList.add(users.get(i));

        }

    }
}
