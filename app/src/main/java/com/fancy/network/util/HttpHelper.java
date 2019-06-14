package com.fancy.network.util;

import com.fancy.network.callback.ICallback;
import com.fancy.network.processor.IProcessor;

import java.util.Map;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public class HttpHelper implements IProcessor {
    private static IProcessor processor;

    private HttpHelper() {
    }

    @Override
    public void getUrl(String url, Map<String, Object> map, ICallback callback) {
        processor.getUrl(url, map, callback);
    }

    @Override
    public void postUrl(String url, Map<String, Object> map, ICallback callback) {
        processor.postUrl(url, map, callback);
    }

    private static class InnerObject {
        private static HttpHelper instance = new HttpHelper();
    }

    public static HttpHelper getInstance() {
        return InnerObject.instance;
    }

    public static void init(IProcessor p) {
        processor = p;
    }
}
