package com.example.macmine.movingtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import java.util.ArrayList;

/**
 * Created by Ajay Mehta on 10/8/2017.
 */

public class MyAdapter extends FragmentStatePagerAdapter {


    //    private static int TAB_COUNT = 3;
    ArrayList<String> subCategories;
    ArrayList<Integer> numbers;

    public MyAdapter(FragmentManager fm, ArrayList<String> subCategories, ArrayList<Integer> numbers) {
        super(fm);
       this.subCategories = subCategories;
        this.numbers = numbers;
    }

    // i have used one fragment u can use diffenent no of fragment according to your need....
    //==== using only one fragment really comes in handy..when all the tabs have screen views ..they just need differnt set of data on it ...like getting list of differnt things...===========

    @Override
    public Fragment getItem(int position) { // you just need one fragment here .....just send data to this fragment according to position...n use it simple...by sending through bundle for all the tabs...
        Bundle bundle = new Bundle();
        bundle.putInt("mNumbers", numbers.get(position));  // it will take data according to positions..

        BlankFragment blankFragment = new BlankFragment();
        blankFragment.setArguments(bundle);

        return blankFragment;
    }

    @Override
    public int getCount() {
        return subCategories.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {  // creating titles static not coming from the server...
        return subCategories.get(position);
    }
}
