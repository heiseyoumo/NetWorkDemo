package com.fancy.network.callback;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public interface ICallback {
    void onSuccess(String response);

    void onFail(String errorMsg);
}
