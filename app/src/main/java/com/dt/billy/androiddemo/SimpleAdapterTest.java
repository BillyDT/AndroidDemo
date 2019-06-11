package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapterTest extends AppCompatActivity {


    private String[] names = {"虎头", "弄玉", "李清照", "李白"};
    private String[] descs = {"可爱的小孩", "一个擅长音乐的女孩", "一个擅长文学的女性", "浪漫主义诗人"};
    private int[] imageIds = {
            R.drawable.tiger,
            R.drawable.nongyu,
            R.drawable.qingzhao,
            R.drawable.libai
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter_test);

        List<Map<String, Object>> listItems = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listItem = new HashMap<>();
            listItem.put("header", imageIds[i]);
            listItem.put("personName", names[i]);
            listItem.put("desc", descs[i]);
            listItems.add(listItem);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems, R.layout.simple_item,
                new String[]{"personName", "header", "desc"}, new int[]{R.id.name2_5_2, R.id
                .header2_5_2, R.id.desc2_5_2});

        ListView list = findViewById(R.id.mylist2_5_2);
        list.setAdapter(simpleAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SimpleAdapterTest.this, names[position] + "被单击了！", Toast
                        .LENGTH_SHORT).show();
            }
        });


        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(SimpleAdapterTest.this, names[position] + "被选中了！", Toast
                        .LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
