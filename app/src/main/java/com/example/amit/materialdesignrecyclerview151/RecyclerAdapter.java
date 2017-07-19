package com.example.amit.materialdesignrecyclerview151;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Amit on 7/2/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    ArrayList<RecycelerItem>arrayList=new ArrayList<RecycelerItem>();
    Context context;

    public RecyclerAdapter(ArrayList<RecycelerItem> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        RecycelerItem recycelerItem=arrayList.get(position);
         holder.textView.setText(recycelerItem.getName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    static class RecyclerViewHolder extends RecyclerView.ViewHolder{

TextView textView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);

textView=(TextView)itemView.findViewById(R.id.textView2);



        }
    }
}
