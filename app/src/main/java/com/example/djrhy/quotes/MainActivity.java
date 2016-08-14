package com.example.djrhy.quotes;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;

import butterknife.BindView;
import butterknife.ButterKnife;
import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    AsyncHttpClient client = new AsyncHttpClient();
    Response responseObj;
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);
        pager = (ViewPager)findViewById(R.id.viewPager);
        client.get("http://192.168.1.9:3000/api/get", new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                Gson gson = new Gson();
                responseObj = gson.fromJson(responseString, Response.class);
                pager.setAdapter(new QuotesAdapter(getApplicationContext(), responseObj.getQuotes()));
                pager.setPageTransformer(true,new ParallaxPageTransformer());
                pager.setPageMargin(10);
                pager.setPageMarginDrawable(android.R.color.black);
            }
        });
    }
}
