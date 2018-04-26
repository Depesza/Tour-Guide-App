package com.example.hania.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PublicTransportFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getContext().getString(R.string.tram), getContext().getString(R.string.tramL)));
        locations.add(new Location(getContext().getString(R.string.bus), getContext().getString(R.string.busL)));
        locations.add(new Location(getContext().getString(R.string.nbus), getContext().getString(R.string.nbusL)));
        locations.add(new Location(getContext().getString(R.string.ferry), getContext().getString(R.string.ferryL)));
        locations.add(new Location(getContext().getString(R.string.train), getContext().getString(R.string.trainL)));

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), locations, R.string.lines);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
