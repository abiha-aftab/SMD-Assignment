package com.example.signupactivity.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.signupactivity.R;
import com.example.signupactivity.frag1;
import com.example.signupactivity.frag2;
import com.example.signupactivity.frag3;
import com.example.signupactivity.frag4;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3,R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new frag1();
                break;
            case 1:
                fragment = new frag2();
                break;
            case 2:
                fragment = new frag3();
                break;
            case 3:
                fragment = new frag4();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Linear Layout";
            case 1:
                return "Relative Layout";
            case 2:
                return "Constraint Layout";
            case 3:
                return "Frame Layout";
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}