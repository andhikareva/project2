package com.example.project2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project2.adapter.TeamLogoAdapter;
import com.example.project2.model.TeamLogo;

import java.util.ArrayList;
import java.util.List;

public class WhuActivity extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whu);
        RecyclerView faceView = findViewById(R.id.rv_whu);

        List<TeamLogo> face = new ArrayList<>();
        face.add(new TeamLogo(R.drawable.w1,
                "Lukasz Fabianski",
                "Kiper",
                "1"));
        face.add(new TeamLogo(R.drawable.w2,
                "Ryan Fredericks",
                "Belakang",
                "24"));
        face.add(new TeamLogo(R.drawable.w3,
                "Issa Diop",
                "Belakang",
                "23"));
        face.add(new TeamLogo(R.drawable.w4,
                "Angelo Ogbonna",
                "Belakang",
                "21"));
        face.add(new TeamLogo(R.drawable.w5,
                "Arthur Masuaku",
                "Belakang",
                "26"));
        face.add(new TeamLogo(R.drawable.w6,
                "Mark Noble",
                "Tengah",
                "16"));
        face.add(new TeamLogo(R.drawable.w7,
                "Declan Rice",
                "Tengah",
                "41"));
        face.add(new TeamLogo(R.drawable.w8,
                "Manuel Lanzini",
                "Tengah",
                "10"));
        face.add(new TeamLogo(R.drawable.w9,
                "Jack Wilshere",
                "Tengah",
                "19"));
        face.add(new TeamLogo(R.drawable.w10,
                "Felipe Anderson",
                "Depan",
                "8"));
        face.add(new TeamLogo(R.drawable.w11,
                "Michail Antonio",
                "Depan",
                "30"));

        TeamLogoAdapter adapter = new TeamLogoAdapter(this, face);
        faceView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        faceView.setLayoutManager(layoutManager);
    }
}
