package com.example.hania.tourguideapp;

/**
 * Created by hania on 25.04.18.
 */

public class Location {
    private String mName;
    private String mAdres;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String name, String adres, int img){
        mName = name;
        mAdres = adres;
        mImageResourceId = img;
    }

    public Location(String name, String adres){
        mName = name;
        mAdres = adres;
    }

    public String getName(){
        return mName;
    }

    public String getAdres(){
        return mAdres;
    }

    public int getImg(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
