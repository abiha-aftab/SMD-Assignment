package com.example.signupactivity;

import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.tabs.TabLayout;
import com.example.signupactivity.ui.main.SectionsPagerAdapter;
import androidx.appcompat.widget.Toolbar;


public class Main2Activity extends AppCompatActivity {
    private int [] tabIcons={
            R.drawable.ic_favorite_black_24dp,
            R.drawable.ic_call_black_24dp,
            R.drawable.ic_settings_black_24dp,
            R.drawable.ic_person_black_24dp
    };
    private TabLayout tabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        setupTabIcons();
        //getActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private void setupTabIcons() {
        tabs.getTabAt(0).setIcon(tabIcons[0]);
        tabs.getTabAt(1).setIcon(tabIcons[1]);
        tabs.getTabAt(2).setIcon(tabIcons[2]);
        tabs.getTabAt(3).setIcon(tabIcons[3]);
    }

}