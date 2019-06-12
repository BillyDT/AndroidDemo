package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class AdapterViewFlipperTest extends AppCompatActivity {
    int[] imageIds = {
            R.drawable.shuangzi, R.drawable.shuangyu,
            R.drawable.chunv, R.drawable.tiancheng,
            R.drawable.tianxie, R.drawable.sheshou,
            R.drawable.juxie, R.drawable.shuiping,
            R.drawable.shizi, R.drawable.baiyang,
            R.drawable.jinniu, R.drawable.mojie
    };
    private AdapterViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_view_flipper_test);

        flipper = findViewById(R.id.flipper2_5_7);

        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return imageIds.length;
            }

            @Override
            public Object getItem(int position) {
                return position;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                ImageView imageView = new ImageView(AdapterViewFlipperTest.this);
                imageView.setImageResource(imageIds[position]);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                return imageView;
            }
        };
        flipper.setAdapter(adapter);
    }

    public void prev(View view) {
        flipper.showPrevious();
        flipper.stopFlipping();

    }

    public void next(View view) {
        flipper.showNext();
        flipper.stopFlipping();
    }

    public void auto(View view) {
        flipper.startFlipping();
    }

}
