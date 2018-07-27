package com.example.yoonjiyeon.homework_2;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_frg, new fragment1())
                        .commit();
                break;

            case R.id.btn2:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_frg, new fragment2())
                        .commit();
                break;

            case R.id.btn3:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_frg, new fragment3())
                        .commit();
                break;

            case R.id.btn4:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_frg, new main_fragment())
                        .commit();
                break;

        }
    }

}