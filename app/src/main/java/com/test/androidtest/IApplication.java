package com.test.androidtest;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/11/20.
 */

public class IApplication extends Application {
    private Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;

    }
}
