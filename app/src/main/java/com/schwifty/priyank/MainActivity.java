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
        setContentView(R.layout.suggestedstudents_final);

        LayoutInflater inflater = LayoutInflater.from(this);
        LinearLayout ParentElementGroups = findViewById(R.id.suggestedgroups_final_suggested_students_container);
//        LinearLayout ParentElementStudents = findViewById(R.id.plus_final_suggested_students_container);
//
//
        for(int i = 0; i< 14; i++) {
            View mView = inflater.inflate(R.layout.inflate_suggestedstds, null, false);
            ParentElementGroups.addView(mView);
        }
//
//        for(int i = 0; i< 4; i++) {
//            View mView = inflater.inflate(R.layout.inflate_suggestedstds, null, false);
//            ParentElementStudents.addView(mView);
//        }
    }
}
