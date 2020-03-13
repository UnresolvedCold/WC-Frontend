package com.schwifty.priyank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;

public class MainActivity extends AppCompatActivity {

    CarouselView customCarouselView;
    int [] onboardScreens = {R.layout.inflate_onboard1,R.layout.inflate_onboard2,R.layout.inflate_onboard3};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboard);

        customCarouselView = (CarouselView) findViewById(R.id.carouselView);
        customCarouselView.setPageCount(onboardScreens.length);
        // set ViewListener for custom view
        customCarouselView.setViewListener(viewListener);
    }

    ViewListener viewListener = new ViewListener() {

        @Override
        public View setViewForPosition(int position) {
            View customView = getLayoutInflater().inflate(onboardScreens[position], null);
            return customView;
        }
    };

}
