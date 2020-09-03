package com.example.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;
import androidx.room.Room;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.food.Databse.useData;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSignIn,btnSignUp;
    TextView txtSlogan;
    SharedPreferences sp;
public  static useData useData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
sp=getSharedPreferences("user",0);
//SharedPreferences.Editor e=sp.edit();
//e.putLong("Phone",123);
//e.apply();
        useData= Room.databaseBuilder(getApplicationContext(),useData.class,"Users").allowMainThreadQueries().build();
        btnSignIn=(Button) findViewById(R.id.btnSignIn);
        btnSignUp=(Button) findViewById(R.id.btnSignUp);

        txtSlogan=(TextView) findViewById(R.id.txtSlogan);
        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/NABILA.TTF");
        txtSlogan.setTypeface(face);
        btnSignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSignIn:
                startActivity(new Intent(this,SignIn.class));
                break;
            case R.id.btnSignUp:
                startActivity(new Intent(this,SignUp.class));
                break;
        }

    }
}
