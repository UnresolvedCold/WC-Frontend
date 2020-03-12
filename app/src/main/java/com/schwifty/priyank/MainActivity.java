package com.schwifty.priyank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group_details_android);

        LayoutInflater inflater = LayoutInflater.from(this);
        LinearLayout ParentElementGroups = findViewById(R.id.groupdetails_members_container);

        for(int i = 0; i< 5; i++) {
            View mView = inflater.inflate(R.layout.inflate_suggestedstds, null, false);
            ParentElementGroups.addView(mView);
        }


    }
}
