package com.fancy.network.processor;

import com.fancy.network.callback.ICallback;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public interface IProcessor {

    void getUrl(String url, ICallback callback);

    void postUrl(String url, ICallback callback);
}
