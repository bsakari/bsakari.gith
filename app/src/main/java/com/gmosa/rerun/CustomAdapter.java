package com.gmosa.rerun;

/**
 * Created by emobilis on 4/25/18.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by emobilis on 4/24/18.
 */

public class CustomAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<Item> data;//modify here

    public CustomAdapter(Context mContext, ArrayList<Item> data) {
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();// # of items in your arraylist
    }
    @Override
    public Object getItem(int position) {
        return data.get(position);// get the actual item
    }
    @Override
    public long getItemId(int id) {
        return id;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_layout, parent,false);//modify here
            viewHolder = new ViewHolder();
            //modify this block of code
            viewHolder.tvname = (TextView) convertView.findViewById(R.id.TextView1);
            viewHolder.tvyear = (TextView) convertView.findViewById(R.id.TextView2);
            viewHolder.tvdescription = (TextView) convertView.findViewById(R.id.TextView3);
            viewHolder.imageView=(ImageView) convertView.findViewById(R.id.imageView);
            //Up to here
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //MODIFY THIS BLOCK OF CODE
        Item person = data.get(position);//modify here
        viewHolder.tvname.setText(person.getName());//modify here
        //viewHolder.tvyear.setText(person.getYear());//modify here
        viewHolder.tvdescription.setText(person.getDescription());//modify here
        viewHolder.imageView.setImageResource(person.getPoster());
        return convertView;

    }
    static class ViewHolder {
        TextView tvname;
        TextView tvyear;
        TextView tvdescription;//These don't have to be same names as the Id's
        //MODIFY THIS BLOCK OF CODE
        //TextView textViewTitle;
        ImageView imageView;
    }

}