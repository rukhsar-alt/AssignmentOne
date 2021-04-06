package com.example.alphabetapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class AlphabetsView extends AppCompatActivity {
    GridView gridView;
    String[] alpha = {
            "A", "B", "C", "D", "E", "F",
            "G", "H", "I", "J", "K",
            "L", "M", "N", "O","P","Q","R","S","T","U","V","W","X","Y","Z"
    } ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets_view);
        gridView=findViewById(R.id.gridview);

//        ArrayList<String> alpha=new ArrayList<String>(26);
//        int j=65;
//        for (int i=0;i<26;i++)
//        {
//            alpha.add(Character.toString((char)j));
//            j++;
//        }

//        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,alpha);
//        gridView.setAdapter(arrayAdapter);
        GridAdapter gridAdapter = new GridAdapter(this, alpha);
        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),SingleAlphabetView.class);
                intent.putExtra("name",alpha[position]);
                startActivity(intent);
            }
        });
    }
}