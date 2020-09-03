package com.example.food.Databse;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Users.class,userAddress.class,Order.class},version = 2,exportSchema = false)
public abstract class useData extends RoomDatabase {
    public abstract MyDao myDao();
}
