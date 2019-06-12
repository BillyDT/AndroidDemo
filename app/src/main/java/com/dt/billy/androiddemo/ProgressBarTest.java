package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public class ProgressBarTest extends AppCompatActivity {

    //让程序模拟填充长度为100的数组
    private int[] data = new int[100];
    int hasData = 0;

    //记录ProgressBar的完成进度
    int status = 0;
    ProgressBar bar1, bar2;

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            //表明消息是由该程序发送的
            if (msg.what == 0x111) {
                bar1.setProgress(status);
                bar2.setProgress(status);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar_test);
        bar1 = findViewById(R.id.bar12_6_0);
        bar2 = findViewById(R.id.bar22_6_0);

        //启动线程来执行任务
        new Thread() {
            @Override
            public void run() {
                while (status < 100) {
                    //获取耗时操作的完成百分比
                    status = doWork();
                    //发送消息
                    handler.sendEmptyMessage(0x111);
                }
            }
        }.start();
    }

    //模拟一个耗时操作
    private int doWork() {
        //为数组元素赋值
        data[hasData++] = (int) (Math.random() * 100);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return hasData;
    }
}
