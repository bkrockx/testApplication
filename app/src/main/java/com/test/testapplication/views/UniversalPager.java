package com.test.testapplication.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.astuetz.PagerSlidingTabStrip;
import com.test.testapplication.R;
import com.test.testapplication.adapter.UniversalPagerAdapter;
import com.test.testapplication.model.UniversalPagerObject;
import com.test.testapplication.util.ActivitySwitchHelper;
import com.test.testapplication.util.BasicCallBack;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by bablu on 19/03/16.
 */
public class UniversalPager extends LinearLayout {

    ViewPager pager;


    public UniversalPager(Context context) {
        super(context);
        init(context);
    }

    public UniversalPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public UniversalPager(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public UniversalPager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.universal_pager_layout, this, true);
    }

    public void fill(final List<UniversalPagerObject> list, final BasicCallBack changeMonthLableCallBack){

        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        UniversalPagerAdapter adapter = new UniversalPagerAdapter(ActivitySwitchHelper.getFragmentManager());
        pager = (ViewPager) findViewById(R.id.pager_universal_pager_layout);
        pager.setAdapter(adapter);
        tabs.setShouldExpand(true);
        adapter.fill(list);
        tabs.setViewPager(pager);
        tabs.notifyDataSetChanged();

        if (changeMonthLableCallBack != null){
            changeMonthLableCallBack.callBack(new SimpleDateFormat("MMM").format(list.get(0)
                    .getDate().getTime()));
        }

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (changeMonthLableCallBack != null){
                    changeMonthLableCallBack.callBack(new SimpleDateFormat("MMM").format(list.get(position)
                            .getDate().getTime()));
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }
}
