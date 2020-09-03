package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.food.Databse.Order;

public class FoodOrder extends AppCompatActivity implements View.OnClickListener {
    Button pizzaButton,burgerButton,pastryButton,placeorder;
SharedPreferences sp;
SharedPreferences.Editor editor;
Order o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order);
        sp=getSharedPreferences("orders",0);
        editor=sp.edit();
        pizzaButton=(Button) findViewById(R.id.pizzaButton);
        burgerButton=(Button) findViewById(R.id.burgerButton);
        pastryButton=(Button) findViewById(R.id.pastryButton);
        pizzaButton.setOnClickListener(this);
        burgerButton.setOnClickListener(this);
        pastryButton.setOnClickListener(this);
        placeorder=(Button)findViewById(R.id.placeorder);
        placeorder.setOnClickListener(this);

//        burgerButton
    }

    @Override
    public void onClick(View v) {
        SharedPreferences sp1=getSharedPreferences("User",0);
        Long phone=sp1.getLong("Phone",0);
        switch (v.getId()){
            case R.id.pizzaButton:
                 o=new Order();
                o.setItemName("Pizza");
                o.setPhoneNumber(phone);
                o.setPrice(500.00);
                MainActivity.useData.myDao().placeOrder(o);

                break;
            case R.id.burgerButton:
                 o=new Order();
                o.setItemName("Burgur");
                o.setPhoneNumber(phone);
                o.setPrice(400.00);
                MainActivity.useData.myDao().placeOrder(o);
                break;
            case R.id.pastryButton:
                o=new Order();
                o.setItemName("Pastry");
                o.setPhoneNumber(phone);
                o.setPrice(600.00);
                MainActivity.useData.myDao().placeOrder(o);
                break;
            case R.id.placeorder:
                startActivity(new Intent(this,orderdetails.class));

        }
    }
}
