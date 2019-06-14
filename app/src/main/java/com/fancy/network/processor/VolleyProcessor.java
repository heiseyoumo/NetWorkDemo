package com.fancy.network.processor;

import com.fancy.network.callback.ICallback;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public class VolleyProcessor implements IProcessor {
    @Override
    public void getUrl(String url, ICallback callback) {
        callback.onSuccess(url);
    }

    @Override
    public void postUrl(String url, ICallback callback) {

    }
}
