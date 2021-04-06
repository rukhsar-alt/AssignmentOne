package com.example.alphabetapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class AlphabetsView extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets_view);
        gridView=findViewById(R.id.gridview);

        ArrayList<String> alpha=new ArrayList<String>(26);
        int j=65;
        for (int i=0;i<26;i++)
        {
            alpha.add(Character.toString((char)j));
            j++;
        }

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,alpha);
        gridView.setAdapter(arrayAdapter);
    }
}