package com.fancy.network;

import android.app.Application;

import com.fancy.network.processor.OkHttpProcessor;
import com.fancy.network.util.HttpHelper;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HttpHelper.init(new OkHttpProcessor());
    }
}
