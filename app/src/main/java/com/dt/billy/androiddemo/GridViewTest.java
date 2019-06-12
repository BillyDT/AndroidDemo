package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridViewTest extends AppCompatActivity {

    GridView gridView;
    ImageView imageView;
    int[] imageIds = {
            R.drawable.bomb5, R.drawable.bomb6, R.drawable.bomb7,
            R.drawable.bomb8, R.drawable.bomb9, R.drawable.bomb10,
            R.drawable.bomb11, R.drawable.bomb12, R.drawable.bomb13,
            R.drawable.bomb14, R.drawable.bomb15, R.drawable.bomb16,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_test);

        List<Map<String, Object>> listItems = new ArrayList<>();
        for (int i = 0; i < imageIds.length; i++) {
            Map<String, Object> listItem = new HashMap<>();
            listItem.put("image", imageIds[i]);
            listItems.add(listItem);
        }

        imageView = findViewById(R.id.imageView2_5_4);
        gridView = findViewById(R.id.grid2_5_4);

        //创建一个SimpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.cell, new
                String[]{"image"}, new int[]{R.id.image_cell});

        gridView.setAdapter(adapter);

        gridView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imageView.setImageResource(imageIds[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                imageView.setImageResource(imageIds[position]);
            }
        });


    }
}
