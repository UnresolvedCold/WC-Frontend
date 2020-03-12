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
        setContentView(R.layout.chat_final);

        LayoutInflater inflater = LayoutInflater.from(this);
        LinearLayout ParentElement = findViewById(R.id.chat_final_chats_container);

        for(int i = 0; i< 10; i++) {
            View mView = inflater.inflate(R.layout.inflate_chats, null, false);
            ParentElement.addView(mView);
        }
    }
}
