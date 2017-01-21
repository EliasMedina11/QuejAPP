package com.projectbelatrix.quejapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lala2343(View v){
        Toast.makeText(this,"LALALAL", Toast.LENGTH_SHORT).show();
    }
}
