package com.example.anshuman_hp.inshorts;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Anshuman-HP on 08-09-2017.
 */

public class pagerAdapter extends PagerAdapter {

    Context ctx;


    public pagerAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return (HomeActivity.list.size()/20);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
         return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = LayoutInflater.from(ctx).inflate(R.layout.news_list,container,false);
        RecyclerView newsList=(RecyclerView)itemView.findViewById(R.id.newsList);
        newsList.setLayoutManager(new LinearLayoutManager(ctx));
        newsAdapter adapter=new newsAdapter(ctx,position);
        newsList.setAdapter(adapter);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        container.removeView((LinearLayout) object);
    }
}
