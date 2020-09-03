package com.example.food.Databse;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Address")
public class userAddress {
    @PrimaryKey
    private Long Phone;
    private int houseno;
    private String Area;
    private String City;
    private int PinCode;

    public Long getPhone() {
        return Phone;
    }

    public void setPhone(Long phone) {
        Phone = phone;
    }

    public int getHouseno() {
        return houseno;
    }

    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getPinCode() {
        return PinCode;
    }

    public void setPinCode(int pinCode) {
        PinCode = pinCode;
    }
}
