package com.example.macmine.movingtabs;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;


// TO make tablayout movie...you just need to put it in the cordinator layout....in xml file ..simple  use Cordinator layout to create anything type of scrolling animation in xml file...


public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private Toolbar mToolbar;
    private MyAdapter mViewPagerAdapter;
    private TabLayout mTabLayout;
   ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> numbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names.add("Fruits");
        names.add("Vegitables");
        names.add("Books");
        names.add("Crockery");
        names.add("Names");
        names.add("Cars");
        names.add("Bottles");
        names.add("Bags");

        //==========================

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);



        //==========================

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mToolbar.setTitleTextColor(getResources().getColor(R.color.colorAccent));
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("TabsExample");
        }


        //=======================
        setViewPager();  // if page title are coming from server ..then first get all the page title n then call this setVIewPager() method from that api...so all the tabs are gonna generate dynamically..


    }  // end of oncreate


    private void setViewPager() {

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPagerAdapter = new MyAdapter(getSupportFragmentManager(),names , numbers);
        mViewPager.setAdapter(mViewPagerAdapter);
        mTabLayout = (TabLayout) findViewById(R.id.tab);
        mTabLayout.setupWithViewPager(mViewPager);
    }

}
