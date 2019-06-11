package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.QuickContactBadge;

public class QuickContactBadgeTest extends AppCompatActivity {

    QuickContactBadge badge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_contact_badge_test);

        badge = findViewById(R.id.badge2_4_3);
        //将QuickContactBadgezujian组件与特定电话号码对应的联系人建立关联
        badge.assignContactFromPhone("13186156739",false);

    }
}
