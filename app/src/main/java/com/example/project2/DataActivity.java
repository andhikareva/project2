package com.example.project2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class DataActivity extends AppCompatActivity {

    ImageView face;
    TextView name, posisi, nomor;
    String face2, name2,posisi2, nomor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        face = findViewById(R.id.face);
        name = findViewById(R.id.name);
        posisi = findViewById(R.id.posisi);
        nomor = findViewById(R.id.nomor);

        face2 = getIntent().getStringExtra("face");
        name2 = getIntent().getStringExtra("name");
        posisi2 = getIntent().getStringExtra("posisi");
        nomor2 = getIntent().getStringExtra("nomor");

        name.setText("Nama : "+ name2);
        posisi.setText("Posisi : " + posisi2);
        nomor.setText("Nomor : " + nomor2);
        Picasso.get().load(face2).into(face);
    }

}
