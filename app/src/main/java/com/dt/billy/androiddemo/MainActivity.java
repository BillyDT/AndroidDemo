package com.dt.billy.androiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Intent intent;
    ListView lv;

    String demoName[] = {
            "2.3.1不同颜色、字体、带连接的文本TextView",
            "2.3.1圆角边框、渐变背景的TextView",
            "2.3.2用户友好输入界面EditText",
            "2.3.3按钮、圆形按钮、带文字的图片按钮Button",
            "2.3.5利用单选钮(RadioButton)、复选框(CheckBox)获取用户信息",
            "2.3.6状态开关按钮(ToggleButton)和开关按钮(Switch)实现动态控制布局",
            "2.3.7时钟(AnalogClock和TextClock)实现手机里的“劳力士”",
            "2.3.8计时器(Chronometer)",
            "2.4.1图片浏览器(ImageView)",
            "2.4.2强大的图片按钮(ImageButton—>ZoomButton)",
            "2.4.3使用QuickContactBadge关联联系人",
            "2.5.1改变分隔条、基于数组的ListView",
            "2.5.2使用ArrayAdapter创建ListView",
            "2.5.2基于ListActivity实现ListView",
            "2.5.2使用SimpleAdapter创建ListView",
            "2.5.2扩展BaseAdapter实现不存储列表项的ListView",
            "2.5.3自动完成文本框(AutoCompleteTextView)",
            "2.5.4带预览的图片浏览器(GridView)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.item, demoName);

        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent = new Intent(MainActivity.this, TextViewTest.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(MainActivity.this, TextViewTest2.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(MainActivity.this, InputUI.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity.this, ButtonTest.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(MainActivity.this, CheckButtonTest.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(MainActivity.this, ToggleButtonTest.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(MainActivity.this, ClockTest.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(MainActivity.this, ChronometerTest.class);
                startActivity(intent);
                break;
            case 8:
                intent = new Intent(MainActivity.this, ImageViewTest.class);
                startActivity(intent);
                break;
            case 9:
                intent = new Intent(MainActivity.this, ImageButtonTest.class);
                startActivity(intent);
                break;
            case 10:
                intent = new Intent(MainActivity.this, QuickContactBadgeTest.class);
                startActivity(intent);
                break;
            case 11:
                intent = new Intent(MainActivity.this, SimpleListViewTest.class);
                startActivity(intent);
                break;
            case 12:
                intent = new Intent(MainActivity.this, ArrayAdapterTest.class);
                startActivity(intent);
                break;
            case 13:
                intent = new Intent(MainActivity.this, ListActivityTest.class);
                startActivity(intent);
                break;
            case 14:
                intent = new Intent(MainActivity.this, SimpleAdapterTest.class);
                startActivity(intent);
                break;
            case 15:
                intent = new Intent(MainActivity.this, BaseAdapterTest.class);
                startActivity(intent);
                break;
            case 16:
                intent = new Intent(MainActivity.this, AutoCompleteTextViewTest.class);
                startActivity(intent);
                break;
            case 17:
                intent = new Intent(MainActivity.this, GridViewTest.class);
                startActivity(intent);
                break;
            default:
                Toast.makeText(this, "未初始化!", Toast.LENGTH_SHORT).show();

        }
    }
}
