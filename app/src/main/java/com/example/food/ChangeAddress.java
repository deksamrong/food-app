package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.food.Databse.userAddress;
import com.rengwuxian.materialedittext.MaterialEditText;

public class ChangeAddress extends AppCompatActivity implements View.OnClickListener {
    EditText edtHouseNo,edtArea,edtCity,edtPincode;
    Button btnAddress;
SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        edtHouseNo=(MaterialEditText) findViewById(R.id.edtHouseNo);
        edtArea=(MaterialEditText) findViewById(R.id.edtArea);
        edtCity=(MaterialEditText) findViewById(R.id.edtCity);
        edtPincode=(MaterialEditText) findViewById(R.id.edtPincode);
sp=getSharedPreferences("User",0);
        btnAddress=(Button) findViewById(R.id.btnAddress);
        btnAddress.setText("Change Address");
        btnAddress.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Long phone=sp.getLong("Phone",0);
        int house = Integer.parseInt(edtHouseNo.getText().toString());
        String area =edtArea.getText().toString();
        String city = edtCity.getText().toString();
        int pin = Integer.parseInt(edtPincode.getText().toString());

        userAddress ua=new userAddress();
        ua.setPhone(phone);
        ua.setArea(area);
        ua.setCity(city);
        ua.setHouseno(house);
        ua.setPinCode(pin);
        MainActivity.useData.myDao().updateAddress(ua);
        Toast.makeText(this,"Adddress changed ",Toast.LENGTH_LONG).show();
        startActivity(new Intent(this,orderdetails.class));
    }
}
