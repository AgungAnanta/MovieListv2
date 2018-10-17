package com.tugas.ignagungaaw1600872.movielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class detail extends AppCompatActivity {
    RecyclerView rvCategory;
    private ArrayList<Movie> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(MovieData.getListData());
        showRecyclerCardView();
    }
}
