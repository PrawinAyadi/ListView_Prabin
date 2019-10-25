package com.example.listview_prabin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView listview;

    public static final String countires[]={
       "Nepal", "Kathmandu",
       "India", "New Delhi",
       "China", "Beljing",
       "UK", "London",
       "Canada", "Ottawa",
    };

    private Map<String,String> countriesMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);

        countriesMap = new HashMap<String, String>();
        for (int i=0;i<countires.length; i+=2){
            countriesMap.put(countires[i],countires[i+1]);
        }



        ArrayAdapter countryAdapter  = new ArrayAdapter<>
                (this,android.R.layout.simple_list_item_1,new ArrayList<String>(countriesMap.keySet()));

        listview.setAdapter(countryAdapter);

        //listview click listner
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String country = parent.getItemAtPosition(i).toString();
                String capital = countriesMap.get(country);
                Toast.makeText(MainActivity.this, "Capital of" + country + "is:" +capital, Toast.LENGTH_SHORT).show();

            }
        });
    }

    }

