package com.example.youtubejava.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubejava.R;
import com.example.youtubejava.activity.model.Shorts;

import java.util.ArrayList;

/**
 * Created by Eldor Turgunov on 27.05.2022.
 * YouTube Java
 * eldorturgunov777@gmail.com
 */
public class ShortsAdapter extends RecyclerView.Adapter<ShortsAdapter.ShortsViewHolder> {
    Context context;
    ArrayList<Shorts> items;

    public ShortsAdapter(Context context, ArrayList<Shorts> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ShortsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_shorts_video, parent, false);
        return new ShortsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShortsViewHolder holder, int position) {
        Shorts data = items.get(position);
        holder.img.setImageResource(data.getImg());
        holder.title.setText(data.getTitle());
        holder.desc.setText(data.getDesc());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ShortsViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title;
        TextView desc;

        public ShortsViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.shorts);
            title = itemView.findViewById(R.id.tv_shorts);
            desc = itemView.findViewById(R.id.tv_desc_shorts);
        }
    }
}
