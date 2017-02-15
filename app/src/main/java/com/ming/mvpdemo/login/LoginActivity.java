package com.ming.mvpdemo.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.ming.mvpdemo.R;

public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {
    private ProgressBar progressBar;
    private EditText etUsername;
    private EditText etPassword;
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsername = (EditText) findViewById(R.id.tv_username);
        etPassword = (EditText) findViewById(R.id.tv_password);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        btLogin = (Button) findViewById(R.id.bt_login);
        btLogin.setOnClickListener(this);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUserNameError() {
        etUsername.setText(R.string.username_error);
    }

    @Override
    public void setPasswordError() {
        etUsername.setText(R.string.password_error);
    }

    @Override
    public void navigateToHome() {
        Toast.makeText(this,"success login",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {

    }
}
