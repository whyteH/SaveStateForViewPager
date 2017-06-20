package com.example.whyte.savestateforviewpager;

import android.support.v4.app.FragmentManager;

/**
 * Created by Whyte on 2017/6/20.
 */

public class MainPagerAdapter extends BaseFragmentPagerAdapter {

    private final String[] TITLES = {
            "tab1",
            "tab2",
    };

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public void initFragments() {
        addFragment(MyFragment.getInstance("1111111"));
        addFragment(MyFragment.getInstance("2222222"));
    }

    @Override
    protected String getKey() {
        return "tab:";
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    public MyFragment getFragment() {
        return (MyFragment) getItem(0);
    }

    @Override
    protected int getFragmentCount() {
        return TITLES.length;
    }
}
