package com.fancy.network.callback;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public abstract class HttpResponseCallback<T> implements ICallback {
    @Override
    public void onSuccess(String response) {
        Gson gson = new Gson();
        Type type = this.getClass().getGenericSuperclass();
        Type[] arguments = ((ParameterizedType) type).getActualTypeArguments();
        T result = gson.fromJson(response, arguments[0]);
        onSuccess(result);
    }

    /**
     * 将返回的json数据解析成对象
     *
     * @param t
     */
    public abstract void onSuccess(T t);
}
