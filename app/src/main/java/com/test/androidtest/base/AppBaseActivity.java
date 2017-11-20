package com.test.androidtest.base;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/11/20.
 */

public class AppBaseActivity extends Activity {

    public Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;

        //注解@Bind
        ButterKnife.bind(this);
    }



}
