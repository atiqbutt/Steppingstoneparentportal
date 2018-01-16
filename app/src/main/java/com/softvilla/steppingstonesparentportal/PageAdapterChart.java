package com.softvilla.steppingstonesparentportal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Malik on 07/08/2017.
 */

public class PageAdapterChart extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PageAdapterChart(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                CurrentMonth currentMonth = new CurrentMonth();
                return currentMonth;
            case 1:
                PreviousMonth previousMonth = new PreviousMonth();
                return previousMonth;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
