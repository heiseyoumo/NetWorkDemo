package com.fancy.network.processor;

import android.os.Handler;
import android.os.Looper;

import com.fancy.network.callback.ICallback;

import java.io.IOException;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

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

    private Handler handler = new Handler(Looper.getMainLooper());
    OkHttpClient okHttpClient;

    public OkHttpProcessor() {
        okHttpClient = new OkHttpClient();
    }


    @Override
    public void getUrl(String url, final ICallback callback) {
        final Request request = new Request.Builder()
                .url(url)
                .addHeader("User-Agent", "a")
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        callback.onFail(e.getMessage());
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String result = response.body().string();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        callback.onSuccess(result);
                    }
                });
            }
        });
    }

    @Override
    public void postUrl(String url, ICallback callback) {

    }


    public void appendParams(Map<String, Object> map) {

    }
}
