package com.fancy.network.processor;

import com.fancy.network.callback.ICallback;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public class OkHttpProcessor implements IProcessor {
    String json = "{\n" +
            "        \"respTime\":1560480466561,\n" +
            "        \"respCode\":\"0000\",\n" +
            "        \"respMsg\":\"接口调用成功\",\n" +
            "        \"data\":{\n" +
            "            \"unpaid\":0,\n" +
            "            \"undelivered\":14,\n" +
            "            \"dispatched\":0\n" +
            "        }\n" +
            "    }";

    @Override
    public void getUrl(String url, final ICallback callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    callback.onSuccess(json);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public void postUrl(String url, ICallback callback) {
    }
}
