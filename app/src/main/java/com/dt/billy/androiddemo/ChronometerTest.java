package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class ChronometerTest extends AppCompatActivity {

    Chronometer ch;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chronometer_test);

        //获取计时器组件
        ch = findViewById(R.id.ch2_3_8);
        //按钮
        start = findViewById(R.id.start2_3_8);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //设置开始计时时间
                ch.setBase(SystemClock.elapsedRealtime());
                //启动计时
                ch.start();
                start.setEnabled(false);
            }
        });

        //为Chronometer绑定事件监听器
        ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if (SystemClock.elapsedRealtime() - ch.getBase() > 10 * 1000) {
                    ch.stop();
                    start.setEnabled(true);
                }
            }
        });

    }
}
