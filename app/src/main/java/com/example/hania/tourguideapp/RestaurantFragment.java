package com.example.hania.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getContext().getString(R.string.ritz), getContext().getString(R.string.ritzA)));
        locations.add(new Location(getContext().getString(R.string.bazar), getContext().getString(R.string.bazarA)));
        locations.add(new Location(getContext().getString(R.string.winnegrono), getContext().getString(R.string.winnegronoA)));
        locations.add(new Location(getContext().getString(R.string.pomelo), getContext().getString(R.string.pomeloA)));
        locations.add(new Location(getContext().getString(R.string.correze), getContext().getString(R.string.correzeA)));
        locations.add(new Location(getContext().getString(R.string.pazzi), getContext().getString(R.string.pazziA)));

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), locations, R.string.address);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

