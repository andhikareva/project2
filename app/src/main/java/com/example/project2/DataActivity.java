package com.example.project2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DataActivity extends AppCompatActivity {

    ImageView face;
    TextView name, posisi, nomor;
    String name2,posisi2, nomor2;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        face = findViewById(R.id.face);
        name = findViewById(R.id.name);
        posisi = findViewById(R.id.posisi);
        nomor = findViewById(R.id.nomor);

        name2 = getIntent().getStringExtra("nama");
        posisi2 = getIntent().getStringExtra("pemeran");
        nomor2 = getIntent().getStringExtra("face");

        name.setText("Nama : "+ name2);
        posisi.setText("Posisi : " + posisi2);
        nomor.setText("nomor : " + nomor2);
        face.setImageResource(image);
    }

}
