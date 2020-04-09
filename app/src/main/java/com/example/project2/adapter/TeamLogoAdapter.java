package com.example.project2.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project2.DataActivity;
import com.example.project2.R;
import com.example.project2.RealActivity;
import com.example.project2.model.TeamLogo;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TeamLogoAdapter extends RecyclerView.Adapter<TeamLogoAdapter.ViewHolder> {

    private Context context;
    private List<TeamLogo> items;

    public TeamLogoAdapter(Context context, List<TeamLogo> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public TeamLogoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_team, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final TeamLogo item = items.get(position);
        holder.nameText.setText(item.getName());
        Picasso.get().load(item.getFace()).into(holder.faceImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DataActivity.class);
                i.putExtra("face", item.getFace());
                i.putExtra("name", item.getName());
                i.putExtra("posisi", item.getPosisi());
                i.putExtra("nomor", item.getNomor());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView faceImage;
        TextView nameText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            faceImage = itemView.findViewById(R.id.image);
            nameText = itemView.findViewById(R.id.team);
        }
    }
}
