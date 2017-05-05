package com.pkstudio.cpchat;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    private TextView appLabel;
    private EditText usernameField;
    private EditText passwordField;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_sign_in);

        appLabel = (TextView) findViewById(R.id.AppLabel);
        usernameField = (EditText) findViewById(R.id.UsernameField);
        passwordField = (EditText) findViewById(R.id.PasswordField);
        signInButton = (Button) findViewById(R.id.SignInButton);

    }

    public void signIn(View view) {
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();

        if (username.equals("") || password.equals("")) {
            Toast.makeText(SignInActivity.this, "Fields can't be empty", Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(getBaseContext(), BlankActivity.class);
            intent.putExtra("username", username);
            intent.putExtra("password", password);
            startActivity(intent);
        }
    }
}
