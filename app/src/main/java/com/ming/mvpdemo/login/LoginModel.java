package com.ming.mvpdemo.login;

/**
 * Created by temp on 2017/2/16.
 */

public interface LoginModel {
    void Login(String userName,String password,OnLoginFinishedListener listener);
}
