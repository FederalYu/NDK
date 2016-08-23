package com.yujun.ndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    static {
        //加载打包的so库
        System.loadLibrary("hello");
    }

    //定义一个本地方法，方法体由C语言实现
    public static native String getStringFromJni();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView.setText(getStringFromJni());
    }
}
