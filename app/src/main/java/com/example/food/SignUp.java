package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.food.Databse.Users;
import com.rengwuxian.materialedittext.MaterialEditText;

public class SignUp extends AppCompatActivity implements View.OnClickListener {
    MaterialEditText edtPhone,edtName,edtPassword;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edtName=(MaterialEditText) findViewById(R.id.edtName);
        edtPassword=(MaterialEditText) findViewById(R.id.edtPassword);
        edtPhone=(MaterialEditText) findViewById(R.id.edtPhone);

        btnSignUp=(Button) findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name= edtName.getText().toString();
        String pass=edtPassword.getText().toString();
        Long phone=12345678987654321L;
        if(edtPhone.getText().toString().length()!=0){
            phone=Long.parseLong(edtPhone.getText().toString());
        }
        if(name.length()==0 || pass.length()==0 ||phone==12345678987654321L){
            Toast.makeText(this,"enter all details",Toast.LENGTH_SHORT).show();
        }else{
            Users user=new Users();
            user.setName(name);
            user.setPassword(pass);
            user.setPhoneNumber(phone);
            MainActivity.useData.myDao().SignUp(user);
            Toast.makeText(this,"Registered",Toast.LENGTH_SHORT).show();
        }

    }
}
