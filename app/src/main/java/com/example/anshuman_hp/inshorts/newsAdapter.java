package com.example.anshuman_hp.inshorts;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Anshuman-HP on 08-09-2017.
 */

public class newsAdapter extends RecyclerView.Adapter<NewsHolder> {
    Context ctx;
    int pageNum;

    public newsAdapter(Context ctx,int pageNum) {
        this.ctx = ctx;
        this.pageNum=pageNum*20;
    }

    @Override
    public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(ctx).inflate(R.layout.news_card,parent,false);
        return new NewsHolder(v);
    }

    @Override
    public void onBindViewHolder(NewsHolder holder, int position) {

        holder.category.setText(HomeActivity.list.get(pageNum+position).getCATEGORY());
        holder.publishedby.setText(HomeActivity.list.get(pageNum+position).getPUBLISHER());
        holder.title.setText(HomeActivity.list.get(pageNum+position).getTITLE());
        holder.url.setText(HomeActivity.list.get(pageNum+position).getURL());
    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
