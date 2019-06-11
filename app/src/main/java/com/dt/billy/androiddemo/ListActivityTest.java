package com.dt.billy.androiddemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ListActivityTest extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //无需使用布局文件
        String[] arr = {"孙悟空", "猪八戒", "牛魔王"};
        //创建ArrayAdapter对象
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout
                .simple_list_item_multiple_choice, arr);

        setListAdapter(arrayAdapter);

    }
}
