package com.ming.mvpdemo.login;

/**
 * Created by temp on 2017/2/16.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUserNameError();

    void setPasswordError();

    void navigateToHome();
}
