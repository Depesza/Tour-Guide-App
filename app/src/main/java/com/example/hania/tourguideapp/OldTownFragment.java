package com.example.hania.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class OldTownFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getContext().getString(R.string.neptun), getContext().getString(R.string.neptunA), R.drawable.neptun));
        locations.add(new Location(getContext().getString(R.string.soldek), getContext().getString(R.string.soldekA), R.drawable.soldek));
        locations.add(new Location(getContext().getString(R.string.zuraw), getContext().getString(R.string.zurawA), R.drawable.zuraw));
        locations.add(new Location(getContext().getString(R.string.bazylika), getContext().getString(R.string.bazylikaA), R.drawable.bazylika));
        locations.add(new Location(getContext().getString(R.string.ratusz), getContext().getString(R.string.ratuszA), R.drawable.ratusz));
        locations.add(new Location(getContext().getString(R.string.stocznia), getContext().getString(R.string.stoczniaA), R.drawable.stocznia));

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), locations, R.string.address);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
