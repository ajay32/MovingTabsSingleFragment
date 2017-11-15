package com.example.macmine.movingtabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


  TextView myNumbers;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        init(v);
        return v;
    }

    private void init(View v) {

        myNumbers = (TextView) v.findViewById(R.id.tv_text);


        int number = getArguments().getInt("mNumbers");

        myNumbers.setText(String.valueOf(number));


    }

}
