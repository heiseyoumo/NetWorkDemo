package com.fancy.network.interceptor;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public class LogInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        request.method();
        RequestBody body = request.body();
        Response response = chain.proceed(request);
        return response;
    }
}
