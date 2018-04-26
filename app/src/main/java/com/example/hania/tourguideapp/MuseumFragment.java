package com.example.hania.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getContext().getString(R.string.II_w_s), getContext().getString(R.string.II_w_sA)));
        locations.add(new Location(getContext().getString(R.string.archeologiczne), getContext().getString(R.string.archeologiczneA)));
        locations.add(new Location(getContext().getString(R.string.dworartusa), getContext().getString(R.string.dworartusaA)));
        locations.add(new Location(getContext().getString(R.string.ECS), getContext().getString(R.string.ECSA)));
        locations.add(new Location(getContext().getString(R.string.narodowe), getContext().getString(R.string.narodoweA)));
        locations.add(new Location(getContext().getString(R.string.morskie), getContext().getString(R.string.morskieA)));
        locations.add(new Location(getContext().getString(R.string.hewelianum), getContext().getString(R.string.hewelianumA)));

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), locations, R.string.address);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

