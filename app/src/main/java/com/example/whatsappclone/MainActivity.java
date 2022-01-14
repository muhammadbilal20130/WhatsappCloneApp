package com.example.whatsappclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.pagerView);
        tabLayout=findViewById(R.id.tabLayout);

        viewPager.setAdapter(new FragmentsAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

    }
}