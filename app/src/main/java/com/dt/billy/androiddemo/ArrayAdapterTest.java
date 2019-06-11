package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArrayAdapterTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter_test);

        ListView lv1 = findViewById(R.id.lv12_5_2);
        ListView lv2 = findViewById(R.id.lv22_5_2);

        String[] arr1 = {"孙悟空", "猪八戒", "牛魔王"};
        String[] arr2 = {"Java", "Android", "Spring", "Html"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.array_item, arr1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.checked_item, arr2);

        lv1.setAdapter(adapter1);
        lv2.setAdapter(adapter2);
    }
}
