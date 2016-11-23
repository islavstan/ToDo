package com.islavdroid.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.islavdroid.todo.adapter.SwipeStackAdapter;
import com.islavdroid.todo.flc.SwipeStack;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

import butterknife.OnClick;

public class MainActivity extends Activity  implements SwipeStack.SwipeStackListener, View.OnClickListener {

    private ArrayList<String> mData;
    private SwipeStack mSwipeStack;
    private SwipeStackAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSwipeStack = (SwipeStack) findViewById(R.id.swipeStack);

       FloatingActionButton mFab = (FloatingActionButton) findViewById(R.id.fab);


        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mData.add("Sta222s");
                mAdapter.notifyDataSetChanged();
            }
        });

        mData = new ArrayList<>();
        mAdapter = new SwipeStackAdapter(mData,this);
        mSwipeStack.setAdapter(mAdapter);


        fillWithTestData();
    }

    private void fillWithTestData() {
        for (int x = 0; x < 5; x++) {
            mData.add("Stas"+ " " + (x + 1));
        }
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onViewSwipedToLeft(int position) {

    }

    @Override
    public void onViewSwipedToRight(int position) {

    }

    @Override
    public void onStackEmpty() {

    }
}
