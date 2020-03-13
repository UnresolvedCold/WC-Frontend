package com.schwifty.priyank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class profile2_not_decided extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile2_not_decided);
        final LayoutInflater inflater = LayoutInflater.from(this);
        final LinearLayout ParentElementGroups = findViewById(R.id.CourseList);

        findViewById(R.id.AddCourse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                findViewById(R.id.NextButton).setBackgroundResource(R.drawable.frame_2);

                View mView = inflater.inflate(R.layout.inflate_course_list, null, false);
                ((TextView)mView.findViewById(R.id.course_name)).setText("Masters in Computer Science");

                ParentElementGroups.addView(mView);

            }
        });


    }
}
