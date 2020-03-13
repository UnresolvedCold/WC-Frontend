package com.schwifty.priyank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;

public class MainActivity extends AppCompatActivity {

    CarouselView customCarouselView;

    //List of screens to preview
    int [] onboardScreens = {
            R.layout.inflate_onboard1,
            R.layout.inflate_onboard2,
            R.layout.inflate_onboard3   };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile1);

        findViewById(R.id.NextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, profile2.class);
                startActivity(i);
            }
        });

    }

}
