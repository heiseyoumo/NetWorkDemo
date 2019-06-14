package com.fancy.network.processor;

import com.fancy.network.callback.ICallback;

import java.util.Map;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public interface IProcessor {

    void getUrl(String url, Map<String,Object> map, ICallback callback);

    void postUrl(String url, Map<String,Object> map, ICallback callback);
}
