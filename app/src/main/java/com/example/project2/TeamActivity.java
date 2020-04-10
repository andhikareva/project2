package com.example.project2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project2.adapter.TeamAdapter;
import com.example.project2.model.TeamModel;

import java.util.ArrayList;
import java.util.List;

public class TeamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        RecyclerView teamView = findViewById(R.id.team);

        List<TeamModel> team = new ArrayList<>();
        team.add(new TeamModel(R.drawable.logo_rm,
                "Real Madrid",
                "1"));
        team.add(new TeamModel(R.drawable.logo_cfc,
                "Chelsea FC",
                "2"));
        team.add(new TeamModel(R.drawable.logo_mc,
                "Manchester City",
                "3"));
        team.add(new TeamModel(R.drawable.logo_mu,
                "Manchester United",
                "4"));
        team.add(new TeamModel(R.drawable.logo_whu,
                "West Ham United",
                "5"));

        TeamAdapter adapter = new TeamAdapter(this, team);
        teamView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamView.setLayoutManager(layoutManager);
    }
}
