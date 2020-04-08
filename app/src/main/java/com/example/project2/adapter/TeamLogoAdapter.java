package com.example.project2.adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project2.RealActivity;
import com.example.project2.model.TeamLogo;

import java.util.List;

public class TeamLogoAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<TeamLogo> face;

    public TeamLogoAdapter(Context context, List<TeamLogo> face) {
        this.context = context;
        this.face = face;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
