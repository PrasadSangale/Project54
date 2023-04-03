package com.example.project54;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] doctors={"DR. ARJAV VAJIR","DR. ASMI SHAH","DR. FARHAN SHEIKH","DR. DIKSHA JAIN","DR. MISHRI VAJIR","DR. SMITA DAVE","DR. RAHUL SHAH","DR. SMIT VASH","DR. SALONI MEHTA"};

        AutoCompleteTextView autoCompleteTextView=findViewById(R.id.autocompleteTextView);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,doctors);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

    }
}