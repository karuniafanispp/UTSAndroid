package com.example.asus.utsandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText user, pass;
    Button login;
    @Override
    public void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.login_activity);
        user = (EditText)findViewById(R.id.username);
        pass = (EditText)findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            UtilsClipcodes.saveSharedSetting(LoginActivity.this, "MyClip", "True");
            UtilsClipcodes.SharedPreferesSAVE(getApplicationContext(),user.getText().toString());
            Intent ImLoggedIn = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(ImLoggedIn);
            finish();
            }
        });
    }

}
