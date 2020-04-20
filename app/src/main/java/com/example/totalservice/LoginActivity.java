package com.example.totalservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity{

   private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void goCreateAccount(View view) {
        Intent intent = new Intent(this,CreateAccountActivity.class);
        startActivity(intent);
    }


   public void goToContainerActivity(View view){
        Intent nIntent = new Intent(this, ContainerActivity.class);
        startActivity(nIntent);
   }

}