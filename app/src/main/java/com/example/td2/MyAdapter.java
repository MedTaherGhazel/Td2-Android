package com.example.td2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<Chien> chienList;

    // Constructor
    public MyAdapter(Context context, ArrayList<Chien> chienList) {
        this.context = context;
        this.chienList = chienList;
    }

    @Override
    public int getCount() {
        return chienList.size();
    }

    @Override
    public Object getItem(int position) {
        return chienList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_display, parent, false);

            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.imageView);
            holder.textName = convertView.findViewById(R.id.textName);
            holder.textRace = convertView.findViewById(R.id.textRace);
            holder.textOrigin = convertView.findViewById(R.id.textOrigin);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Chien currentChien = chienList.get(position);

        int imageResourceId = context.getResources().getIdentifier(
                currentChien.getImage(), "drawable", context.getPackageName());
        if (imageResourceId != 0) {
            holder.imageView.setImageResource(imageResourceId);
        } else {
            holder.imageView.setImageResource(R.drawable.ic_launcher_background);
        }

        holder.textName.setText(currentChien.getName());
        holder.textRace.setText(currentChien.getRace());
        holder.textOrigin.setText(currentChien.getOrigin());

        return convertView;
    }

    private static class ViewHolder {
        ImageView imageView;
        TextView textName;
        TextView textRace;
        TextView textOrigin;
    }
}
