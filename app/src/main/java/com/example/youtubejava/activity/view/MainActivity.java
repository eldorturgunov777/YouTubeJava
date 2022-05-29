package com.example.youtubejava.activity.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.youtubejava.R;
import com.example.youtubejava.activity.adapter.FeedAdapter;
import com.example.youtubejava.activity.adapter.FilterAdapter;
import com.example.youtubejava.activity.model.Feed;
import com.example.youtubejava.activity.model.Filter;
import com.example.youtubejava.activity.model.Shorts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerFilter;
    RecyclerView recyclerFeed;
    ArrayList<Filter> filter = new ArrayList<>();
    ArrayList<Feed> feed = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        recyclerFilter = findViewById(R.id.recyclerFilter);
        recyclerFilter.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerFeed = findViewById(R.id.recyclerFeed);
        recyclerFeed.setLayoutManager(new GridLayoutManager(this, 1));

        FilterAdapter filterAdapter = new FilterAdapter(this, filter);
        recyclerFilter.setAdapter(filterAdapter);
        filterData();

        FeedAdapter feedAdapter = new FeedAdapter(this, feed);
        recyclerFeed.setAdapter(feedAdapter);
        feedData();
    }

    private void feedData() {
        feed.add(new Feed(R.drawable.im_user_1, R.drawable.im_video_1, null));
        feed.add(new Feed(R.drawable.im_user_2, R.drawable.im_video_2, shorts()));
        feed.add(new Feed(R.drawable.im_user_3, R.drawable.im_video_3, null));
        feed.add(new Feed(R.drawable.im_user_1, R.drawable.im_video_1, null));
        feed.add(new Feed(R.drawable.im_user_2, R.drawable.im_video_2, null));
        feed.add(new Feed(R.drawable.im_user_3, R.drawable.im_video_3, null));
    }

    private ArrayList<Shorts> shorts() {
        ArrayList<Shorts> list = new ArrayList<>();
        list.add(new Shorts(R.drawable.im_user_1, "Eldor", "Turgunov"));
        list.add(new Shorts(R.drawable.im_user_2, "Eldor", "Turgunov"));
        list.add(new Shorts(R.drawable.im_user_3, "Eldor", "Turgunov"));
        list.add(new Shorts(R.drawable.im_user_1, "Eldor", "Turgunov"));

        return list;
    }

    private void filterData() {
        filter.add(new Filter("Android"));
        filter.add(new Filter("Java"));
        filter.add(new Filter("Kotlin"));
        filter.add(new Filter("Pc"));
        filter.add(new Filter("Phone"));
        filter.add(new Filter("Android"));
        filter.add(new Filter("Java"));
        filter.add(new Filter("Kotlin"));
        filter.add(new Filter("Pc"));
        filter.add(new Filter("Phone"));
        filter.add(new Filter("Android"));
        filter.add(new Filter("Java"));
        filter.add(new Filter("Kotlin"));
        filter.add(new Filter("Pc"));
        filter.add(new Filter("Phone"));
        filter.add(new Filter("Android"));
        filter.add(new Filter("Java"));
        filter.add(new Filter("Kotlin"));
        filter.add(new Filter("Pc"));
        filter.add(new Filter("Phone"));
    }

}