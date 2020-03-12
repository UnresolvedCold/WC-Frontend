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
        setContentView(R.layout.group_chat_final);

        LayoutInflater inflater = LayoutInflater.from(this);
        LinearLayout ParentElementGroups = findViewById(R.id.chat_container);

        String[] names = new String [] {"Priyank", "Ranjit", "Soumya"};

        String[] arr = new String [] {"Hello", "Hi", "Have you guys booked your visa appointment already",
        "Yes I did","Yeah me too!", "yes","When is your appointment and in which city?",
        "2nd April, Canadian Embassy New Delhi", "Mine is on 5th April in Mumbai","Yeah, Sure" };

        for(int i = 0; i< arr.length; i++) {

            if(i%2 == 0) {
                View mView = inflater.inflate(R.layout.inflate_chat_me, null, false);
                ((TextView)mView.findViewById(R.id.mine_message)).setText(arr[i]);
                ParentElementGroups.addView(mView);
            }
            else
            {
                View mView = inflater.inflate(R.layout.inflate_chat_others, null, false);
                ((TextView)mView.findViewById(R.id.others_message)).setText(arr[i]);
                ((TextView)mView.findViewById(R.id.others_name)).setText(names[i%3]);

                ParentElementGroups.addView(mView);
            }
        }

    }
}
