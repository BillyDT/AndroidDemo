package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class ToggleButtonTest extends AppCompatActivity {

    private ToggleButton tg;
    private Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);


        tg = findViewById(R.id.toggle2_3_6);
        sw = findViewById(R.id.switcher2_3_6);
        final LinearLayout ll = findViewById(R.id.test2_3_6);

        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //设置LinearLayout垂直布局
                    ll.setOrientation(LinearLayout.VERTICAL);
                    tg.setChecked(true);
                    sw.setChecked(true);
                } else {
                    ll.setOrientation(LinearLayout.HORIZONTAL);
                    tg.setChecked(false);
                    sw.setChecked(false);
                }
            }
        };
        tg.setOnCheckedChangeListener(listener);
        sw.setOnCheckedChangeListener(listener);
    }
}
