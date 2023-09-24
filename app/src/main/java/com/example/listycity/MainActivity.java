package com.example.listycity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView city;
    ArrayList<String> cityList;
    ArrayAdapter<String> cityAdaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] cities = {"Delhi","this thing","that thing"};
        cityList = new ArrayList<String>();

        city = findViewById(R.id.city_list);
        cityList.addAll(Arrays.asList(cities));

        cityAdaper = new ArrayAdapter<>(this,R.layout.activity_main,cityList);
        city.setAdapter(cityAdaper);



    }
}