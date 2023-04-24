package com.example.a10120248latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_home);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}

//10120248
//Diana
//IF-6
//Tanggal Pengerjaan : 25-04-2023