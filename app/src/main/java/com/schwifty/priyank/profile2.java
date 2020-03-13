package com.schwifty.priyank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class profile2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile2);

        LayoutInflater inflater = LayoutInflater.from(this);
        LinearLayout ParentElementGroups = findViewById(R.id.UniversitiesList);

        if(StaticClass.countUniv>0) findViewById(R.id.NextButton).setBackgroundResource(R.drawable.frame_2);

        for(int i = 0; i< StaticClass.countUniv; i++) {
            View mView = inflater.inflate(R.layout.inflate_universities_list, null, false);
            ((TextView)mView.findViewById(R.id.univ_name)).setText(StaticClass.SelectedUniversities[i]);
            ((TextView)mView.findViewById(R.id.univ_slogan)).setText(StaticClass.SelectedUniversitiesSlogan[i]);

            ParentElementGroups.addView(mView);
        }

        findViewById(R.id.AddUniversity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i = new Intent (profile2.this,profile2_0.class);
                    startActivity(i);
            }
        });
    }
}
