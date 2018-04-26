package com.example.hania.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.hania.tourguideapp.OldTownFragment;
import com.example.hania.tourguideapp.MuseumFragment;
import com.example.hania.tourguideapp.RestaurantFragment;
import com.example.hania.tourguideapp.PublicTransportFragment;


/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class MySimpleAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public MySimpleAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new OldTownFragment();
        } else if (position == 1){
            return new MuseumFragment();
        } else if (position == 2){
            return new RestaurantFragment();
        } else {
            return new PublicTransportFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.old_town);
        } else if (position == 1) {
            return mContext.getString(R.string.museum);
        } else if (position == 2) {
            return mContext.getString(R.string.restaurants);
        } else {
            return mContext.getString(R.string.public_transport);
        }
    }
}
