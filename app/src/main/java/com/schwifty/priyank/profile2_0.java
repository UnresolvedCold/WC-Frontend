package com.schwifty.priyank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class profile2_0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile2_0);
        VirtualRadioButton();

        findViewById(R.id.profile_2_0_NextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText eu = findViewById(R.id.university_2);
                EditText ec = findViewById(R.id.course_2);

                StaticClass.SelectedUniversities[StaticClass.countUniv] = eu.getText().toString();
                StaticClass.SelectedUniversitiesSlogan[StaticClass.countUniv] = ec.getText().toString();
                StaticClass.countUniv++;

                Intent intent = new Intent(profile2_0.this, profile2.class);
                startActivity(intent);

            }
        });


    }


    // Required Functions
    void VirtualRadioButton()
    {
        final View [] gp = {
                findViewById(R.id.group_107),
                findViewById(R.id.group_111),
                findViewById(R.id.group_112),
                findViewById(R.id.group_113)};

        final TextView [] tv =
                {
                    findViewById(R.id.label107),
                    findViewById(R.id.label111),
                    findViewById(R.id.label112),
                    findViewById(R.id.label113)
                };

        final View ApplicationDate = findViewById(R.id.ApplicationDateContainer);
        final View ExtraDate = findViewById(R.id.ExtraDateContainer);
        final TextView ApplicationDateLabel = findViewById(R.id.ApplicationDateLabel);
        final TextView ExtraDateLabel = findViewById(R.id.ExtraDateLabel);

        ApplicationDate.setVisibility(View.GONE);
        ExtraDate.setVisibility(View.GONE);

        for (int ele =0 ;ele < gp.length;ele++)
        {
            final int i = ele;
            gp[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    gp[i].setBackgroundResource(R.drawable.frame_2);
                    tv[i].setTextColor(Color.parseColor("#FFFFFF"));
                    for(int j=0 ;j<gp.length;j++)
                    {
                        if(j!=i)
                        {
                            gp[j].setBackgroundResource(R.drawable.rectangle_6a);
                            tv[j].setTextColor(Color.parseColor("#333333"));

                        }

                    }

                    switch (i)
                    {
                        case 0:
                            ApplicationDate.setVisibility(View.VISIBLE);
                            ExtraDate.setVisibility(View.VISIBLE);
                            ExtraDateLabel.setText("Admit Date");
                            break;
                        case 1:
                            ApplicationDate.setVisibility(View.VISIBLE);
                            ExtraDate.setVisibility(View.VISIBLE);
                            ExtraDateLabel.setText("Reject Date");

                            break;
                        case 2:
                            ApplicationDate.setVisibility(View.GONE);
                            ExtraDate.setVisibility(View.GONE);
                            break;
                        case 3:
                            ApplicationDate.setVisibility(View.VISIBLE);
                            ExtraDate.setVisibility(View.GONE);
                            ExtraDateLabel.setText("Reject Date");
                            break;

                    }

                }


            });
        }

    }
}
