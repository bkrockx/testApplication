package com.test.testapplication.util;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.test.testapplication.MainActivity;

/**
 * Created by bablu on 20/03/16.
 */
public class ActivitySwitchHelper {
    public static Context getContext() {
        return context;
    }

    static Context context;
    private static FragmentManager fragmentManager;

    public static FragmentManager getFragmentManager() {
        if (fragmentManager == null) {
            fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        }
        return fragmentManager;
    }


    public static void setContext(MainActivity context) {
        ActivitySwitchHelper.context = context;
    }
}
