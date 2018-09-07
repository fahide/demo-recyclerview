package com.example.fahid.demorecycle;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.MotionEvent;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.animators.SlideInDownAnimator;
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView,recyclerView2;
    private RecyclerView.Adapter adapter;
    private List<Item_> listitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView2 = (RecyclerView) findViewById(R.id.recyclerview2);
        recyclerView.setHasFixedSize(true);
        recyclerView2.setHasFixedSize(true);
        StaggeredGridLayoutManager layout = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layout);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        listitems = new ArrayList<>();
        //Item_ listitem=new Item_("fahide","Rangpur");
        listitems.add(new Item_("fahide", "rangpur"));
        listitems.add(new Item_("fahide", "rangpur"));
        listitems.add(new Item_("fahide", "rangpur"));
        listitems.add(new Item_("fahide", "rangpur"));
        listitems.add(new Item_("fahide", "rangpur"));
        listitems.add(new Item_("fahide", "rangpur"));
        listitems.add(new Item_("fahide", "rangpur"));
        listitems.add(new Item_("fahide", "rangpur"));
        listitems.add(new Item_("fahide", "rangpur"));
        listitems.add(new Item_("fahide", "rangpur"));
        listitems.add(new Item_("fahide", "rangpur"));

        //listitems.add(listitem);
        adapter = new Adapter(listitems, this);
        recyclerView.setAdapter(adapter);
        recyclerView2.setAdapter(adapter);
        recyclerView.setItemAnimator(new SlideInUpAnimator());
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);

    }
}
