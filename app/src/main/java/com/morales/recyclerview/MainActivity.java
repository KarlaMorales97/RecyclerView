package com.morales.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        series = new ArrayList<>();
        rv = findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);
        prepareSeries();
        adapter = new SeriesAdapter(series);
        rv.setAdapter(adapter);

    }

    RecyclerView rv;
    SeriesAdapter adapter;
    ArrayList<Serie> series;
    LinearLayoutManager lManager;

    public void prepareSeries(){
        String TAG = "Mensaje";
        series = new ArrayList<>();
        series.add(new Serie("Big Hero 6", "13", R.drawable.bi6, "Big Hero 6 created by Disney"));
        series.add(new Serie("Monster inc", "13", R.drawable.mn, "Monster inc created by Disney"));
        series.add(new Serie("Spider Man", "13", R.drawable.spider, "Spider Man amazing movie"));
    }
}
