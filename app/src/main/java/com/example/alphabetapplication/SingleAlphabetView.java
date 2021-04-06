package com.example.alphabetapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class SingleAlphabetView extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_alphabet_view);
        getSupportActionBar().setTitle("Alphabets");

        imageView=findViewById(R.id.imageView);
        String name= getIntent().getStringExtra("name").toLowerCase();

        //Toast.makeText(this, name, Toast.LENGTH_LONG).show();

        int imgId = getResources().getIdentifier(name, "drawable", this.getPackageName());
        imageView.setImageResource(imgId);

        int audioId=getResources().getIdentifier(name, "raw", this.getPackageName());
        MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),audioId);
        mediaPlayer.start();
    }

}