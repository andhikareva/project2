package com.example.project2;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project2.adapter.TeamLogoAdapter;
import com.example.project2.model.TeamLogo;

import java.util.ArrayList;
import java.util.List;

public class CityActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        RecyclerView faceView = findViewById(R.id.rv_city);

        List<TeamLogo> face = new ArrayList<>();
        face.add(new TeamLogo(R.drawable.m1,
                "Ederson",
                "Kiper",
                "31"));
        face.add(new TeamLogo(R.drawable.m2,
                "Kyle Walker",
                "Belakang",
                "2"));
        face.add(new TeamLogo(R.drawable.m3,
                "John Stones",
                "Belakang",
                "5"));
        face.add(new TeamLogo(R.drawable.m4,
                "Aymeric Laporte",
                "Belakang",
                "14"));
        face.add(new TeamLogo(R.drawable.m5,
                "Oleksandr Zinchenko",
                "Belakang",
                "11"));
        face.add(new TeamLogo(R.drawable.m6,
                "Kevin De Bruyne",
                "Tengah",
                "17"));
        face.add(new TeamLogo(R.drawable.m7,
                "David Silva",
                "Tengah",
                "21"));
        face.add(new TeamLogo(R.drawable.m8,
                "Phil Foden",
                "Tengah",
                "47"));
        face.add(new TeamLogo(R.drawable.m9,
                "Riyad Mahrez",
                "Depan",
                "26"));
        face.add(new TeamLogo(R.drawable.m10,
                "Raheem Sterling",
                "Depan",
                "7"));
        face.add(new TeamLogo(R.drawable.m11,
                "Sergio Aguero",
                "Depan",
                "10"));

        TeamLogoAdapter adapter = new TeamLogoAdapter(this, face);
        faceView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        faceView.setLayoutManager(layoutManager);
    }
}
