package com.dt.billy.androiddemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class BaseAdapterTest extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter_test);

        listView = findViewById(R.id.list2_5_2);

        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                //指定一共包含40个选项
                return 4000;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            //重写该方法，该方法的返回值将作为列表项的ID
            @Override
            public long getItemId(int position) {
                return position;
            }

            //重写该方法，该方法返回的View将作为列表框
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                //创建一个LinearLayout，并向其中添加两个组件
                LinearLayout line = new LinearLayout(BaseAdapterTest.this);
                line.setOrientation(LinearLayout.HORIZONTAL);
                ImageView image = new ImageView(BaseAdapterTest.this);
                image.setImageResource(R.mipmap.android_logo);
                TextView textView = new TextView(BaseAdapterTest.this);
                textView.setText("第" + (position + 1) + "个列表项！");
                textView.setTextSize(20);
                textView.setTextColor(Color.RED);
                
                line.addView(image);
                line.addView(textView);

                return line;
            }
        };
        listView.setAdapter(adapter);
    }
}
