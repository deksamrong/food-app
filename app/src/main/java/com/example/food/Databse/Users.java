package com.example.food.Databse;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Users")
public class Users {
    @NonNull
    @PrimaryKey
    private Long PhoneNumber;
     private String Name;
     private String Password;

    @NonNull
    public Long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(@NonNull Long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

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
}
