package com.schwifty.priyank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plus_search_final);

        LayoutInflater inflater = LayoutInflater.from(this);
        LinearLayout ParentElementGroups = findViewById(R.id.UniversityContainer);

        for(int i = 0; i< 14; i++) {
            View mView = inflater.inflate(R.layout.inflate_suggestedgps, null, false);
            ParentElementGroups.addView(mView);
        }

    }
}
