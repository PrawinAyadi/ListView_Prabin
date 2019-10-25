package com.example.listview_prabin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CapitalActivity extends AppCompatActivity {
    private TextView textview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);

        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String capital = bundle.getString("capital");
            textview2= findViewById(R.id.textview2);
            textview2.setText(capital);

        }
    }
}
