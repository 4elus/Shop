package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView textView;
    Spinner spinner;
    int count = 0;
    HashMap<String, Integer> items = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.qtyBtn);
        ArrayList<String> list = new ArrayList<>();
        list.add("Cola");
        list.add("Burger");
        list.add("Combo");
        
        items.put("Cola", 500);
        items.put("Burger", 1000);
        items.put("Combo", 1500);

        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, list);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);


    }

    public void sentToCart(View view) {
        Toast.makeText(this, "Hello world", Toast.LENGTH_SHORT).show();

    }

    public void plusBtn(View view) {


        count+=1;


        textView.setText(String.valueOf(count));
    }

    public void minusBtn(View view) {
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}