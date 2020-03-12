package com.schwifty.priyank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
import com.synnapps.carouselview.ViewListener;

public class MainActivity extends AppCompatActivity {

    CarouselView customCarouselView;
    int NUMBER_OF_PAGES = 3;

    int[] onboardingImg = {R.drawable.onboarding1,R.drawable.onboarding2,R.drawable.onboarding1};

    String[] onboardingTxt1= {"Exclusive Community","Connect with seniors & aspirants","Everything you need"};

    String[] onboardingTxt2 = {"Community of study abroad aspirants, admits and seniors. No Spammers!",
           "Complete your profile and connect with similar student profiles",
            "Everything you need for your abroad education all in one place"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboard);

        customCarouselView = (CarouselView) findViewById(R.id.carouselView);
        customCarouselView.setPageCount(NUMBER_OF_PAGES);
        // set ViewListener for custom view
        customCarouselView.setViewListener(viewListener);
    }

    ViewListener viewListener = new ViewListener() {

        @Override
        public View setViewForPosition(int position) {
            View customView = getLayoutInflater().inflate(R.layout.inflate_onboard, null);

            TextView labelTextView1 = (TextView) customView.findViewById(R.id.onboarding_text1);
            TextView labelTextView2 = (TextView) customView.findViewById(R.id.onboarding_text2);
            ImageView imageView = (ImageView) customView.findViewById(R.id.onboarding_image);

            imageView.setImageResource(onboardingImg[position]);
            labelTextView1.setText(onboardingTxt1[position]);
            labelTextView2.setText(onboardingTxt2[position]);

            return customView;
        }
    };

}
