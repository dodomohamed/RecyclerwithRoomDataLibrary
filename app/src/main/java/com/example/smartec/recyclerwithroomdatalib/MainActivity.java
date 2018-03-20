package com.example.smartec.recyclerwithroomdatalib;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.smartec.recyclerwithroomdatalib.RoomData.DataEntity;
import com.example.smartec.recyclerwithroomdatalib.RoomData.My_DataBase;
import com.example.smartec.recyclerwithroomdatalib.recyclerActivity.ViewActivity;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText pass;
    EditText email;
    Button mybutton;
    private My_DataBase dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        pass = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
        mybutton = (Button) findViewById(R.id.button);
        dp = Room.databaseBuilder(this, My_DataBase.class, My_DataBase.DB_NAME).allowMainThreadQueries().build();
       // insertUser();



        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataEntity user = new DataEntity(name.getText().toString(),email.getText().toString(),pass.getText().toString());
                dp.getdataDao().insertAll(user);
                Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
                startActivity(intent);
            }
        });
    }

    private void insertUser() {
        DataEntity user = new DataEntity();
        String namev=name.getText().toString();
        user.setName(namev);
        String emailv=email.getText().toString();
        user.setEmail(emailv);
        String passv=pass.getText().toString();
        user.setPassword(passv);
        dp.getdataDao().insertAll(user);
    }
}