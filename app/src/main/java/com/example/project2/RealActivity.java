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

        TeamLogoAdapter adapter = new TeamLogoAdapter(this, face);
        faceView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        faceView.setLayoutManager(layoutManager);
    }
}
