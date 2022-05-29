package com.example.youtubejava.activity.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubejava.R;
import com.example.youtubejava.activity.model.Feed;
import com.example.youtubejava.activity.model.Shorts;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eldor Turgunov on 26.05.2022.
 * YouTube Java
 * eldorturgunov777@gmail.com
 */
public class FeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    int ITEM_VIEW = 0;
    int ITEM_LIST = 1;

    Context context;
    ArrayList<Feed> items = new ArrayList<>();


    public FeedAdapter(Context context, ArrayList<Feed> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == ITEM_VIEW) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_feed_video, parent, false);
            return new FeedViewHolder(view);
        }
        View shorts = LayoutInflater.from(context).inflate(R.layout.item_shorts_list, parent, false);
        return new ShortsViewHolder(shorts);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Feed data = items.get(position);
        if (holder instanceof FeedViewHolder) {
            ((FeedViewHolder) holder).iv_profile.setImageResource(data.getProfile());
            ((FeedViewHolder) holder).iv_video.setImageResource(data.getPhoto());
        }
        if (holder instanceof ShortsViewHolder) {
            RecyclerView recyclerView = ((ShortsViewHolder) holder).recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));

            ArrayList<Shorts> list = new ArrayList<>();
            ShortsAdapter adapter = new ShortsAdapter(context, list);

            recyclerView.setAdapter(adapter);
            list.add(new Shorts(R.drawable.im_user_1, "Eldor", "Turgunov"));
            list.add(new Shorts(R.drawable.im_user_2, "Eldor", "Turgunov"));
            list.add(new Shorts(R.drawable.im_user_3, "Eldor", "Turgunov"));
            list.add(new Shorts(R.drawable.im_user_1, "Eldor", "Turgunov"));
            list.add(new Shorts(R.drawable.im_user_1, "Eldor", "Turgunov"));
            list.add(new Shorts(R.drawable.im_user_2, "Eldor", "Turgunov"));
            list.add(new Shorts(R.drawable.im_user_3, "Eldor", "Turgunov"));
            list.add(new Shorts(R.drawable.im_user_1, "Eldor", "Turgunov"));
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position).getShorts() != null) return ITEM_LIST;
        return ITEM_VIEW;
    }

    public static class FeedViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView iv_profile;
        ImageView iv_video;

        public FeedViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_profile = itemView.findViewById(R.id.iv_profile);
            iv_video = itemView.findViewById(R.id.iv_video);
        }
    }

    public static class ShortsViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;

        public ShortsViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = itemView.findViewById(R.id.shorts_recyclerView);
        }
    }
}
