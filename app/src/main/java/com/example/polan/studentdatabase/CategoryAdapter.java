package com.example.polan.studentdatabase;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by polan on 21-09-2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "GPA", "INTERNALS", "ATTENDANCE"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GpaFragment();
        } else if (position == 1) {
            return new InternalsFragment();
        }
        else{
            return new AttendanceFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
