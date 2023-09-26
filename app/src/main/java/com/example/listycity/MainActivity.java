package com.example.listycity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView city;
    ArrayList<String> cityList;
    ArrayAdapter<String> cityAdaper;
    Button addButton;
    Button deleteButton;
    EditText editText;
    Button addEntry;

    LinearLayout inputDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] cities = {"Delhi","New Mexico","Bear"};
        cityList = new ArrayList<String>();

        city = findViewById(R.id.city_list);
        cityList.addAll(Arrays.asList(cities));

        cityAdaper = new ArrayAdapter<>(this,R.layout.activity_main,cityList);
        city.setAdapter(cityAdaper);



    }

    @Override
    protected void onStart(){
        super.onStart();
        addButton = findViewById(R.id.add_button);
        deleteButton = findViewById(R.id.delete_button);
        editText = findViewById(R.id.edit_text);
        addEntry = findViewById(R.id.add_entry);
        inputDiv = findViewById(R.id.input_div);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDiv.setVisibility(View.VISIBLE);
            }
        });

        addEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cityLabel = editText.getText().toString();
                if (cityLabel.length() == 0){
                    inputDiv.setVisibility(View.INVISIBLE);
                }else{
                    cityList.add(cityLabel);
                    cityAdaper.notifyDataSetChanged();
                    inputDiv.setVisibility(View.INVISIBLE);
                }
            }
        });


    }
}