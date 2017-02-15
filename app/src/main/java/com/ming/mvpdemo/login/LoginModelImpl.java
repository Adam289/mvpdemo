package com.ming.mvpdemo.login;

import android.os.Handler;

/**
 * Created by temp on 2017/2/16.
 */

public class LoginModelImpl implements LoginModel {
    @Override
    public void Login(final String userName, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if(userName.equals("")){
                    listener.onUserNameError();
                    error = true;
                }
                if(password.equals("")){
                    listener.onPasswordError();
                    error = true;
                }
                if(!error){
                    listener.onSuccess();
                }

            }
        },2000);
    }
}
