package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CheckButtonTest extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_button_test);

        RadioGroup rg = findViewById(R.id.rg2_3);
        tv = findViewById(R.id.show2_3);

        //为RadioGroup组件的OnCheckedChanged事件绑定事件监听器
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String tip = checkedId == R.id.male2_3 ? "您的性别是男" : "您的性别是女";
                tv.setText(tip);
            }
        });

    }
}
