package com.pkstudio.cpchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BlankActivity extends AppCompatActivity {

    private TextView usernameField;
    private TextView passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");

        usernameField = (TextView) findViewById(R.id.UsernameField);
        passwordField = (TextView) findViewById(R.id.PasswordField);

        usernameField.setText(username);
        passwordField.setText(password);
    }
}
