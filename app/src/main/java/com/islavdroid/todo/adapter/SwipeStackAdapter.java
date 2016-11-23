package com.islavdroid.todo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.islavdroid.todo.R;

import java.util.List;



public class SwipeStackAdapter extends BaseAdapter {

    private List<String> mData;
    private LayoutInflater inflater ;

    public SwipeStackAdapter(List<String> data, Context context) {
        this.mData = data;
        inflater= LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public String getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView =inflater.inflate(R.layout.card, parent, false);
        TextView textViewCard = (TextView) convertView.findViewById(R.id.textViewCard);
        textViewCard.setText(mData.get(position));

        return convertView;
    }
}