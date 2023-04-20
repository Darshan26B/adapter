package com.darshan.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class NameAdapter extends BaseAdapter {
    int[] image;
    public NameAdapter(int[] image) {
        this.image=image;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.work,viewGroup,false);
        ImageView hello=view.findViewById(R.id.hello);

        Glide.with(viewGroup.getContext()).load(image[i]).into(hello);
        return view;
    }
}
