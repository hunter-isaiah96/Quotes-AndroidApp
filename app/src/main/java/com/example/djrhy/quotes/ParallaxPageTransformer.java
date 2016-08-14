package com.example.djrhy.quotes;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ParallaxPageTransformer implements ViewPager.PageTransformer {

	public void transformPage(View view, float position) {
		
		int pageWidth = view.getWidth();
		TextView text = (TextView)view.findViewById(R.id.textView);
		TextView text2 = (TextView)view.findViewById(R.id.textView2);
		ImageView image = (ImageView)view.findViewById(R.id.imageView);

		if (position < -1){
			view.setAlpha(1);
		} else if (position <= 1) {// [-1,1]
			image.setTranslationX(-position * (pageWidth / 2)); //Half the normal speed
			text.setTranslationX(position * (pageWidth / 2));
			text2.setTranslationX(position * (pageWidth * 2));
		} else {
			view.setAlpha(1);
		}
	}
}