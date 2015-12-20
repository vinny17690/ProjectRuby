package com.example.bunny.loginregeister;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends ActionBarActivity implements view.onClickListener {
    Button bLogin;
    EditText etUsername, etpassword;
    TextView tvregisterLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etpassword = (EditText) findViewById(R.id.etpassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        registerLink=(TextView) findViewById(R.id.tvRegisterLink);
        bLogin.setOnClickListener(this);
        tvregisterLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bLogin:

                break;
            case R.id.tvRegisterLink;
                startActivity(NewIntent(this,Register.class));
                break;
        }


    }
}



