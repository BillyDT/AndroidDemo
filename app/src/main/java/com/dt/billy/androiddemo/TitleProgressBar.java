package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class TitleProgressBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置窗口特征：启用显示进度的进度条
        requestWindowFeature(Window.FEATURE_PROGRESS);
        //设置窗口特征：启用不显示进度的进度条
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setContentView(R.layout.activity_title_progress_bar);

        Button bt1 = findViewById(R.id.bn12_6_1);
        Button bt2 = findViewById(R.id.bn22_6_1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显示不带进度的进度条
                setProgressBarIndeterminateVisibility(true);
                //显示带进度的进度条
                setProgressBarVisibility(true);
                //设置进度条的进度
                setProgress(4500);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View source) {
                //隐藏不带进度的进度条
                setProgressBarIndeterminateVisibility(false);
                //隐藏带进度的进度条
                setProgressBarVisibility(false);
            }
        });
    }

}
