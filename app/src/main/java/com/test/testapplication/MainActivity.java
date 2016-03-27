package com.test.testapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.test.testapplication.model.DataProvider;
import com.test.testapplication.util.ActivitySwitchHelper;
import com.test.testapplication.util.BasicCallBack;
import com.test.testapplication.views.UniversalPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySwitchHelper.setContext(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /*
        * Here I have assumed we have data from network response using retrofit.
        * Provide a callback to change the Month Lable when users
        * changes the page and jumps to another month.
        * */
        UniversalPager pager = (UniversalPager)findViewById(R.id.main_pager);
        pager.fill(DataProvider.getNetworkResponse(), getChangeMonthLableCallBack());
    }

    private BasicCallBack getChangeMonthLableCallBack() {
        return new BasicCallBack() {
            @Override
            public void callBack(Object data) {
                if ( data != null && data instanceof String ){
                    TextView monthLable = (TextView) findViewById(R.id.month_lable);
                    monthLable.setText((String) data);
                }
            }
        };

    }
}
