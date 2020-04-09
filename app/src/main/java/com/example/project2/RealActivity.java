package com.example.project2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project2.adapter.TeamLogoAdapter;
import com.example.project2.model.TeamLogo;

import java.util.ArrayList;
import java.util.List;

public class RealActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real);
        RecyclerView faceView = findViewById(R.id.rv_real);

        List<TeamLogo> face = new ArrayList<>();
        face.add(new TeamLogo(R.drawable.courtois,
            "Thibaut Courtois",
            "Kiper",
            "13"));
        face.add(new TeamLogo(R.drawable.carvajal,
                "Daniel Carvajal",
                "Belakang",
                "2"));
        face.add(new TeamLogo(R.drawable.varane,
                "Raphael Varane",
                "Belakang",
                "5"));
        face.add(new TeamLogo(R.drawable.ramos,
                "Sergio Ramos",
                "Belakang",
                "4"));
        face.add(new TeamLogo(R.drawable.mendy,
                "Ferland Mendy",
                "Belakang",
                "23"));
        face.add(new TeamLogo(R.drawable.modric,
                "Luka Modric",
                "Tengah",
                "10"));
        face.add(new TeamLogo(R.drawable.kroos,
                "Toni Kroos",
                "Tengah",
                "8"));
        face.add(new TeamLogo(R.drawable.isco,
                "Isco Alarcon",
                "Tengah",
                "22"));
        face.add(new TeamLogo(R.drawable.hazard,
                "Eden Hazard",
                "Depan",
                "7"));
        face.add(new TeamLogo(R.drawable.bale,
                "Gareth Bale",
                "Depan",
                "11"));
        face.add(new TeamLogo(R.drawable.benzema,
                "Karim Benzema",
                "Depan",
                "9"));

        TeamLogoAdapter adapter = new TeamLogoAdapter(this, face);
        faceView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        faceView.setLayoutManager(layoutManager);
    }
}
