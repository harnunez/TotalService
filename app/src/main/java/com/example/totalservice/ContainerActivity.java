package com.example.totalservice;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.totalservice.fragments.HomeFragment;
import com.example.totalservice.fragments.ProfileFragment;
import com.example.totalservice.fragments.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ContainerActivity extends AppCompatActivity {

    private Fragment myFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomNavigationView btnNav = findViewById(R.id.navigation_bar);


        btnNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               switch (menuItem.getItemId()){

                   case R.id.home:
                       HomeFragment hfragment = new HomeFragment();
                       getSupportFragmentManager().beginTransaction().replace(R.id.container_frame,hfragment)
                               .commit();

                        return true;

                   case R.id.search:
                       SearchFragment sfragment = new SearchFragment();
                       getSupportFragmentManager().beginTransaction().replace(R.id.container_frame,sfragment)
                               .commit();

                       return true;

                   case R.id.profile:
                       ProfileFragment pfragment = new ProfileFragment();
                       getSupportFragmentManager().beginTransaction().replace(R.id.container_frame,pfragment)
                               .commit();

                       return true;
               }

               return false;
            }
       });

        if(savedInstanceState==null){
            btnNav.setSelectedItemId(R.id.home);
        }
    }
}
