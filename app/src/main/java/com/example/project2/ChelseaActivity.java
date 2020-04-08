package com.example.project2;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project2.adapter.TeamLogoAdapter;
import com.example.project2.model.TeamLogo;

import java.util.ArrayList;
import java.util.List;

public class ChelseaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chelsea);

        RecyclerView faceView = findViewById(R.id.rv_chelsea);

        List<TeamLogo> face = new ArrayList<>();
        face.add(new TeamLogo(R.drawable.c1,
                "Kepa Arrizabalaga",
                "Kiper",
                "1"));
        face.add(new TeamLogo(R.drawable.c2,
                "Kurt Zouma",
                "Belakang",
                "5"));
        face.add(new TeamLogo(R.drawable.c3,
                "Cesar Azpilicueta",
                "Belakang",
                "28"));
        face.add(new TeamLogo(R.drawable.c4,
                "Toni RUdiger",
                "Belakang",
                "2"));
        face.add(new TeamLogo(R.drawable.c5,
                "Marcos Alonso",
                "Belakang",
                "3"));
        face.add(new TeamLogo(R.drawable.c6,
                "Ngolo Kante",
                "Tengah",
                "7"));
        face.add(new TeamLogo(R.drawable.c7,
                "Ross Barkley",
                "Tengah",
                "8"));
        face.add(new TeamLogo(R.drawable.c8,
                "Mason Mount",
                "Tengah",
                "19"));
        face.add(new TeamLogo(R.drawable.c9,
                "Pedro",
                "Depan",
                "11"));
        face.add(new TeamLogo(R.drawable.c10,
                "Olivier Giroud",
                "Depan",
                "18"));
        face.add(new TeamLogo(R.drawable.c11,
                "Willian",
                "Depan",
                "22"));

        TeamLogoAdapter adapter = new TeamLogoAdapter(this, face);
        faceView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        faceView.setLayoutManager(layoutManager);
    }
}