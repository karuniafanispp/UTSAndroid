package com.example.asus.utsandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences SP = getApplicationContext().getSharedPreferences("NAME",0);
        text = (TextView)findViewById(R.id.myname);
        text.setText(SP.getString("Name", null));
    }
    public void CheckUser(){
        Boolean Check = Boolean.valueOf(UtilsClipcodes.readSharedSetting(MainActivity.this,"ClipCodes", "true"));
        Intent introIntent = new Intent(MainActivity.this, LoginActivity.class);
        introIntent.putExtra("ClipCodes", Check);

        if (Check){
            startActivity(introIntent);
        }
    }
}
