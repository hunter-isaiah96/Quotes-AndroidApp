package com.example.djrhy.quotes;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by djrhy on 8/8/2016.
 */
public class QuotesAdapter extends PagerAdapter{

    List<Response.QuotesBean> quotes;

    private Context mContext;

    public QuotesAdapter(Context context, List<Response.QuotesBean> quotes){
        mContext = context;
        this.quotes = quotes;
    }

    @Override
    public int getCount() {
        return quotes.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return o==view;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.quote, container, false);
        Response.QuotesBean qb = quotes.get(position);
        ImageView image = (ImageView)layout.findViewById(R.id.imageView);
        TextView text = (TextView)layout.findViewById(R.id.textView);
        TextView quoter = (TextView)layout.findViewById(R.id.textView2);
        Glide.with(mContext).load(qb.getQuoter_image().getUrl()).centerCrop().into(image);
        text.setText(qb.getQuote());
        quoter.setText("- " + qb.getQuoter());
        container.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //cast to LinearLayout
        container.removeView((RelativeLayout)object);
    }

}
