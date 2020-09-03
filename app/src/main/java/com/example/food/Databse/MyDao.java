package com.example.food.Databse;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MyDao {
    @Insert
    public void SignUp(Users users);

    @Query("select * from Users where PhoneNumber=(:phone)")
    public List<Users> getUser(Long phone);

    @Insert
    public void placeOrder(Order order);
    @Query("select * from `Order` where PhoneNumber=:phone")
    public List<Order> getOrders(Long phone);
    @Insert
    public void addAddress(userAddress address);
    @Query("select exists (select * from Address where Phone=(:phone))")
    public boolean hasAddress(Long phone);
    @Query("select * from Address where Phone=(:phone)")
    public List<userAddress> getAddress(Long phone);
    @Update
    public void updateAddress(userAddress address);
}
