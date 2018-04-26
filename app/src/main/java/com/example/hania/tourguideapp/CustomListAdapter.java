package com.example.hania.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class CustomListAdapter extends ArrayAdapter<Location>{
    private int mSubcat;

    public CustomListAdapter(Activity context, ArrayList<Location> locations, int subcat) {
        super(context, 0, locations);
        mSubcat = subcat;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemview = convertView;
        if(listItemview == null) {
            listItemview = LayoutInflater.from(getContext()).inflate(
                    R.layout.my_list_layout, parent, false);
        }

        Location currentLocation = getItem(position);
        TextView nameTextView = listItemview.findViewById(R.id.text1);
        nameTextView.setText(currentLocation.getName());

        TextView adresTextView = listItemview.findViewById(R.id.text2);
        adresTextView.setText(currentLocation.getAdres());

        ImageView imgView = listItemview.findViewById(R.id.image1);
        if(currentLocation.hasImage()) {
            imgView.setImageResource(currentLocation.getImg());
        }
        else {
            imgView.setVisibility(View.GONE);
        }

        TextView subcatTextView = listItemview.findViewById(R.id.text3);
        subcatTextView.setText(getContext().getString(mSubcat));

        return listItemview;
    }
}
