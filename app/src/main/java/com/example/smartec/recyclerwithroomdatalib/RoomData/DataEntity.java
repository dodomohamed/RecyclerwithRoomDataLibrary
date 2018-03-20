package com.example.smartec.recyclerwithroomdatalib.RoomData;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by Smartec on 3/18/2018.
 */
@Entity(tableName = "user")
public class DataEntity
{
    public DataEntity(@NonNull String name, String password, String email) {
        Name = name;
        Password = password;
        Email = email;
    }
    public DataEntity() {

    }
    @PrimaryKey
    @NonNull
    @ColumnInfo (name="Name")
    private String Name;
    @ColumnInfo (name="password")
    private String Password;
    @ColumnInfo (name="Email")
    private String Email;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
