package com.fancy.network.processor;

import android.os.Handler;
import android.os.Looper;

import com.fancy.network.callback.ICallback;
import com.fancy.network.interceptor.LogInterceptor;

import java.io.IOException;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public class OkHttpProcessor implements IProcessor {
    private Handler handler = new Handler(Looper.getMainLooper());
    OkHttpClient okHttpClient;

    public OkHttpProcessor() {
        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
        builder.addInterceptor(new LogInterceptor());
        okHttpClient = builder.build();
    }

    @Override
    public void getUrl(String url, Map<String, Object> map, final ICallback callback) {
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
    public void postUrl(String url, Map<String, Object> map, final ICallback callback) {
        RequestBody requestBody = appendParams(map);
        final Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
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


    public RequestBody appendParams(Map<String, Object> params) {
        FormBody.Builder builder = new FormBody.Builder();
        if (params == null || params.isEmpty()) {
            return builder.build();
        }
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            builder.add(entry.getKey(), entry.getValue().toString());
        }
        return builder.build();
    }
}
