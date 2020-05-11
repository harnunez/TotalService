package com.example.totalservice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class PictureDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_detail);
        configureToolbar("",true);
    }

    public void configureToolbar(String tittle, boolean upButton){
        Toolbar myToolBar = findViewById(R.id.toolbar_pictureDetail);
        setSupportActionBar(myToolBar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
