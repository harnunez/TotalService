package com.example.totalservice;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;



public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        
        configureToolbar(getResources().getString(R.string.tittle_create_Account_toolbar),true);
    }

    public void configureToolbar(String tittle, boolean upButton){
       Toolbar myToolBar = findViewById(R.id.toolbarCreateAcc);
       setSupportActionBar(myToolBar);
       getSupportActionBar().setTitle(tittle);
       getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
