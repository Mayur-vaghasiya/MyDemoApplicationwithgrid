package com.example.peacock.mydemoapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by peacock on 6/16/16.
 */
public class RVadapter extends RecyclerView.Adapter<RVadapter.ViewHolder> {

    private ArrayList<item> itemlist;
    private Context context;
    private LayoutInflater mInflater;

    public RVadapter(Context context, ArrayList<item> itemlist) {
        this.context = context;
        this.itemlist = itemlist;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public RVadapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = mInflater.inflate(R.layout.listitemll, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RVadapter.ViewHolder holder, final int position) {

        item i = itemlist.get(position);
        holder.name.setText(i.getItenname());
        holder.imageView.setImageResource(i.getImgid());
        holder.imgindustry.setImageResource(i.getImgindustry());
        final String Name=itemlist.get(position).getItenname();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), " ItemName  :  " + Name + " Position : " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView, imgindustry;
        private TextView name;

        public ViewHolder(final View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.img1);
            name = (TextView) view.findViewById(R.id.itemname);
            imgindustry = (ImageView) view.findViewById(R.id.imgindustry);

        }
    }
}
