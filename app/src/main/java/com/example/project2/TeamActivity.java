package com.example.project2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

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
                ))
    }
}
