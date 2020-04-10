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

import com.example.project2.ChelseaActivity;
import com.example.project2.CityActivity;
import com.example.project2.R;
import com.example.project2.RealActivity;
import com.example.project2.model.TeamModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {
    private Context context;
    private List<TeamModel> items;

    public TeamAdapter(Context context, List<TeamModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_team, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamAdapter.ViewHolder holder, final int position) {
        final TeamModel item = items.get(position);
        holder.nameText.setText(item.getName());
        Picasso.get().load(item.getLogo()).into(holder.faceImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (items.get(position).getRow().matches("1")){
                    Intent go = new Intent(context, RealActivity.class);
                    context.startActivity(go);
                } else if (items.get(position).getRow().matches("2")){
                    Intent go = new Intent(context, ChelseaActivity.class);
                    context.startActivity(go);
                } else if (items.get(position).getRow().matches("3")){
                    Intent go = new Intent(context, CityActivity.class);
                    context.startActivity(go);
                }
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
