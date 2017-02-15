package com.ming.mvpdemo.login;

/**
 * Created by temp on 2017/2/16.
 */
public interface OnLoginFinishedListener {
    void onSuccess();
    void onUserNameError();
    void onPasswordError();
}
