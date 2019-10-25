package com.example.listview_prabin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {

    private ListView listview;

    public static final String countires[]={
       "Nepal",
       "India",
       "China",
       "UK",
       "Canada"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);

        ArrayAdapter countryAdapter  = new ArrayAdapter<>
                (this,android.R.layout.simple_list_item_1,countires);

        listview.setAdapter(countryAdapter);
    }
}
