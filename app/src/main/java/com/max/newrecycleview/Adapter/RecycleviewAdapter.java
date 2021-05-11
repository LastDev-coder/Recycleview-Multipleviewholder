package com.max.newrecycleview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.max.newrecycleview.R;

import java.util.List;


public class RecycleviewAdapter extends RecyclerView.Adapter{

    List<String> mydata;

    public RecycleviewAdapter(List<String> mydata) {
        this.mydata = mydata;
    }

    @Override
    public int getItemViewType(int position) {

        if (mydata.get(position).toLowerCase().contains("java")) {
            return 0;
        }else {
            return 1;

        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;

        if (viewType == 0) {
            view = layoutInflater.inflate(R.layout.listview2, parent, false);
            return new RecycleviewViewholder2(view);
        }else {

            view = layoutInflater.inflate(R.layout.viewlist, parent, false);
            return new RecycleviewViewholder(view);
        }

    }

    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
        if (mydata.get(position).toLowerCase().contains("java")) {
            RecycleviewViewholder2 viewHolderOne = (RecycleviewViewholder2) holder;
            viewHolderOne.textView.setText(mydata.get(position));
        }else {
            RecycleviewViewholder viewHolderTwo = (RecycleviewViewholder) holder;
            viewHolderTwo.textView.setText(mydata.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return mydata.size();
    }

    public class RecycleviewViewholder extends RecyclerView.ViewHolder {
        TextView textView;

        public RecycleviewViewholder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.listtext);
        }
    }
    public class RecycleviewViewholder2 extends RecyclerView.ViewHolder {
        TextView textView;

        public RecycleviewViewholder2(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.listtext2);
        }
    }
}
