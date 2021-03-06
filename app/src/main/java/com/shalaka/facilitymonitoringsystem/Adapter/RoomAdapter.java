package com.shalaka.facilitymonitoringsystem.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.shalaka.facilitymonitoringsystem.R;

public class RoomAdapter extends BaseAdapter {
    Context context;

    public RoomAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return thumbImages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.gridview_item, null);
            viewHolder = new ViewHolder();
            viewHolder.imageView = convertView.findViewById(R.id.imageView);
            viewHolder.imageView.setImageResource(thumbImages[position]);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }

        return convertView;
    }

    class ViewHolder{
        ImageView imageView;
    }

    public Integer [] thumbImages = {
            R.drawable.ic_assets,R.drawable.ic_assets,R.drawable.ic_assets
    };
}
