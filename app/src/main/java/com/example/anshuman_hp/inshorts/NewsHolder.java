package com.example.anshuman_hp.inshorts;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Anshuman-HP on 08-09-2017.
 */

public class NewsHolder extends RecyclerView.ViewHolder {
    TextView title,url,timestamp,publishedby,category;
    public NewsHolder(View itemView) {
        super(itemView);

        timestamp=(TextView)itemView.findViewById(R.id.timeStampCard);
        title=(TextView)itemView.findViewById(R.id.titleCard);
        url=(TextView)itemView.findViewById(R.id.UrlCard);
        publishedby=(TextView)itemView.findViewById(R.id.PublishedCard);
        category=(TextView)itemView.findViewById(R.id.CategoryCard);
    }
}
