package com.example.anshuman_hp.inshorts;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ViewPager pager;
    pagerAdapter pagerAdapter;
    fetchNews fetchNews;

    public static ArrayList<newsObject> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fetchNews=new fetchNews(HomeActivity.this);

        fetchNews.execute();

        pager=(ViewPager)findViewById(R.id.pager);
        pagerAdapter=new pagerAdapter(getApplicationContext());

        pager.setAdapter(pagerAdapter);


    }
}
