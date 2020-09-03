package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class profile extends AppCompatActivity {

    TextView name,phone,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name=(TextView) findViewById(R.id.name);
        phone=(TextView) findViewById(R.id.phone);
        password=(TextView) findViewById(R.id.password);

    }
}
