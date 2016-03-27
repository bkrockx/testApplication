package com.test.testapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.test.testapplication.fragment.SlotBookingFragment;
import com.test.testapplication.model.UniversalPagerObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bablu on 20/03/16.
 */

/*
* Creates an Adaptor object for  UniversalViewPager, and
* RecyclerView in each Page along with Expandable Adapter.
*
* This object can be used anywhere to show viewPager with list data.
* */
public class UniversalPagerAdapter extends FragmentPagerAdapter {
    List<UniversalPagerObject> list = new ArrayList<>();

    public UniversalPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return  list.size();
    }


    public void fill(List<UniversalPagerObject> list){
        this.list = list;
        notifyDataSetChanged();
    }


    @Override
    public Fragment getItem(int position) {
        SlotBookingFragment slotBookingFragment = new SlotBookingFragment();
        slotBookingFragment.setData(list.get(position).getQuarterlySlotList());
        return  slotBookingFragment ;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String empty = "";
        if (list == null || list.size() <= position) return empty;
        String title = list.get(position).getTitle();
        return title == null ? empty: title;
    }

}
