package com.example.attendance_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void Mark(View view) {
        Intent i=new Intent(Home.this,MainActivity.class);
        startActivity(i);
    }
    public void View(View view) {
        Intent i=new Intent(Home.this,ViewAttendance.class);
        startActivity(i);
    }
}