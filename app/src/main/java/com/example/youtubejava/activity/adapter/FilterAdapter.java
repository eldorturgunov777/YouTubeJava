package com.example.youtubejava.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubejava.R;
import com.example.youtubejava.activity.model.Filter;

import java.util.ArrayList;

/**
 * Created by Eldor Turgunov on 26.05.2022.
 * YouTube Java
 * eldorturgunov777@gmail.com
 */
public class FilterAdapter extends RecyclerView.Adapter<FilterAdapter.FilterViewHolder> {
    private static final int TYPE_ITEM_HEADER = 0;
    Context context;
    ArrayList<Filter> items;

    public FilterAdapter(Context context, ArrayList<Filter> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public FilterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM_HEADER) {
            View header = LayoutInflater.from(context).inflate(R.layout.item_first_feed_filter, parent, false);
            return new FilterFirstViewHolder(header);
        }
        View view = LayoutInflater.from(context).inflate(R.layout.item_feed_filter, parent, false);
        return new FilterViewHolder(view);
    }

    @Override
    public int getItemViewType(int position) {
        if (isHeader(position)) return TYPE_ITEM_HEADER;
        return position;
    }

    public boolean isHeader(int position) {
        return position == 0;
    }

    @Override
    public void onBindViewHolder(@NonNull FilterViewHolder holder, int position) {
        if (isHeader(position)) return;
        Filter data = items.get(position);
        holder.tv_title.setText(data.getTitle());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class FilterViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title;

        public FilterViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
        }
    }

    private static class FilterFirstViewHolder extends FilterViewHolder {
        public FilterFirstViewHolder(View view) {
            super(view);
        }
    }
}
