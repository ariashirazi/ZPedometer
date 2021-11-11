package com.ariashirazi.zpedometer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean isOpenMoreRapidCV = false;
    private CardView moreCV;
    private TextView moreTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        setupView();
        onClick();



    }

    private void onClick() {

        moreTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openAndCloseMoreRapidLL();

            }
        });

    }

    private void setupView() {

        moreCV = findViewById(R.id.moreCV);
        moreTV = findViewById(R.id.moreTV);

    }

    public void openAndCloseMoreRapidLL(){

        if (isOpenMoreRapidCV){

            moreCV.animate().translationY(320).setDuration(500).start();
            isOpenMoreRapidCV = false;

        }else {

            moreCV.animate().translationY(32).setDuration(500).start();
            isOpenMoreRapidCV = true;

        }

    }


}