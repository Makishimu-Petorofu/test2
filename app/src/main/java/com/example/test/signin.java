package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }

    public void onClickSignIn(View v) {

        Intent intent2 = new Intent(signin.this, signup.class);
        startActivity(intent2);

    }

    public void onClickVhod(View v) {
        EditText log = (EditText) findViewById(R.id.login);
        EditText pas = (EditText) findViewById(R.id.pass1);


        if (log.getText().toString().equals("serk") && pas.getText().toString().equals("123")) {
            Intent o = new Intent(signin.this, startscreen.class);
            startActivity(o);
            finish();

        } else {
            Toast.makeText(this, "Неправильно введен пароль или логин", Toast.LENGTH_SHORT).show();
        }
    }
}
