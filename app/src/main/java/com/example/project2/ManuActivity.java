package com.example.project2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project2.adapter.TeamLogoAdapter;
import com.example.project2.model.TeamLogo;

import java.util.ArrayList;
import java.util.List;

public class ManuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_manu);
        RecyclerView faceView = findViewById(R.id.rv_manu);

        List<TeamLogo> face = new ArrayList<>();
        face.add(new TeamLogo(R.drawable.u1,
                "David De Gea",
                "Kiper",
                "1"));
        face.add(new TeamLogo(R.drawable.u3,
                "Aaron Wan Bissaka",
                "Belakang",
                "29"));
        face.add(new TeamLogo(R.drawable.u2,
                "Harry Maguire",
                "Belakang",
                "5"));
        face.add(new TeamLogo(R.drawable.u4,
                "Phil Jones",
                "Belakang",
                "4"));
        face.add(new TeamLogo(R.drawable.u5,
                "Luke Shaw",
                "Belakang",
                "23"));
        face.add(new TeamLogo(R.drawable.u6,
                "Nemanja Matic",
                "Tengah",
                "31"));
        face.add(new TeamLogo(R.drawable.u7,
                "Jesse Lingard",
                "Tengah",
                "14"));
        face.add(new TeamLogo(R.drawable.u8,
                "Juan Mata",
                "Tengah",
                "8"));
        face.add(new TeamLogo(R.drawable.u9,
                "Marcus Rashford",
                "Depan",
                "10"));
        face.add(new TeamLogo(R.drawable.u10,
                "Anthony Martial",
                "Depan",
                "9"));
        face.add(new TeamLogo(R.drawable.u11,
                "Mason Greenwood",
                "Depan",
                "26"));

        TeamLogoAdapter adapter = new TeamLogoAdapter(this, face);
        faceView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        faceView.setLayoutManager(layoutManager);
    }
}
