package com.example.totalservice.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.totalservice.R;
import com.example.totalservice.adapter.PictureAdapterRecyclerView;
import com.example.totalservice.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        configureToolbar("Home",false,view);

        RecyclerView rclrView = view.findViewById(R.id.pictureRecycler);

        LinearLayoutManager lytManager = new LinearLayoutManager(getContext());
        lytManager.setOrientation(RecyclerView.VERTICAL);

        rclrView.setLayoutManager(lytManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(getImageCard(),R.layout.cardview_main, getActivity());

        rclrView.setAdapter(pictureAdapterRecyclerView);
        return view;
    }

    public ArrayList<Picture> getImageCard(){

        ArrayList<Picture> picturesCard = new ArrayList<>();

        picturesCard.add(new Picture("https://i.stack.imgur.com/LU77o.png", "Kerry chandler","4 dias","3"));
        picturesCard.add(new Picture("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ77SlD3DGKaZTX8fxMv5vnq17xJxBJnNRoA6geHMmMxM80DUvo&usqp=CAU", "Laurent Garnier","5 dias","5"));

        return picturesCard;
    }

    public void configureToolbar(String tittle, boolean upButton,View v){
        Toolbar myToolBar = v.findViewById(R.id.toolbarCreateAcc);
        ((AppCompatActivity)getActivity()).setSupportActionBar(myToolBar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
