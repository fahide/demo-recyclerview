package com.example.fahid.demorecycle;

import android.app.LauncherActivity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by FAHID on 8/29/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Item_> listitems;
    private Context context;

    public Adapter(List<Item_> listitems, Context context) {
        this.listitems = listitems;
        this.context = context;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

       Item_ listitem=listitems.get(position);
        holder.nametext.setText(listitem.getName());
        holder.regiontext.setText(listitem.getRegion());


    }
    

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nametext;
        public TextView regiontext;
        public ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            nametext=(TextView) itemView.findViewById(R.id.nametext);
            regiontext=(TextView) itemView.findViewById(R.id.regiontext);
            imageView=itemView.findViewById(R.id.imageView);

        }
    }

}
