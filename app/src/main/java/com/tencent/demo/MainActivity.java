package com.tencent.demo;

import android.os.Bundle;

import com.tencent.wxstyle.WXTitleBarLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WXTitleBarLayout view = findViewById(R.id.wx_bar_layout);
        view.setTitle("南京国家电网");
    }
}