package com.jinming.bbva.list;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.jinming.bbva.R;
import com.jinming.bbva.data.ResultsItem;

import java.util.ArrayList;

/**
 * Created by Jinming on 12/11/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context mContext;
    ArrayList<ResultsItem> resultsItemsArrayList;

    public MyAdapter(Context context, ArrayList<ResultsItem> list) {
        this.mContext = context;
        this.resultsItemsArrayList = list;
    }
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_location, parent, false);
        MyAdapter.MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ResultsItem resultsItem = resultsItemsArrayList.get(position);
        holder.mID.setText(resultsItem.getId());
        holder.mName.setText(resultsItem.getName());
        holder.mAddress.setText(resultsItem.getFormattedAddress());
    }

    @Override
    public int getItemCount() {
        return resultsItemsArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView mID, mName, mAddress;
        Button mDetails;

        public MyViewHolder(View view) {
            super(view);
            mID = (TextView) itemView.findViewById(R.id.id);
            mName = (TextView) itemView.findViewById(R.id.name);
            mAddress = (TextView) itemView.findViewById(R.id.address);
            mDetails = (Button) itemView.findViewById(R.id.details);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            ResultsItem resultsItem = resultsItemsArrayList.get(getAdapterPosition());
            Toast.makeText(mContext.getApplicationContext(), resultsItem.toString(), Toast.LENGTH_SHORT).show();
        }
    }


}
